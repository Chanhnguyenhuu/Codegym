package Case_study.Libs.impl;

import Case_study.Libs.IsFacilityRepository;

public class FacilityRepository implements IsFacilityRepository {

    @Override
    public void display() {
        System.out.println("Facility Management ");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance ");
        System.out.println("4. Return main menu");

    }
}
