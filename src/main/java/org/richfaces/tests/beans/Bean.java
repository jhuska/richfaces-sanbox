package org.richfaces.tests.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author <a href="mailto:jhuska@redhat.com">Juraj Huska</a>
 */
@ManagedBean
@RequestScoped
public class Bean {

    private String value;
    private boolean isUploadEnabled = true;
    private List<String> items;
    
    @PostConstruct
    public void initializeItems() {
        items = new ArrayList<String>();
        items.add("first - does not enable");
        items.add("second - enable!");
        items.add("third - does not enable");
    }
    
    public void enableUpload() {
        System.out.println("Listener called!");
        if(value != null && value.equals("second - enable!")) {
            isUploadEnabled = false;
            System.out.println("Upload enabled!");
        } else {
            System.out.println("Nothing enabled!");
        }
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public boolean isIsUploadEnabled() {
        return isUploadEnabled;
    }

    public void setIsUploadEnabled(boolean isUploadEnabled) {
        this.isUploadEnabled = isUploadEnabled;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
