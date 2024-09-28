package com.abdallah.mwareeth.calc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.abdallah.mwareeth.R;
import com.abdallah.mwareeth.databinding.ActivityAnswerBinding;

import java.util.ArrayList;
import java.util.Locale;

public class AnswerActivity extends AppCompatActivity {

    ActivityAnswerBinding binding;
    ArrayList<Person> people = new ArrayList<>();
    ArrayAdapter<Person> adapter;
    Waratha waratha;
    Masala massala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityAnswerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        waratha = (Waratha) getIntent().getSerializableExtra("yes");

        massala = new Masala();
        massala.hissabMawarith(waratha);

        setMyTitle();

        initData();
        initListView();

        binding.aslElmasala.setText(massala.getSharh());

    }



    @SuppressLint("SetTextI18n")
    private void setMyTitle() {
        int i = waratha.getTarika();
        if ( i > 0){
            binding.altarika.setVisibility(View.VISIBLE);
            binding.altarika.setText("قيمة التركة: " + i);
        }
        binding.aslElmasala.setText("أصل المسألة: " + massala.getMissah());
        if (massala.getAwl() != 0){
            binding.aslElmasalaQablAlawl.setVisibility(View.VISIBLE);
            binding.aslElmasalaQablAlawl.setText("أصل المسألة قبل العول: " + massala.getAsl());
        }
    }

    private void initData() {
        for (Mirath mirath : massala.getMawarith()){
            Person person;
            if (mirath.getNbr() != 1){
                person = new Person(mirath.getIsm(),mirath.getHokom(),String.format(Locale.ROOT,"%.2f", (float) waratha.getTarika() / massala.getMissah() * mirath.getNassib() * mirath.getNbr()),mirath.getNassib() * mirath.getNbr() ,mirath.getHokom(),String.format(Locale.ROOT,"%.2f",(float) waratha.getTarika() / massala.getMissah() * mirath.getNassib()),mirath.getNassib());
            }else {
                person = new Person(mirath.getIsm(),mirath.getHokom(),String.format(Locale.ROOT,"%.2f",(float) waratha.getTarika() / massala.getMissah() * mirath.getNassib()),mirath.getNassib());
            }
            people.add(person);
        }
    }

    private void initListView() {
        adapter = new AnswerAdapter(this , people);
        binding.listView.setAdapter(adapter);
    }
}