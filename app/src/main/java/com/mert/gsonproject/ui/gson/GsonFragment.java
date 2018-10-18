package com.mert.gsonproject.ui.gson;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mert.gsonproject.R;
import com.mert.gsonproject.data.model.Person;
import com.mert.gsonproject.ui.base.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;

public class GsonFragment extends BaseFragment {

    public TextView nameTextView;

    public TextView ageTextView;

    public TextView carTextView;

    public TextView carModelsTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gson, container, false);

        Person person = baseActivity.dataManager.getPerson();

        this.nameTextView = view.findViewById(R.id.textView_name_item_recyclerView);
        this.ageTextView = view.findViewById(R.id.textView_age_item_recyclerView);
        this.carTextView = view.findViewById(R.id.textView_car_item_recyclerView);
        this.carModelsTextView = view.findViewById(R.id.textView_car_models_item_recyclerView);

        if (person.getName() != null) {
            nameTextView.setText(person.getName());
            Log.d(this.getClass().getSimpleName(), "age :" + person.getName());
        }

        if (person.getAge() != -1) {
            Log.d(this.getClass().getSimpleName(), "age :" + person.getAge());
            ageTextView.setText(String.valueOf(person.getAge()));
        }

        if (person.getCar() != null) {
            carTextView.setText(person.getCar().getName());
            Log.d(this.getClass().getSimpleName(), "age :" + person.getCar().getName());
            String models = "";
            for (Object model : person.getCar().getModels()) {
                Log.d(this.getClass().getSimpleName(), "age :" + String.valueOf(model));
                models += String.valueOf(model) + ", ";
            }

            carModelsTextView.setText(models);
        }


        return view;
    }

}
