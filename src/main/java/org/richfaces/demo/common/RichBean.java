package org.richfaces.demo.common;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class RichBean implements Serializable {

    private static final long serialVersionUID = -6239437588285327644L;

    private String name;

    @PostConstruct
    public void postContruct() {
        name = "John";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
