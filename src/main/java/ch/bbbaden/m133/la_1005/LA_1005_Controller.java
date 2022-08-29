/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.m133.la_1005;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author benny
 */
@Named(value = "LA_1005_Controller")
@SessionScoped
public class LA_1005_Controller implements Serializable {

    List<String> posts = new ArrayList<>();

    public LA_1005_Controller() {
        posts.add("Schritt0.xhtml");
        posts.add("Schritt1.xhtml");
        posts.add("Schritt2.xhtml");
        posts.add("Schritt3.xhtml");
        posts.add("Schritt4.xhtml");
        posts.add("/index.xhtml");
    }

    public String getPost(int currentPost) {
        return posts.get(currentPost + 1);
    }
}
