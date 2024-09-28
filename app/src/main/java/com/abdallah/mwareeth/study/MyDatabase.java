package com.abdallah.mwareeth.study;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class MyDatabase extends SQLiteAssetHelper {

    public static final String DB_NAME = "Lessons.db";
    public static final int DB_VERSION = 1;
    public static final String LESSONS1_TABLE_NAME = "Lessons1";
    public static final String LESSONS2_TABLE_NAME = "Lessons2";
    public static final String LESSONS3_TABLE_NAME = "Lessons3";
    public static final String LESSONS4_TABLE_NAME = "Lessons4";
    public static final String LESSON_CLN_TITLE = "title";
    public static final String LESSON_CLN_CONTENT = "content";
    public static final String LESSONS1_QUIZ1_TABLE_NAME = "Lessons1Test1";
    public static final String LESSONS1_QUIZ2_TABLE_NAME = "Lessons1Test2";
    public static final String LESSONS1_QUIZ3_TABLE_NAME = "Lessons1Test3";
    public static final String LESSONS1_QUIZ4_TABLE_NAME = "Lessons1Test4";
    public static final String LESSONS1_QUIZ5_TABLE_NAME = "Lessons1Test5";
    public static final String LESSONS1_QUIZ6_TABLE_NAME = "Lessons1Test6";
    public static final String LESSONS1_QUIZ7_TABLE_NAME = "Lessons1Test7";
    public static final String LESSONS2_QUIZ1_TABLE_NAME = "Lessons2Test1";
    public static final String LESSONS2_QUIZ2_TABLE_NAME = "Lessons2Test2";
    public static final String LESSONS2_QUIZ3_TABLE_NAME = "Lessons2Test3";
    public static final String LESSONS2_QUIZ4_TABLE_NAME = "Lessons2Test4";
    public static final String LESSONS2_QUIZ5_TABLE_NAME = "Lessons2Test5";
    public static final String LESSONS2_QUIZ6_TABLE_NAME = "Lessons2Test6";
    public static final String LESSONS2_QUIZ7_TABLE_NAME = "Lessons2Test7";
    public static final String LESSONS2_QUIZ8_TABLE_NAME = "Lessons2Test8";
    public static final String LESSONS2_QUIZ9_TABLE_NAME = "Lessons2Test9";
    public static final String LESSONS_QUIZ_CLN_QUESTION = "Question";
    public static final String LESSONS_QUIZ_CLN_OPTION1 = "option1";
    public static final String LESSONS_QUIZ_CLN_OPTION2 = "option2";
    public static final String LESSONS_QUIZ_CLN_OPTION3 = "option3";
    public static final String LESSONS_QUIZ_CLN_ANSWER = "answerNr";


    public MyDatabase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
}
