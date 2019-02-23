package com.example.app.view.login;

import com.example.app.model.generic.Credential;
import com.example.app.view.core.IView;
import com.example.app.view.core.console.IConsoleView;

public interface ILoginView extends IView, IConsoleView {
    Credential getCredential();

    void showMessage(String message);
}
