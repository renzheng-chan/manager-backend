package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Notice)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:38:08
 */
public class Notice implements Serializable {
    private static final long serialVersionUID = -87386439590573340L;
    
    private Integer noticeid;
    
    private String noticeinfo;
    
    private String noticetime;
    
    private String noticetitle;
    
    private String notifier;


    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getNoticeinfo() {
        return noticeinfo;
    }

    public void setNoticeinfo(String noticeinfo) {
        this.noticeinfo = noticeinfo;
    }

    public String getNoticetime() {
        return noticetime;
    }

    public void setNoticetime(String noticetime) {
        this.noticetime = noticetime;
    }

    public String getNoticetitle() {
        return noticetitle;
    }

    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle;
    }

    public String getNotifier() {
        return notifier;
    }

    public void setNotifier(String notifier) {
        this.notifier = notifier;
    }

}

