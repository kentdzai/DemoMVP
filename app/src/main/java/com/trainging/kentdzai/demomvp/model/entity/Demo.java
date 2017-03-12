package com.trainging.kentdzai.demomvp.model.entity;

/**
 * Created by kentdzai on 12/03/2017.
 */

public class Demo {
    private String title;
    private String msg;

    public Demo(String title, String msg) {
        this.title = title;
        this.msg = msg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
