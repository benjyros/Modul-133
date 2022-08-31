/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.m133.la_9954;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author benny
 */
@Named(value = "LA_9954_ManagedBean")
@SessionScoped
public class LA_9954_ManagedBean implements Serializable {

    private String skin = "";
    private String eyes = "";
    private String hair = "";

    public LA_9954_ManagedBean() {
    }

    public void setSkin(String skin) {
        this.skin = skin;
        System.out.println(skin);
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
        System.out.println(eyes);
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getSkin() {
        return skin;
    }

    public String getEyes() {
        return eyes;
    }

    public String getHair() {
        return hair;
    }

    public String getChoice() {
        String ret = "";
        if (skin.equals("h")) {
            ret += "helle Haut";
        } else {
            ret += "dunkle Haut";
        }

        if (eyes.equals("g")) {
            ret += ", grüne Augen";
        } else {
            ret += ", blaue Augen";
        }

        if (hair.equals("s")) {
            ret += ", schwarze Haare";
        } else {
            ret += ", blonde Haare";
        }
        return ret;
    }
}
