package com.abdallah.mwareeth.study;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.abdallah.mwareeth.R;
import com.abdallah.mwareeth.databinding.ActivityQuizBinding;

import java.util.ArrayList;
import java.util.Collections;

public class QuizActivity extends AppCompatActivity {
    ActivityQuizBinding binding;
    int i = 0;
    int score = 0;
    ArrayList<Question> quiz;
    private long backPressedTime;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Lesson currentLesson = (Lesson) getIntent().getSerializableExtra("name");

        binding = ActivityQuizBinding.inflate(getLayoutInflater());
        assert currentLesson != null;
        setTitle("إختبار على " + currentLesson.getTitle());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.quizDetailsToolbar;
        setSupportActionBar(toolbar);




        if (currentLesson.getQuiz() != null) {

            quiz = currentLesson.getQuiz();

            Collections.shuffle(quiz);

            binding.quizQuestionTv.setText(quiz.get(i).getQuestion());
            binding.rd1.setText(quiz.get(i).getOption1());
            binding.rd2.setText(quiz.get(i).getOption2());
            if (quiz.get(i).getOption3().equals(""))
                binding.rd3.setVisibility(View.GONE);
            else
                binding.rd3.setVisibility(View.VISIBLE);
            binding.rd3.setText(quiz.get(i).getOption3());


            binding.quizScore.setText("1/" + quiz.size());

            binding.qiuzConfirmBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (binding.rd1.isChecked() || binding.rd2.isChecked() || binding.rd3.isChecked()){
                        checkAnswer();
                    }else Toast.makeText(QuizActivity.this, "بطل هزار يا حبيبي واختار إجابة", Toast.LENGTH_SHORT).show();

                }
            });
        }
    }

    @SuppressLint("SetTextI18n")
    private void showNextQuestion(){
        if (i < quiz.size()){
            binding.radioGroup.clearCheck();
            binding.quizQuestionTv.setText(quiz.get(i).getQuestion());
            binding.rd1.setText(quiz.get(i).getOption1());
            binding.rd2.setText(quiz.get(i).getOption2());
            if (quiz.get(i).getOption3().equals(""))
                binding.rd3.setVisibility(View.GONE);
            else
                binding.rd3.setVisibility(View.VISIBLE);
            binding.rd3.setText(quiz.get(i).getOption3());

            binding.quizScore.setText((i + 1) + "/" + quiz.size());
        }else finishQuiz();
    }

    private void checkAnswer(){

        RadioButton rBSelected = findViewById(binding.radioGroup.getCheckedRadioButtonId());
        int answerNr = binding.radioGroup.indexOfChild(rBSelected) + 1;

        if (answerNr == quiz.get(i).getAnswerNr()){
            score++;
        }
        i++;
        showNextQuestion();
    }

    private void finishQuiz(){
        if (score >= quiz.size() * 0.8) {
            setResult(RESULT_OK);
        }
        else {
            setResult(RESULT_CANCELED);
        }
        AlertDialog builder = new AlertDialog.Builder(QuizActivity.this)
                .setTitle("النتيجة")
                .setMessage( "اللي انت حليتهم صح: " + score )
                .setPositiveButton("موافق", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).create();
        builder.show();
    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            setResult(-2);
            super.onBackPressed();
        } else {
            Toast.makeText(this, "دوس تاني لو عايز تطلع من الامتحان", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}