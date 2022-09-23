package vn.codegym.kt_2.repository;

import vn.codegym.kt_2.model.QuestionContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionContentRepository extends JpaRepository<Question, Integer> {
}
