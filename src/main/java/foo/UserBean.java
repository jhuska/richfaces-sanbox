package foo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.richfaces.event.ItemChangeEvent;

@ManagedBean(name = "userBean")
@RequestScoped
public class UserBean {

    private String name;
    private String selectedTab = "second";

    public void updateCurrent(ItemChangeEvent event) {
        System.out.println("change listener called");
    }

    public UserBean() {
        super();
    }

    public String getName() {
        return name;
    }

    public String getSelectedTab() {
        return selectedTab;
    }

    public void setSelectedTab(String selectedTab) {
        this.selectedTab = selectedTab;
    }

    public void setName(String name) {
        this.name = name;
    }

}
