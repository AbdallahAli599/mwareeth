package com.abdallah.mwareeth.study;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.abdallah.mwareeth.R;
import com.abdallah.mwareeth.databinding.ActivityStudyBinding;

public class StudyActivity extends AppCompatActivity {
    ActivityStudyBinding binding;
    private static final int PERMISSION_REQ_CODE = 5;
    private static final int REQ_CODE_FIRST = 10;
    private static final int REQ_CODE_SECOND = 20;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String KEY_HIGH_SCORE = "keyHighScore0";
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_REQ_CODE);

        binding.studyStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyActivity.this, StartActivity.class);
                startActivityForResult(intent , REQ_CODE_FIRST);
            }
        });
        openFinishedLessons();
    }

    private void openSecLesson(){

        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_HIGH_SCORE, 2);
        editor.apply();

        binding.studyForoodBtn.setText(R.string.study_forood);
        binding.studyForoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyActivity.this, ForoodActivity.class);
                startActivityForResult(intent , REQ_CODE_SECOND);
            }
        });
    }

    private void openThirdLesson(){

        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_HIGH_SCORE, 3);
        editor.apply();

        binding.studyForoodBtn.setText(R.string.study_forood);
        binding.studyForoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyActivity.this, ForoodActivity.class);
                startActivityForResult(intent , REQ_CODE_SECOND);
            }
        });
    }

    private void openFinishedLessons() {
        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        i = prefs.getInt(KEY_HIGH_SCORE, 1);
        if (i==2)
            openSecLesson();
        if (i==3)
            openThirdLesson();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQ_CODE_FIRST) {
            if (resultCode == RESULT_OK) {
                openSecLesson();
            }
        }
    }
}