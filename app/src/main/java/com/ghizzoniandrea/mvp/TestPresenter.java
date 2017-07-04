package com.ghizzoniandrea.mvp;

public class TestPresenter implements TestContract.Presenter {

    private TestContract.View view;
    private TestContract.Model model;

    public TestPresenter(TestContract.View view, TestContract.Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void getData() {
        view.showData(model.loadData());
    }
}
