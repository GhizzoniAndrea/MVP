package com.ghizzoniandrea.mvp;

public class TestModel implements TestContract.Model {

    private static TestModel model;

    public static TestModel getInstance() {
        if (null == model) {
            model = new TestModel();
        }
        return model;
    }

    @Override
    public String loadData() {
        return "Hello MVP!";
    }
}
