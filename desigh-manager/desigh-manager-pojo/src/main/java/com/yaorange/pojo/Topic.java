package com.yaorange.pojo;

import java.io.Serializable;

public class Topic implements Serializable {
    private Integer id;

    private String course;

    private String stemName;

    private String knowpoint;

    private String answer;

    private Integer number;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getStemName() {
        return stemName;
    }

    public void setStemName(String stemName) {
        this.stemName = stemName == null ? null : stemName.trim();
    }

    public String getKnowpoint() {
        return knowpoint;
    }

    public void setKnowpoint(String knowpoint) {
        this.knowpoint = knowpoint == null ? null : knowpoint.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}