/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.m133.la_9952;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author benny
 */
@Named(value = "LA_9952_ManagedBean")
@SessionScoped
public class LA_9952_ManagedBean implements Serializable {
    private String red;
    private String green;
    private String blue;

    public LA_9952_ManagedBean() {
    }

    public String getRed() {
        return red;
    }

    public String getGreen() {
        return green;
    }

    public String getBlue() {
        return blue;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public void setGreen(String green) {
        this.green = green;
    }

    public void setBlue(String blue) {
        this.blue = blue;
    }
}
