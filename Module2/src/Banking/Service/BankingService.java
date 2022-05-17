package Banking.Service;

import Banking.Model.Account;
import Banking.Model.SavingAccount;
import Banking.Model.TinDungAccount;
import Banking.Util.ConstantUtil1;
import Banking.Util.FileHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankingService {
    private List<Account> accounts = new ArrayList<>();
    private FileHelper fileHelper = new FileHelper();

    public BankingService() {
        accounts = mapToAccount();
    }

    public void create(Account account) {
        int lastId = 0;
        if (accounts.size() > 0) {
            lastId = accounts.get(accounts.size() - 1).getId();
        }

        account.setId(lastId + 1);
        accounts.add(account);
        fileHelper.write(ConstantUtil1.path, Collections.singletonList(account), true);
    }

    private List mapToAccount() {
        List result = new ArrayList();

        List<String> lines = fileHelper.read(ConstantUtil1.path);
        for (String line : lines) {
            String[] tmp = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String name = tmp[1];
            String phone = tmp[2];
            String birthday = tmp[3];
            double sodu = Double.parseDouble(tmp[4]);
            String chiNhanh = tmp[5];


            if (tmp[8].equals("SavingAccount")) {
                String stk = tmp[6];
                String status = tmp[7];
                result.add(new SavingAccount(id, name, phone, birthday, sodu, chiNhanh, stk, status));
            } else {
                String soThe = tmp[6];
                String maPin = tmp[7];
                result.add(new TinDungAccount(id, name, phone, birthday, sodu, chiNhanh, soThe, maPin));
            }
        }

        return result;
    }

    public List FindAll() {
        return accounts;
    }

    public void delete(int id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                accounts.remove(i);
                fileHelper.write(ConstantUtil1.path, accounts, false);
                return;
            }
        }
    }
}
