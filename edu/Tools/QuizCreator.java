package edu.Tools;

import edu.Objects.EduObject;
import edu.packets.Subject;
import edu.packets.Tag;

import java.util.HashSet;

public class QuizCreator {

    private HashSet<EduObject> questions;
    private static final int MAX_NUMBER_OF_QUESTIONS = 100;
    private int numberOfQuestions;

    public QuizCreator(int numberOfQuestions, Tag[] wantedTags, Subject subjectType){
        if(numberOfQuestions > MAX_NUMBER_OF_QUESTIONS){
            System.out.println("QUIZ MADE MORE THAN MAX NUMBER OF QUESTIONS SETTING TO 100");
        }
        for(int i = 0; i < numberOfQuestions; i++){
            // USE TAGS AND SUBJECT TYPES TO ADD QUESTIONS WHICH MUST BE UNIQUE.
        }
    }
}
