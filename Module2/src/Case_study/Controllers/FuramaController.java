package Case_study.Controllers;

import Case_study.Services.impl.FuramaService;

public class FuramaController {
    private static final FuramaService furamaService = new FuramaService();
    public void displayMainMenu() {
        furamaService.displayMenu();
    }

}
