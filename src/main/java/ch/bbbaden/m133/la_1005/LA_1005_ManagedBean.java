/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ch.bbbaden.m133.la_1005;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author benny
 */
@Named(value = "LA_1005_ManagedBean")
@SessionScoped
public class LA_1005_ManagedBean implements Serializable {
    
    private String name;
    private String vorname;

    public LA_1005_ManagedBean() {
    }
    
    public String getSessionId() {
        FacesContext fCtx = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fCtx.getExternalContext().getSession(false);
        return session.getId();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getVorname(){
        return vorname;
    }
    
    public void setVorname(String vorname){
        this.vorname = vorname;
    }
}
