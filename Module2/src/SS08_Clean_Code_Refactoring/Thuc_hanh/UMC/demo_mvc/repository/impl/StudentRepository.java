package SS08_Clean_Code_Refactoring.Thuc_hanh.UMC.demo_mvc.repository.impl;

import SS08_Clean_Code_Refactoring.Thuc_hanh.UMC.demo_mvc.model.Student;
import SS08_Clean_Code_Refactoring.Thuc_hanh.UMC.demo_mvc.repository.IStudentRepository;

public class StudentRepository implements IStudentRepository {
    private static Student[] students = new Student[1000];
    private static int numberPeopleOfCompany = 0;

    @Override
    public void saveStudent(Student student) {
        students[numberPeopleOfCompany] = student;
        numberPeopleOfCompany++;
    }

    @Override
    public void deleteStudent(Student student) {
        for (int i = 0; i < numberPeopleOfCompany; i++) {
            if (students[i] == student) {
                students[i] = null;
                numberPeopleOfCompany--;
                break;
            }
        }
    }
}
