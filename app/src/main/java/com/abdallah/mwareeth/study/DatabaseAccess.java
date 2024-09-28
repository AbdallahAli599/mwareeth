package com.abdallah.mwareeth.study;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseAccess {

    private SQLiteDatabase database;
    private final SQLiteOpenHelper openHelper;
    private static DatabaseAccess instance;

    private DatabaseAccess(Context context){
        this.openHelper = new MyDatabase(context);
    }

    public static DatabaseAccess getInstance (Context context){
        if (instance==null){
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public void open() {
        this.database = this.openHelper.getWritableDatabase();
    }

    public void close() {
        if(this.database != null)
            this.database.close();
    }

    public ArrayList<Lesson> getFirstLessons(){
        ArrayList<Lesson> lessons = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS1_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String title = c.getString(c.getColumnIndex(MyDatabase.LESSON_CLN_TITLE));
                String content = c.getString(c.getColumnIndex(MyDatabase.LESSON_CLN_CONTENT));

                Lesson lesson = new Lesson(title,content);
                lessons.add(lesson);
            }
            while (c.moveToNext());
            c.close();
        }
        return lessons;
    }

    public ArrayList<Lesson> getSecondLessons(){
        ArrayList<Lesson> lessons = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS2_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String title = c.getString(c.getColumnIndex(MyDatabase.LESSON_CLN_TITLE));
                String content = c.getString(c.getColumnIndex(MyDatabase.LESSON_CLN_CONTENT));

                Lesson lesson = new Lesson(title,content);
                lessons.add(lesson);
            }
            while (c.moveToNext());
            c.close();
        }
        return lessons;
    }

    public ArrayList<Question> getFirstLessonsQuiz1(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS1_QUIZ1_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getFirstLessonsQuiz2(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS1_QUIZ2_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getFirstLessonsQuiz3(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS1_QUIZ3_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getFirstLessonsQuiz4(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS1_QUIZ4_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getFirstLessonsQuiz5(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS1_QUIZ5_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getFirstLessonsQuiz6(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS1_QUIZ6_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getFirstLessonsQuiz7(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS1_QUIZ7_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getSecondLessonsQuiz1(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS2_QUIZ1_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getSecondLessonsQuiz2(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS2_QUIZ2_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getSecondLessonsQuiz3(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS2_QUIZ3_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getSecondLessonsQuiz4(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS2_QUIZ4_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getSecondLessonsQuiz5(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS2_QUIZ5_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getSecondLessonsQuiz6(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS2_QUIZ6_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getSecondLessonsQuiz7(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS2_QUIZ7_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getSecondLessonsQuiz8(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS2_QUIZ8_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }

    public ArrayList<Question> getSecondLessonsQuiz9(){
        ArrayList<Question> questions = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM "+MyDatabase.LESSONS2_QUIZ9_TABLE_NAME,null);
        if(c != null && c.moveToFirst()){
            do {
                String Question = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_QUESTION));
                String option1 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION1));
                String option2 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION2));
                String option3 = c.getString(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_OPTION3));
                int answer = c.getInt(c.getColumnIndex(MyDatabase.LESSONS_QUIZ_CLN_ANSWER));

                Question question = new Question(Question,option1,option2,option3,answer);
                questions.add(question);
            }
            while (c.moveToNext());
            c.close();
        }
        return questions;
    }



}
