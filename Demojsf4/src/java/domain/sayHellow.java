
package domain;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class sayHellow extends SimpleTagSupport{

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("G M Mortoza Ahmed Hello</br>");
        getJspContext().getOut().write("G M Mortoza Ahmed Hello</br>");
        getJspContext().getOut().write("G M Mortoza Ahmed Hello</br>");
        getJspContext().getOut().write("G M Mortoza Ahmed Hello</br>");
        
    }
    
}
