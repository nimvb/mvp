package com.example.app;

import com.example.app.presenter.login.ILoginPresenter;
import com.example.app.presenter.login.LoginPresenter;
import com.example.app.service.auth.AuthService;
import com.example.app.view.login.ILoginView;
import com.example.app.view.login.LoginView;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        ILoginView      loginView      = new LoginView();
        ILoginPresenter loginPresenter = new LoginPresenter(loginView, new AuthService());
        loginPresenter.present();
    }
}
