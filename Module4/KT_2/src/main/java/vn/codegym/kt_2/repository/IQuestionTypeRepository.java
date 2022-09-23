package vn.codegym.kt_2.repository;

import vn.codegym.kt_2.model.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionTypeRepository extends JpaRepository<Que, Integer> {
}
