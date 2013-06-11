package foo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class test {

    private String i = "";

    public test() {
    }
    
    /**
     * @return the i
     */
    public String getI() {
        System.out.println("Getting");
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(String i) {
        System.out.println("Setting");
        this.i = i;
    }
}
