package com.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.richfaces.event.DropEvent;
import org.richfaces.event.DropListener;

import com.test.DataBean.DragValue;

@RequestScoped
@ManagedBean(name = "dropListenerBean")
public class DropListenerBean implements DropListener {
    
    @ManagedProperty(value = "#{dataBean}")
    private DataBean dataBean;

    public void setDataBean(DataBean dataBean) {
        this.dataBean = dataBean;
    }

    public void processDrop(DropEvent event) {
        dataBean.moveDragValue((DragValue) event.getDragValue());
    }
}

