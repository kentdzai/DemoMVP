package com.trainging.kentdzai.demomvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.trainging.kentdzai.demomvp.R;
import com.trainging.kentdzai.demomvp.model.MainHandler;
import com.trainging.kentdzai.demomvp.model.entity.Demo;
import com.trainging.kentdzai.demomvp.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView {
    private TextView tvTitle;
    private TextView tvMsg;
    private MainHandler model;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvMsg = (TextView) findViewById(R.id.tvMsg);
        initMVP();
    }


    private void initMVP() {
        if (model == null) model = new MainHandler();
        if (presenter == null) presenter = new MainPresenter(model, this);
        presenter.loadData();
    }

    @Override
    public void displayMain(Demo dm) {
        if (dm == null) return;
        tvTitle.setText(dm.getTitle());
        tvMsg.setText(dm.getMsg());
    }
}
