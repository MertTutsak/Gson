package com.mert.gsonproject.ui.gson;

import com.mert.gsonproject.data.model.Person;

public interface Gson {
    interface View {
        void initView(Person person);
    }

    interface Presenter {
        void Completed();
    }
}
