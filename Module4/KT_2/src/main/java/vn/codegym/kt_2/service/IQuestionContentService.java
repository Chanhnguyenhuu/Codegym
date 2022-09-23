package vn.codegym.kt_2.service;

import vn.codegym.kt_2.model.QuestionContent;
import vn.codegym.kt_2.model.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IQuestionContentService {

    Page<QuestionType> findAll(Pageable pageable);
    List<QuestionType> findAll();
    void delete(int id);
    void create(QuestionContent questionContent);
    void edit(QuestionContent questionContent);
    Optional<QuestionContent> findById(int id);
}
