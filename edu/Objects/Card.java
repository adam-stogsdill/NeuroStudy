package edu.Objects;

import edu.packets.ObjectType;
import edu.packets.Subject;
import edu.packets.Tag;

public class Card extends EduObject{
    private String front_text;
    private String back_text;


    public Card(String front_text, String back_text){
        super(Subject.NULL, null, ObjectType.CARD);
        this.front_text = front_text;
        this.back_text = back_text;
    }

    public Card(Subject sub, String front_text, String back_text){
        super(sub, null, ObjectType.CARD);
        this.front_text = front_text;
        this.back_text = back_text;
    }

    public Card(Subject sub, String front_text, String back_text, Tag[] tags){
        super(sub, tags, ObjectType.CARD);
        this.front_text = front_text;
        this.back_text = back_text;
    }
    public Card(String front_text, String back_text, Tag[] tags){
        super(null, null, ObjectType.CARD);
        this.front_text = front_text;
        this.back_text = back_text;
    }

    public String getFront_text() {
        return front_text;
    }

    public String getBack_text() {
        return back_text;
    }
}
