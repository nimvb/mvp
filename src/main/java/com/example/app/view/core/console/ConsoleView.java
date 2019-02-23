package com.example.app.view.core.console;

import com.example.app.view.core.View;

public abstract class ConsoleView extends View implements IConsoleView {

    @Override
    public void write(String message) {
        System.out.print(message);
    }

    @Override
    public void writeLine(String message) {
        System.out.println(message);
    }
}
