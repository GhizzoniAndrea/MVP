package com.ghizzoniandrea.mvp;

public class TestContract {

    interface View {
        void showData(String str);
    }

    interface Presenter {
        void getData();
    }

    interface Model {
        String loadData();
    }
}
