package vn.codegym.kt_2.service.Impl;

import vn.codegym.kt_2.model.QuestionContent;
import vn.codegym.kt_2.model.QuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.kt_2.repository.IQuestionContentRepository;
import vn.codegym.kt_2.service.IQuestionContentService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionContentService implements IQuestionContentService {

    @Autowired
    private IQuestionContentRepository questionContentRepository;

    public Page<QuestionContent> find(String key, String value, Pageable pageable) {
        switch (key.toLowerCase()) {
            case "name":
                return null;
            case "gender":
                return null;
            default:
                return null;
        }
    }

    @Override
    public Page<QuestionType> findAll(Pageable pageable) {
        return questionContentRepository.findAll(pageable);
    }

    @Override
    public List<QuestionType> findAll() {
        return questionContentRepository.findAll();
    }

    @Override
    public void delete(int id) {
        questionContentRepository.deleteById(id);
    }

    @Override
    public void create(QuestionContent questionContent) {
        questionContentRepository.save(questionContent);
    }

    @Override
    public void edit(QuestionContent questionContent) {
        questionContentRepository.save(questionContent);
    }

    @Override
    public Optional<QuestionContent> findById(int id) {
        return questionContentRepository.findById(id);
    }
}
