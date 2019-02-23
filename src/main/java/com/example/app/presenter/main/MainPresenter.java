package com.example.app.presenter.main;

import com.example.app.model.core.event.ViewLoad;
import com.example.app.view.main.IMainView;

public class MainPresenter implements IMainPresenter, ViewLoad {


    private final IMainView view;

    public MainPresenter(IMainView view) {

        this.view = view;
        this.view.getViewLoadRequest().addListener(this);

    }

    @Override
    public void present() {

        this.view.show();

    }

    @Override
    public void onLoad() {

        this.view.writeLine("Hello MVP");
    }
}
