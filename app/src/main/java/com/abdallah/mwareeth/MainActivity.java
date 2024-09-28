package com.abdallah.mwareeth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.abdallah.mwareeth.calc.CalcActivity;
import com.abdallah.mwareeth.databinding.ActivityMainBinding;
import com.abdallah.mwareeth.study.StudyActivity;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.mainStudyBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, StudyActivity.class)));
        binding.mainCalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalcActivity.class);
                startActivity(intent);
            }
        });
    }
}