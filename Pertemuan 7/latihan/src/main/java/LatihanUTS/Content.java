/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanUTS;

/**
 *
 * @author Dwinanda
 */
public abstract class Content {
    private String format;
    private String media;
    public abstract void share();
    public abstract void generateSharedContent();
    public abstract void selectContent();
    public abstract void display();

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getMedia() {
        return media;
    }
}
