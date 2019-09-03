package edu.Tools;

import edu.Objects.EduObject;
import edu.packets.Tag;

import java.util.HashMap;
import java.util.HashSet;

public class TagOrganizer {
    public static HashMap<Tag, HashSet<EduObject>> TAG_DATABASE = new HashMap<>();

    public static void add(EduObject object){
        System.out.println("ADDING OBJECT");
        for(Tag t: object.getTags()) {
            if (TAG_DATABASE.containsKey(t)){
                TAG_DATABASE.get(t).add(object);
            }
        }
    }
}
