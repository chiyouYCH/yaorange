package com.yaorange.pojo;

import java.io.Serializable;

public class InterviewSituation implements Serializable {
    private Long id;

    private Integer studentid;

    private String interviewcompany;

    private String enclosure1;

    private String enclosure2;

    private String soundrecording;
    
    private String studentno;

    private String studentname;
    
    private String classname;
    
    private String writtenexamination;

    private String interviewexamination;

    private String interviewfeedback;
    
    
    
    

    public String getWrittenexamination() {
		return writtenexamination;
	}

	public void setWrittenexamination(String writtenexamination) {
		this.writtenexamination = writtenexamination;
	}

	public String getInterviewexamination() {
		return interviewexamination;
	}

	public void setInterviewexamination(String interviewexamination) {
		this.interviewexamination = interviewexamination;
	}

	public String getInterviewfeedback() {
		return interviewfeedback;
	}

	public void setInterviewfeedback(String interviewfeedback) {
		this.interviewfeedback = interviewfeedback;
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

	private static final long serialVersionUID = 1L;

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

    public String getEnclosure1() {
        return enclosure1;
    }

    public void setEnclosure1(String enclosure1) {
        this.enclosure1 = enclosure1 == null ? null : enclosure1.trim();
    }

    public String getEnclosure2() {
        return enclosure2;
    }

    public void setEnclosure2(String enclosure2) {
        this.enclosure2 = enclosure2 == null ? null : enclosure2.trim();
    }

    public String getSoundrecording() {
        return soundrecording;
    }

    public void setSoundrecording(String soundrecording) {
        this.soundrecording = soundrecording == null ? null : soundrecording.trim();
    }
}