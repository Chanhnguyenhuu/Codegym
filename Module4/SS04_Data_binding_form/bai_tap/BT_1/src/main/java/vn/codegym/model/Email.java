package vn.codegym.model;

public class Email {
    private String language;
    private int page_size;
    private boolean filter;
    private String signature;

    public Email() {
    }

    public Email(String language, int page_size, boolean filter, String signature) {
        this.language = language;
        this.page_size = page_size;
        this.filter = filter;
        this.signature = signature;
    }

    public Email(String language, int page_size, boolean filter) {
        this.language = language;
        this.page_size = page_size;
        this.filter = filter;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
