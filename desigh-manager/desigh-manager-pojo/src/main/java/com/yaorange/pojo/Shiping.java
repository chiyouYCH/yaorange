package com.yaorange.pojo;

import java.io.Serializable;
import java.util.Date;

public class Shiping implements Serializable {
    private Integer id;

    private String title;

    private String fn;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn == null ? null : fn.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}