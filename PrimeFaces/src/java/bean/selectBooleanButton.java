
package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class selectBooleanButton {
    
    private boolean Button1;
    private boolean Button2;

    public boolean isButton1() {
        return Button1;
    }

    public void setButton1(boolean Button1) {
        this.Button1 = Button1;
    }

    public boolean isButton2() {
        return Button2;
    }

    public void setButton2(boolean Button2) {
        this.Button2 = Button2;
    }

    
    
    public void addMessage(){ 
        String summarya = Button1 ? "Checked" : "UnChecked";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summarya)); 
    }
}
