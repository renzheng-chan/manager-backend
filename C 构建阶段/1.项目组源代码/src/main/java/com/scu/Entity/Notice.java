package com.scu.Entity;

public class Notice {
    private int noticeID;
    private String noticeInfo;
    private String noticeTime;
    private String noticeTitle;
    private String notifier;

    public int getNoticeID() {
        return noticeID;
    }

    public String getNoticeInfo() {
        return noticeInfo;
    }

    public String getNoticeTime() {
        return noticeTime;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public String getNotifier() {
        return notifier;
    }

    public void setNoticeID(int noticeID) {
        this.noticeID = noticeID;
    }

    public void setNoticeInfo(String noticeInfo) {
        this.noticeInfo = noticeInfo;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public void setNotifier(String notifier) {
        this.notifier = notifier;
    }

    @Override
    public String toString() {
        return "{"+this.noticeID+"，"+this.noticeInfo+"，"+this.noticeTime+"，"+this.noticeTitle+"，"+this.notifier+"}";
    }
}
