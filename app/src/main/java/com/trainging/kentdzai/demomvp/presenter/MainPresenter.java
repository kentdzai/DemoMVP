package com.trainging.kentdzai.demomvp.presenter;

import com.trainging.kentdzai.demomvp.model.MainHandler;
import com.trainging.kentdzai.demomvp.model.entity.Demo;
import com.trainging.kentdzai.demomvp.view.MainView;

/**
 * Created by kentdzai on 12/03/2017.
 */

public class MainPresenter implements MainResult {
    private MainHandler model;
    private MainView view;

    public MainPresenter(MainHandler model, MainView view) {
        this.model = model;
        this.view = view;
        model.setResult(this);
    }

    public void loadData() {
        model.getData();
    }

    @Override
    public void onLoadSuccess(Demo demo) {
        view.displayMain(demo);
    }
}
