package com.trainging.kentdzai.demomvp.model;

import com.trainging.kentdzai.demomvp.model.entity.Demo;
import com.trainging.kentdzai.demomvp.presenter.MainResult;

/**
 * Created by kentdzai on 12/03/2017.
 */

public class MainHandler {
    private MainResult result;

    public void setResult(MainResult result) {
        this.result = result;
    }

    public void getData() {
        if (result == null) return;
        result.onLoadSuccess(new Demo("Demo", "Đây là demo MVP"));
    }
}
