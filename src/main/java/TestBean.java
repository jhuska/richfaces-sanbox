import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TestBean implements Serializable {

    List<String> items = new ArrayList<String>();

    public TestBean() {
        items.add("one");
        items.add("two");
        items.add("three");
    }

    public void addItem() {
        items.add("another");
    }
    
    public void justDoAnything() {
        System.out.println("just do aything!");
    }

    public List<String> getItems() {
        return items;
    }
}
