
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

@ManagedBean
@SessionScoped
public class UserBean implements Cloneable {

    @Size(max = 15, message = "Wrong size for password")
    private String password;

    @Size(max = 15, message = "Wrong size for confirmation")
    private String confirm;

    private String status = "";

    @AssertTrue(message = "Different passwords entered!")
    public boolean isPasswordsEquals() {
        System.out.println(password);
        System.out.println(confirm);
        if (password == null || confirm == null) {
            return false;
        }
        return password.equals(confirm);
    }

    public void storeNewPassword() {
        FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_INFO, "Succesfully changed!", "Succesfully changed!"));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
