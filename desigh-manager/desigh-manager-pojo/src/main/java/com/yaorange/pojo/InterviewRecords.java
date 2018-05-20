package com.yaorange.pojo;

import java.io.Serializable;
import java.util.Date;

public class InterviewRecords implements Serializable {
    private Long id;

    private Integer studentid;

    private String interviewcompany;

    private String interviewplace;

    private String contacts;

    private String contactsphone;

    private Date interviewtime;

    private static final long serialVersionUID = 1L;
    

    private String studentno;

    private String studentname;
    
    private String classname;
    
    

	public String getStudentno() {
		return studentno;
	}

	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getInterviewcompany() {
        return interviewcompany;
    }

    public void setInterviewcompany(String interviewcompany) {
        this.interviewcompany = interviewcompany == null ? null : interviewcompany.trim();
    }

    public String getInterviewplace() {
        return interviewplace;
    }

    public void setInterviewplace(String interviewplace) {
        this.interviewplace = interviewplace == null ? null : interviewplace.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getContactsphone() {
        return contactsphone;
    }

    public void setContactsphone(String contactsphone) {
        this.contactsphone = contactsphone == null ? null : contactsphone.trim();
    }

    public Date getInterviewtime() {
        return interviewtime;
    }

    public void setInterviewtime(Date interviewtime) {
        this.interviewtime = interviewtime;
    }
}