package com.scu.Entity.ManagerEntity.CRZEntity;

public class Notification {
    private Integer noticeID;
    private String noticeTitle;
    private String noticeInfo;
    private String noticeTime;
    private String notifier;

    public Notification() {}

    public Notification(String noticeTitle, String noticeInfo, String noticeTime, String notifier) {
        this.noticeTitle = noticeTitle;
        this.noticeInfo = noticeInfo;
        this.noticeTime = noticeTime;
        this.notifier = notifier;
    }

    public int getNoticeID() {
        return noticeID;
    }

    public void setNoticeID(int noticeID) {
        this.noticeID = noticeID;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeInfo() {
        return noticeInfo;
    }

    public void setNoticeInfo(String noticeInfo) {
        this.noticeInfo = noticeInfo;
    }

    public String getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getNotifier() {
        return notifier;
    }

    public void setNotifier(String notifier) {
        this.notifier = notifier;
    }
}
