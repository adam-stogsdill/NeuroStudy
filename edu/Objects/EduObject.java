package edu.Objects;

import edu.Tools.TagOrganizer;
import edu.packets.ObjectType;
import edu.packets.Subject;
import edu.packets.Tag;

import java.util.ArrayList;
import java.util.Arrays;

public class EduObject {

    private Subject subject = Subject.NULL;
    private ArrayList<Tag> tags;
    private ObjectType objectType = ObjectType.EduObject;

    public EduObject(Subject s, Tag[] tags, ObjectType objectType){
        this.subject = s;
        this.tags = (ArrayList<Tag>) Arrays.asList(tags);
        this.objectType = objectType;
        TagOrganizer.add(this);
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "EduObject [" + super.toString() + "] Subject: " + subject.toString() + " Tags: " + this.tags.toString();
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public Subject getSubject() {
        return subject;
    }
}
