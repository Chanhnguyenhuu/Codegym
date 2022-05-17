package Case_study.Libs.impl;

import Case_study.Libs.IsFuramaRepository;

public class FuramaRepository implements IsFuramaRepository {

    @Override
    public void displayMenu() {
        System.out.println("Chào mừng bạn đến với khu nghỉ dưỡng Furama");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management ");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }
}
