/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.m133.la_9954;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author benny
 */
@Named(value = "LA_9954_Controller")
@SessionScoped
public class LA_9954_Controller implements Serializable {

    List<String> posts = new ArrayList<>();

    public LA_9954_Controller() {
        posts.add("Auswahl1.xhtml");
        posts.add("Auswahl2.xhtml");
        posts.add("Auswahl3.xhtml");
        posts.add("Ausgabe.xhtml");
        posts.add("/index.xhtml");
    }

    public String getPost(int currentPost) {
        return posts.get(currentPost + 1);
    }
}
