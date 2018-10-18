package com.mert.gsonproject.ui.gson;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mert.gsonproject.R;
import com.mert.gsonproject.data.model.Person;
import com.mert.gsonproject.ui.base.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;

public class GsonFragment extends BaseFragment {

    @BindView(R.id.recyclerView_gson)
    RecyclerView recyclerView;

    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gson, container, false);

        layoutManager = new LinearLayoutManager(baseActivity);

        recyclerView.setHasFixedSize(true);

        baseActivity.dataManager.getPerson();

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(baseActivity.dataManager.getPerson());

        adapter = new RecyclerAdapter(personArrayList);

        recyclerView.setAdapter(adapter);

        return view;
    }

}
