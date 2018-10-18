package com.mert.gsonproject.ui.gson;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mert.gsonproject.R;
import com.mert.gsonproject.data.model.Person;

import java.util.ArrayList;

import butterknife.BindView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<Person> personArrayList;

    public RecyclerAdapter() {
        personArrayList = new ArrayList<>();
    }

    public RecyclerAdapter(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.nameTextView.setText(personArrayList.get(position).getName());
        holder.ageTextView.setText(personArrayList.get(position).getAge());
        holder.carTextView.setText(personArrayList.get(position).getCar().getName());
        String models = "";
        for (String model : personArrayList.get(position).getCar().getModels()) {
            models += model + ", ";
        }

        holder.carModelsTextView.setText(models);
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.textView_name_item_recyclerView)
        public TextView nameTextView;

        @BindView(R.id.textView_age_item_recyclerView)
        public TextView ageTextView;

        @BindView(R.id.editText_car_item_recyclerView)
        public TextView carTextView;

        @BindView(R.id.editText_car_models_item_recyclerView)
        public TextView carModelsTextView;

        public ViewHolder(View itemView) {
            super(itemView);


        }
    }
}
