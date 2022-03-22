package com.codegym.model;

public class EmailSetting {

    public static String[] availableLanguages = {"English", "Vietnammese", "Japanese", "Chinese"};
    public static int[] availablePageSize = {5, 10, 15, 20, 50, 100};

    private String language;
    private int pageSize;
    private boolean spamFilter;
    private String signature;

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

    public boolean isSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public EmailSetting() {
    }

    public EmailSetting(String language, int pageSize, boolean spamFilter, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }
}
