package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DataBean {
    private List<DragValue> dragValues = new ArrayList<DragValue>();
    private List<DragValue> dropValues = new ArrayList<DragValue>();
    
    private String dragValue1 = "dragValue 1";
    private String dragValue2 = "dragValue 2";
    private String dragValue3 = "dragValue 3";
    private String acceptedTypes = "drg1, drg2";
    private String phaseId = "none";
    private boolean immediate = false;
    private boolean bypassUpdates = false;
    private Object execute;
    private String executeTest = "none";
    
    public void moveDragValue(DragValue dragValue) {
        dragValues.remove(dragValue);
        dropValues.add(dragValue);
    }

    public class DragValue {
        private String value;
        private String type;

        public DragValue(String value, String type) {
            this.setValue(value);
            this.setType(type);
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + ((type == null) ? 0 : type.hashCode());
            result = prime * result + ((value == null) ? 0 : value.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            DragValue other = (DragValue) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (type == null) {
                if (other.type != null)
                    return false;
            } else if (!type.equals(other.type))
                return false;
            if (value == null) {
                if (other.value != null)
                    return false;
            } else if (!value.equals(other.value))
                return false;
            return true;
        }

        private DataBean getOuterType() {
            return DataBean.this;
        }
        
        
    }

    @PostConstruct
    public void init() {
        dragValues.add(new DragValue(dragValue1, "drg1"));
        dragValues.add(new DragValue(dragValue2, "drg2"));
        dragValues.add(new DragValue(dragValue3, "drg3"));
    }

    public String getExecuteTest() {
        return executeTest;
    }

    public void setExecuteTest(String executeTest) {
        this.executeTest = executeTest;
    }

    public Object getExecute() {
        return execute;
    }

    public void setExecute(Object execute) {
        this.execute = execute;
    }

    public boolean isImmediate() {
        return immediate;
    }

    public void setImmediate(boolean immediate) {
        this.immediate = immediate;
    }

    public boolean isBypassUpdates() {
        return bypassUpdates;
    }

    public void setBypassUpdates(boolean bypassUpdates) {
        this.bypassUpdates = bypassUpdates;
    }

    public String getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(String phaseId) {
        this.phaseId = phaseId;
    }

    public List<DragValue> getDragValues() {
        return dragValues;
    }

    public String getDragValue1() {
        return dragValue1;
    }

    public void setDragValue1(String dragValue1) {
        this.dragValue1 = dragValue1;
    }

    public String getDragValue2() {
        return dragValue2;
    }

    public void setDragValue2(String dragValue2) {
        this.dragValue2 = dragValue2;
    }

    public String getDragValue3() {
        return dragValue3;
    }

    public void setDragValue3(String dragValue3) {
        this.dragValue3 = dragValue3;
    }

    public void setDragValues(List<DragValue> dragValues) {
        this.dragValues = dragValues;
    }

    public String getAcceptedTypes() {
        return acceptedTypes;
    }

    public void setAcceptedTypes(String acceptedTypes) {
        this.acceptedTypes = acceptedTypes;
    }

    public List<DragValue> getDropValues() {
        return dropValues;
    }

    public void setDropValues(List<DragValue> dropValues) {
        this.dropValues = dropValues;
    }
}
