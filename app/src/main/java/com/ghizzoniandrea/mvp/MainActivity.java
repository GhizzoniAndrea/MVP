package com.ghizzoniandrea.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TestContract.View, View.OnClickListener {

    private TestContract.Presenter presenter;

    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new TestPresenter(this, TestModel.getInstance());

        tvTest = (TextView) this.findViewById(R.id.tv_test);
        tvTest.setOnClickListener(this);
    }

    @Override
    public void showData(String str) {
        tvTest.setText(str);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.tv_test) {
            presenter.getData();
        }
    }
}
