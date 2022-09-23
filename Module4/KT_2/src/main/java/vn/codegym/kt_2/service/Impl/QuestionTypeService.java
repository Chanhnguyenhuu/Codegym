package vn.codegym.kt_2.service.Impl;

import vn.codegym.kt_2.model.QuestionContent;
import vn.codegym.kt_2.model.QuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.kt_2.repository.IQuestionTypeRepository;
import vn.codegym.kt_2.service.IQuestionContentService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionTypeService implements IQuestionContentService {

    @Autowired
    private IQuestionTypeRepository questionTypeRepository;

    @Override
    public Page<QuestionType> findAll(Pageable pageable) {
        return questionTypeRepository.findAll(pageable);
    }

    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }

    @Override
    public void delete(int id) {
        questionTypeRepository.deleteById(id);
    }

    @Override
    public void create(QuestionContent questionContent) {

    }

    @Override
    public void edit(QuestionContent questionContent) {

    }

    @Override
    public Optional<QuestionContent> findById(int id) {
        return Optional.empty();
    }
}
