package com.yaorange.pojo;

import java.io.Serializable;

public class EmploymentSituationWithBLOBs extends EmploymentSituation implements Serializable {
    private String welfare;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare == null ? null : welfare.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}