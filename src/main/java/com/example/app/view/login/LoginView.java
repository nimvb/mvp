package com.example.app.view.login;

import com.example.app.model.generic.Credential;
import com.example.app.view.core.console.ConsoleView;

import java.util.Scanner;

public class LoginView extends ConsoleView implements ILoginView {


    private String getUsername() {
        write("[*] USERNAME : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    private String getPassword() {
        write("[*] PASSWORD : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public Credential getCredential() {
        String username = getUsername();
        String password = getPassword();

        return new Credential(username, password);
    }

    @Override
    public void showMessage(String message) {

        this.writeLine(message);

    }


    @Override
    public void show() {
        viewLoadInvoke();
    }

}
