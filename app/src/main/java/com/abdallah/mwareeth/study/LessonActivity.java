package com.abdallah.mwareeth.study;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.abdallah.mwareeth.R;
import com.abdallah.mwareeth.databinding.ActivityLessonBinding;

public class LessonActivity extends AppCompatActivity {

    ActivityLessonBinding binding;
    private static final int REQ_CODE_QUIZ = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Lesson currentLesson = (Lesson) getIntent().getSerializableExtra("lesson");

        binding = ActivityLessonBinding.inflate(getLayoutInflater());
        assert currentLesson != null;
        setTitle(currentLesson.getTitle());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.detailsToolbar;
        setSupportActionBar(toolbar);


        binding.lessonContentTv.setText(currentLesson.getContent());

        binding.lessonQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonActivity.this, QuizActivity.class);
                intent.putExtra("name",currentLesson);
                startActivityForResult(intent,REQ_CODE_QUIZ);
            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQ_CODE_QUIZ){
            if (resultCode == RESULT_OK){
                setResult(RESULT_OK);
                finish();
            }else if (resultCode == RESULT_CANCELED){
                setResult(RESULT_CANCELED);
                finish();
            }else {
                Toast.makeText(this, "رجعت ليه يا ابني ما انت كنت شغال كويس", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        setResult(-2);
        finish();
    }
}