package Banking.Model;

public class SavingAccount extends Account {
    private String stk;
    private String status;

    public SavingAccount() {
    }

    public SavingAccount(String stk, String status) {
        this.stk = stk;
        this.status = status;
    }

    public SavingAccount(int id, String name, String phone, String birthDay, double sodu, String chiNhanh, String stk, String status) {
        super(id, name, phone, birthDay, sodu, chiNhanh);
        this.stk = stk;
        this.status = status;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + stk + "," + status + "," +getClass().getSimpleName();
    }
}
