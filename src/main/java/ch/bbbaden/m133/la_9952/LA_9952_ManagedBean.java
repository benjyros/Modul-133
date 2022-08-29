/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ch.bbbaden.m133.la_9952;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author benny
 */
@Named(value = "LA_9952_ManagedBean")
@SessionScoped
public class LA_9952_ManagedBean implements Serializable {

    private int red;
    private int green;
    private int blue;

    private String hex;

    private List<Integer> numbers = new ArrayList<>();

    public LA_9952_ManagedBean() {
        red = 255;
        green = 194;
        blue = 212;
        this.rgbToHex();
        for (int i = 0; i <= 255; i++) {
            numbers.add(i);
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void rgbToHex() {
        hex = String.format("#%02x%02x%02x", red, green, blue);
    }

    public String getHex() {
        return hex;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
