package com.abdallah.mwareeth.study;

import java.io.Serializable;
import java.util.ArrayList;

public class Lesson implements Serializable {
    private String title;
    private String content;
    private ArrayList<Question> quiz;
    private boolean locked = true;

    public Lesson(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Lesson(String title, String content, ArrayList<Question> quiz) {
        this.title = title;
        this.content = content;
        this.quiz = quiz;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public ArrayList<Question> getQuiz() {
        return quiz;
    }

    public void setQuiz(ArrayList<Question> quiz) {
        this.quiz = quiz;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
