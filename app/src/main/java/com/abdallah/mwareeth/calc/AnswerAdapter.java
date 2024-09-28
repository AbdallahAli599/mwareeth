package com.abdallah.mwareeth.calc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.abdallah.mwareeth.R;

import java.util.ArrayList;

public class AnswerAdapter extends ArrayAdapter<Person> {

    TextView name , first , second , third , fourth , fifth , sixth;

    LinearLayout a, b;

    public AnswerAdapter(Activity Context, ArrayList<Person> people) {
        super(Context, 0, people);
    }

    @SuppressLint("SetTextI18n")
    public View getView(int position, View convertView, ViewGroup parent) {

        View ListPeopleView = convertView;
        if (ListPeopleView == null) {
            ListPeopleView = LayoutInflater.from(getContext()).inflate(R.layout.view_to_answer_adapter, parent, false);
        }

        Person currentPerson = getItem(position);

        name = ListPeopleView.findViewById(R.id.name);
        name.setText(currentPerson.getName());

        first = ListPeopleView.findViewById(R.id.tv1);
        first.setText(currentPerson.getNesbtNaseeb() + "");

        second = ListPeopleView.findViewById(R.id.tv2);
        second.setText(currentPerson.getQimtNaseeb() + "");

        third = ListPeopleView.findViewById(R.id.tv3);
        third.setText(currentPerson.getAlashm() + "");

        if (currentPerson.getAlashm1() == 0){
            a = ListPeopleView.findViewById(R.id.gone1);
            b = ListPeopleView.findViewById(R.id.gone2);
            a.setVisibility(View.GONE);
            b.setVisibility(View.GONE);
        }else {
            fourth = ListPeopleView.findViewById(R.id.tv4);
            fourth.setText(currentPerson.getNesbtNaseeb1() + "");

            fifth = ListPeopleView.findViewById(R.id.tv5);
            fifth.setText(currentPerson.getQimtNaseeb1() + "");

            sixth = ListPeopleView.findViewById(R.id.tv6);
            sixth.setText(currentPerson.getAlashm1() + "");

        }
        return ListPeopleView;
    }
}
