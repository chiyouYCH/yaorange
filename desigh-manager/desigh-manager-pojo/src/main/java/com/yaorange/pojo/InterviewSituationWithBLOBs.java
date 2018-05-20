package com.yaorange.pojo;

import java.io.Serializable;

public class InterviewSituationWithBLOBs extends InterviewSituation implements Serializable {
    private String writtenexamination;

    private String interviewexamination;

    private String interviewfeedback;

    private static final long serialVersionUID = 1L;

    public String getWrittenexamination() {
        return writtenexamination;
    }

    public void setWrittenexamination(String writtenexamination) {
        this.writtenexamination = writtenexamination == null ? null : writtenexamination.trim();
    }

    public String getInterviewexamination() {
        return interviewexamination;
    }

    public void setInterviewexamination(String interviewexamination) {
        this.interviewexamination = interviewexamination == null ? null : interviewexamination.trim();
    }

    public String getInterviewfeedback() {
        return interviewfeedback;
    }

    public void setInterviewfeedback(String interviewfeedback) {
        this.interviewfeedback = interviewfeedback == null ? null : interviewfeedback.trim();
    }
}