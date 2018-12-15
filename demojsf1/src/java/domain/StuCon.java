/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author User
 */
@SessionScoped
@ManagedBean
public class StuCon {
    
    private Stu stu;

    public Stu getStu() {
        if (stu == null) {
            stu = new Stu();
        }
        return stu;
    }

    public void setStu(Stu stu) {
        this.stu = stu;
    }
    
    
}
