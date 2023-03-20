package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Approval)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:36:24
 */
public class Approval implements Serializable {
    private static final long serialVersionUID = 536007121430837815L;
    
    private Integer approvalid;
    
    private String applicationcontent;
    
    private String applicationtime;
    
    private Integer applicantid;
    
    private String applicantname;
    
    private String approvalresults;
    
    private String approvaltime;
    
    private String approvalstate;
    
    private Integer approver;


    public Integer getApprovalid() {
        return approvalid;
    }

    public void setApprovalid(Integer approvalid) {
        this.approvalid = approvalid;
    }

    public String getApplicationcontent() {
        return applicationcontent;
    }

    public void setApplicationcontent(String applicationcontent) {
        this.applicationcontent = applicationcontent;
    }

    public String getApplicationtime() {
        return applicationtime;
    }

    public void setApplicationtime(String applicationtime) {
        this.applicationtime = applicationtime;
    }

    public Integer getApplicantid() {
        return applicantid;
    }

    public void setApplicantid(Integer applicantid) {
        this.applicantid = applicantid;
    }

    public String getApplicantname() {
        return applicantname;
    }

    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname;
    }

    public String getApprovalresults() {
        return approvalresults;
    }

    public void setApprovalresults(String approvalresults) {
        this.approvalresults = approvalresults;
    }

    public String getApprovaltime() {
        return approvaltime;
    }

    public void setApprovaltime(String approvaltime) {
        this.approvaltime = approvaltime;
    }

    public String getApprovalstate() {
        return approvalstate;
    }

    public void setApprovalstate(String approvalstate) {
        this.approvalstate = approvalstate;
    }

    public Integer getApprover() {
        return approver;
    }

    public void setApprover(Integer approver) {
        this.approver = approver;
    }

}

