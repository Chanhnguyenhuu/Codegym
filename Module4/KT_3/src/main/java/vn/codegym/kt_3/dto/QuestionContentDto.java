package vn.codegym.kt_3.dto;

import vn.codegym.kt_3.model.QuestionType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class QuestionContentDto {
    private int id;
    @NotBlank
    @Size(min = 5, max = 100)
    private String title;
    @NotBlank
    @Size(min = 10, max = 500)
    private String content;
    @NotBlank
    private String answer;
    @NotBlank
    private String dateCreate;
    @NotBlank
    private boolean status;
    @NotBlank
    private QuestionType questionType;

    public QuestionContentDto() {
    }

    public QuestionContentDto(int id, String title, String content, String answer, String dateCreate, boolean status, QuestionType questionType) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.answer = answer;
        this.dateCreate = dateCreate;
        this.status = status;
        this.questionType = questionType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
