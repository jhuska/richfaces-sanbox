package org.richfaces.tests.sandbox;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TestBean implements Serializable {

    List<String> items = new ArrayList<String>();

    public TestBean() {
        items.add(String.valueOf(Math.random()));
        items.add(String.valueOf(Math.random()));
        items.add(String.valueOf(Math.random()));
    }

    public void addItem() {
        items.add(String.valueOf(Math.random()));
    }

    public List<String> getItems() {
        return items;
    }
}
