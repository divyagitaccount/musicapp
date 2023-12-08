package com.example.musicapp;
import java.io.Serializable;

public class AudioModal implements Serializable {
    String path,title,duration;

    public AudioModal() {
    }
    public AudioModal(String path, String title, String duration) {
        this.path = path;
        this.title = title;
        this.duration = duration;
    }



    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
