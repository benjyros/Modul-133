/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.m133.la_9960;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author benny
 */
@Named(value = "LA_9960_Controller")
@SessionScoped
public class LA_9960_Controller implements Serializable {

    public LA_9960_Controller() {
    }

    public String getPost() {
        return "//index.xhtml";
    }
}
