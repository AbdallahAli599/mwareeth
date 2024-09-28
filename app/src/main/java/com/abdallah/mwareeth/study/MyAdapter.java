package com.abdallah.mwareeth.study;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.abdallah.mwareeth.R;
import com.abdallah.mwareeth.study.Lesson;

public class MyAdapter extends ArrayAdapter<Lesson> {

    TextView name;
    ImageView lock;
    boolean locked = true;

    public MyAdapter(Activity Context, ArrayList<Lesson> lessons) {
        super(Context, 0, lessons);


    }
    public View getView (int position, View convertView, ViewGroup parent){

        View ListLessonsView = convertView;
        if (ListLessonsView==null){
            ListLessonsView = LayoutInflater.from(getContext()).inflate(R.layout.view_to_adapter, parent,false);
        }

        Lesson currentLesson = getItem(position);

        locked = currentLesson.isLocked();

        name = ListLessonsView.findViewById(R.id.name_of_lesson);
        name.setText(currentLesson.getTitle());

        lock = ListLessonsView.findViewById(R.id.lock_icon);
        if (locked){
            lock.setVisibility(View.VISIBLE);
        }else {
            lock.setVisibility(View.GONE);
        }

        return ListLessonsView;
    }

}