package edu.packets;

public class Tag {
    private String tag;

    public Tag(String tag){
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Tag: [" + super.toString() + "] " + this.tag;
    }

    public String getTag() {
        return tag;
    }
}
