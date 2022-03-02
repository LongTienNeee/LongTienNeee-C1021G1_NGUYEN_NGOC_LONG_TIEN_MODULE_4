package model;

public class Mail {
    private String language;
    private int pageSize;
    boolean spamsFilter;
    String signature;

    public Mail(){}

    public Mail(String language, int pageSize, boolean spamFiller, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamsFilter = spamFiller;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(boolean spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
