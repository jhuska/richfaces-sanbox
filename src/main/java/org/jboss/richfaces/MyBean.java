package org.jboss.richfaces;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MyBean {

    private List<String> departments;

    private List<TableItem> tableItems;

    public List<TableItem> getTableItems() {
        System.out.println("get table items called!");

        tableItems = new ArrayList<TableItem>();
        tableItems.add(new TableItem("asdasd", "asdasd"));
        tableItems.add(new TableItem("asdasd", "xcvxcv"));
        tableItems.add(new TableItem("asdasd", "werwer"));
        tableItems.add(new TableItem("asdasd", "yutyu"));
        tableItems.add(new TableItem("asdasd", "ghfgh"));
        tableItems.add(new TableItem("asdasd", "7756567"));
        tableItems.add(new TableItem("asdasd", "sdfsdf"));
        tableItems.add(new TableItem("asdasd", "sdfsdf"));
        tableItems.add(new TableItem("asdasd", "wrwer"));
        tableItems.add(new TableItem("asdasd", "dfsdfs"));
        tableItems.add(new TableItem("asdasd", "sxcsdfs"));
        tableItems.add(new TableItem("asdasd", "xcsdfsd"));
        tableItems.add(new TableItem("asdasd", "werwer"));
        tableItems.add(new TableItem("asdasd", "werwer"));
        tableItems.add(new TableItem("asdasd", "90890"));
        tableItems.add(new TableItem("asdasd", "sdsd"));
        tableItems.add(new TableItem("asdasd", "xczxc"));
        tableItems.add(new TableItem("asdasd", "ioiop"));
        tableItems.add(new TableItem("asdasd", "dcsd"));
        tableItems.add(new TableItem("asdasd", "qweqwe"));

        return tableItems;
    }

    public void setTableItems(List<TableItem> tableItems) {
        this.tableItems = tableItems;
    }

    public List<String> getDepartments() {
        setDepartments(new ArrayList<String>());
        departments.add("IT");
        departments.add("Sales");
        departments.add("Finance");
        departments.add("Management");
        departments.add("Programming");
        departments.add("People and Brand");
        departments.add("HR");
        departments.add("Law");
        departments.add("Security");

        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }
}
