package com.yaorange.pojo;

import java.io.Serializable;

public class Knowpoint implements Serializable {
    private Integer knowpointiId;

    private String knowpointName;

    private String courseName;

    private static final long serialVersionUID = 1L;

    public Integer getKnowpointiId() {
        return knowpointiId;
    }

    public void setKnowpointiId(Integer knowpointiId) {
        this.knowpointiId = knowpointiId;
    }

    public String getKnowpointName() {
        return knowpointName;
    }

    public void setKnowpointName(String knowpointName) {
        this.knowpointName = knowpointName == null ? null : knowpointName.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }
}