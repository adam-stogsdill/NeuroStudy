package edu.Objects;

import java.io.File;
import java.net.URL;

public class PictureDisplay {
    private File file;
    private URL url;
    private String name;

    public PictureDisplay(String name, File f){
        this.name = name;
        this.file = f;
    }

    public PictureDisplay(String name, URL url){
        this.name = name;
        this.url = url;
    }

}
