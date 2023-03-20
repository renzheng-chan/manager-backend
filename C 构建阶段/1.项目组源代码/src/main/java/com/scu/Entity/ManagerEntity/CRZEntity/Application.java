package com.scu.Entity.ManagerEntity.CRZEntity;

import com.scu.Entity.Score;

public class Application {
    private int approvalID;
    private Integer applicantID;
    private String applicationTitle;
    private String applicationContent;
    private String applicationTime;
    private String applicantName;
    private String approvalState;
    private String approvalResults;
    private String approvalTime;
    private String approver;

    public Application() {}

    public Application(Integer applicantID, String applicationTitle, String applicationContent, String applicationTime, String applicantName, String approvalState) {
        this.applicantID = applicantID;
        this.applicationTitle = applicationTitle;
        this.applicationContent = applicationContent;
        this.applicationTime = applicationTime;
        this.applicantName = applicantName;
        this.approvalState = approvalState;
    }

    public Application(Integer applicationID, String approvalResult, String approvalTime, String approver) {
        this.applicantID = applicationID;
        this.approvalResults = approvalResults;
        this.approvalTime = approvalTime;
        this.approver = approver;
    }

    public int getApprovalID() {
        return approvalID;
    }

    public void setApprovalID(int approvalID) {
        this.approvalID = approvalID;
    }

    public Integer getApplicationID() {
        return applicantID;
    }

    public void setApplicationID(Integer applicationID) {
        this.applicantID = applicationID;
    }

    public String getApplicationTitle() {
        return applicationTitle;
    }

    public void setApplicationTitle(String applicationTitle) {
        this.applicationTitle = applicationTitle;
    }

    public String getApplicationContent() {
        return applicationContent;
    }

    public void setApplicationContent(String applicationContent) {
        this.applicationContent = applicationContent;
    }

    public String getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(String applicationTime) {
        this.applicationTime = applicationTime;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(String approvalState) {
        this.approvalState = approvalState;
    }

    public String getApprovalResults() {
        return approvalResults;
    }

    public void setApprovalResults(String approvalResult) {
        this.approvalResults = approvalResult;
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }
}
