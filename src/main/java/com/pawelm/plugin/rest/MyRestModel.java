package com.pawelm.plugin.rest;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class MyRestModel {

    @XmlElement(name = "value")
    private String message;

    public MyRestModel() {
    }

    public MyRestModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}