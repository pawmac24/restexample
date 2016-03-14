package com.pawelm.plugin.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xxx")
@XmlAccessorType(XmlAccessType.FIELD)
public class SecondModel {

    @XmlElement(name = "value")
    private String message;

    public SecondModel() {
    }

    public SecondModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}