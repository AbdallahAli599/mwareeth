package com.abdallah.mwareeth.study;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.abdallah.mwareeth.R;
import com.abdallah.mwareeth.databinding.ActivityStartBinding;

import java.util.ArrayList;

public class ForoodActivity extends AppCompatActivity {

    ActivityStartBinding binding;
    ArrayList<Lesson> lessons;
    private static final int REQ_CODE_LESSON = 1;
    Lesson nextLesson;
    ArrayAdapter<Lesson> adapter;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String KEY_HIGH_SCORE = "keyHighScore2";
    private int i;
    int currentNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityStartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initData();
        initListView();
        openFinishedLessons();
    }

    private void initListView() {
        adapter = new MyAdapter(this, lessons);

        binding.listView.setAdapter(adapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                currentNum = position + 1;
                if (currentNum < lessons.size()){
                    nextLesson = lessons.get(currentNum);
                }

                if (!lessons.get(position).isLocked()) {

                    Intent intent = new Intent(ForoodActivity.this, LessonActivity.class);

                    intent.putExtra("lesson", lessons.get(position));

                    startActivityForResult(intent, REQ_CODE_LESSON);

                } else {
                    Toast.makeText(ForoodActivity.this, R.string.try_to_finish_last_lesson, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void initData() {

        DatabaseAccess db = DatabaseAccess.getInstance(this);
        db.open();
        lessons = db.getSecondLessons();
        ArrayList<Question> questions1 = db.getSecondLessonsQuiz1();
        ArrayList<Question> questions2 = db.getSecondLessonsQuiz2();
        ArrayList<Question> questions3 = db.getSecondLessonsQuiz3();
        ArrayList<Question> questions4 = db.getSecondLessonsQuiz4();
        ArrayList<Question> questions5 = db.getSecondLessonsQuiz5();
        ArrayList<Question> questions6 = db.getSecondLessonsQuiz6();
        ArrayList<Question> questions7 = db.getSecondLessonsQuiz7();
        ArrayList<Question> questions8 = db.getSecondLessonsQuiz8();
        ArrayList<Question> questions9 = db.getSecondLessonsQuiz9();
        db.close();

        Lesson lesson1 = lessons.get(0);
        Lesson lesson2 = lessons.get(1);
        Lesson lesson3 = lessons.get(2);
        Lesson lesson4 = lessons.get(3);
        Lesson lesson5 = lessons.get(4);
        Lesson lesson6 = lessons.get(5);
        Lesson lesson7 = lessons.get(6);
        Lesson lesson8 = lessons.get(7);
        Lesson lesson9 = lessons.get(8);

        lesson1.setQuiz(questions1);
        lesson2.setQuiz(questions2);
        lesson3.setQuiz(questions3);
        lesson4.setQuiz(questions4);
        lesson5.setQuiz(questions5);
        lesson6.setQuiz(questions6);
        lesson7.setQuiz(questions7);
        lesson8.setQuiz(questions8);
        lesson9.setQuiz(questions9);

    }

    private void openNxtLesson() {

        if (currentNum == lessons.size()) {
            setResult(RESULT_OK);
            finish();
        }

        if (nextLesson.isLocked()) {
            SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt(KEY_HIGH_SCORE, ++i);
            editor.apply();

            nextLesson.setLocked(false);
            adapter.notifyDataSetChanged();
        }

    }

    private void openFinishedLessons() {
        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        i = prefs.getInt(KEY_HIGH_SCORE, 0);
        int test = 0;
        while (i >= test) {
            lessons.get(test).setLocked(false);
            test++;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQ_CODE_LESSON) {
            if (resultCode == RESULT_OK) {
                openNxtLesson();
            } else if (resultCode == RESULT_CANCELED){
                Toast.makeText(this, "ذاكر كويس يا عم الحج علشان نفتحلك الدرس اللي بعده", Toast.LENGTH_SHORT).show();
            }
        }
    }

}