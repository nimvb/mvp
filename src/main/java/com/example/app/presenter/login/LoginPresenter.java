package com.example.app.presenter.login;

import com.example.app.model.core.event.ViewLoad;
import com.example.app.presenter.main.IMainPresenter;
import com.example.app.presenter.main.MainPresenter;
import com.example.app.service.auth.IAuthService;
import com.example.app.view.login.ILoginView;
import com.example.app.view.main.IMainView;
import com.example.app.view.main.MainView;

public class LoginPresenter implements ILoginPresenter, ViewLoad {

    private final ILoginView   view;
    private final IAuthService authService;

    public LoginPresenter(ILoginView view, IAuthService authService) {

        this.view = view;
        this.authService = authService;
        this.view.getViewLoadRequest().addListener(this);
    }

    @Override
    public void present() {

        this.view.show();

    }

    @Override
    public void onLoad() {

        this.view.showMessage("*** LOGIN ***");

        if (authService.authenticate(this.view.getCredential())) {
            IMainView      mainView      = new MainView();
            IMainPresenter mainPresenter = new MainPresenter(mainView);
            mainPresenter.present();

        } else {
            this.view.showMessage("Invalid credentials!");

        }

    }
}
