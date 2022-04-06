package SS08_Clean_Code_Refactoring.Thuc_hanh.UMC.demo_mvc.service.impl;

import SS08_Clean_Code_Refactoring.Thuc_hanh.UMC.demo_mvc.model.Student;
import SS08_Clean_Code_Refactoring.Thuc_hanh.UMC.demo_mvc.repository.IStudentRepository;
import SS08_Clean_Code_Refactoring.Thuc_hanh.UMC.demo_mvc.repository.impl.StudentRepository;
import SS08_Clean_Code_Refactoring.Thuc_hanh.UMC.demo_mvc.service.IStudentService;

public class StudentService implements IStudentService {
    private static IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void addStudent(Student student) {
        if (student.getPoint() < 0) {

        } else {
            iStudentRepository.saveStudent(student);
        }
    }

    @Override
    public void deleteStudent(Student student) {
        iStudentRepository.deleteStudent(student);
    }
}
