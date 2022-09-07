package ch.bbbaden.m133.la_9960;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author benny
 */
@Named(value = "LoginUserBean")
@SessionScoped
public class LoginUserBean implements Serializable {

    private String correctUsername = "12345";
    private String correctPw = "abcde";
    private String username;
    private String pw;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUsername() {
        return username;
    }

    public String getPw() {
        return pw;
    }


    public String doLogin() {
        if (username.equals(correctUsername) && pw.equals(correctPw)) {
            return "secured/welcome.xhtml";
        } else {
            return "start.xhtml";
        }
    }
}
