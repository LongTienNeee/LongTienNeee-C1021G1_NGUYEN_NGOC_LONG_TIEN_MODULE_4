package cg.wbd.grandemonstration.model;


import javax.persistence.Entity;
import javax.persistence.Table;


public class Music implements Cloneable {
    private String name ;
    private String nameOfMusician;
    private String kindOfMusic;
    private String link;

    public Music(){};

    public Music(String name, String nameOfMusician, String kindOfMusic, String link) {
        this.name = name;
        this.nameOfMusician = nameOfMusician;
        this.kindOfMusic = kindOfMusic;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfMusician() {
        return nameOfMusician;
    }

    public void setNameOfMusician(String nameOfMusician) {
        this.nameOfMusician = nameOfMusician;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
