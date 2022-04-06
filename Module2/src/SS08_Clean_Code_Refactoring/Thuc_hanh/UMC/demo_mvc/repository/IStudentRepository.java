package SS08_Clean_Code_Refactoring.Thuc_hanh.UMC.demo_mvc.repository;

import SS08_Clean_Code_Refactoring.Thuc_hanh.UMC.demo_mvc.model.Student;

public interface IStudentRepository {
    void saveStudent(Student student);
    void deleteStudent(Student student);
}

