package Case_study.Services.impl;

import Case_study.Libs.impl.FuramaRepository;
import Case_study.Services.Service;

public class FuramaService implements Service {
    private static final FuramaRepository furamaRepository = new FuramaRepository();
    @Override
    public void displayMenu() {
        furamaRepository.displayMenu();
    }

    @Override
    public void addEmployee() {

    }
}
