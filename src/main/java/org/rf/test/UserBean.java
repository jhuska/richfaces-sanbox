/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.rf.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jhuska
 */
@ManagedBean
@RequestScoped
public class UserBean {
    
    private String name;
    private static int counter = 0;
    
    public String someAction() {
        this.name = "hahahaha altered " + counter++;
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
