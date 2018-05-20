package com.yaorange.pojo;

import java.io.Serializable;
import java.util.Date;

public class EmploymentSituation implements Serializable {
    private Long id;

    private Integer studentid;

    private String company;

    private String place;

    private String contacts;

    private String contactsphone;

    private Date jointime;

    private Integer applicablewages;

    private Integer formalwages;

    private String offer;

    private static final long serialVersionUID = 1L;
    
    private String studentno;

    private String studentname;
    
    private String classname;
    
    private String welfare;

    private String remark;

    public String getWelfare() {
		return welfare;
	}

	public void setWelfare(String welfare) {
		this.welfare = welfare;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
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

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Integer getApplicablewages() {
        return applicablewages;
    }

    public void setApplicablewages(Integer applicablewages) {
        this.applicablewages = applicablewages;
    }

    public Integer getFormalwages() {
        return formalwages;
    }

    public void setFormalwages(Integer formalwages) {
        this.formalwages = formalwages;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer == null ? null : offer.trim();
    }
}