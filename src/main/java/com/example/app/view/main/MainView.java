package com.example.app.view.main;

import com.example.app.view.core.console.ConsoleView;

public class MainView extends ConsoleView implements IMainView {

    //IEventHandler<ViewLoad> loadHandler = new DefaultHandler<>();


    /*
        @Override
        public void write(String message) {
            System.out.print(message);
        }

        @Override
        public void writeLine(String message) {
            System.out.println(message);
        }

        @Override
        public IEvent<ViewLoad> getViewLoadRequest() {
            return loadHandler;
        }
    */
    @Override
    public void show() {

        viewLoadInvoke();

    }
/*
    private void viewLoadInvoke(){
        List<ViewLoad> subscribers = loadHandler.getListeners();
        for (ViewLoad subscriber :
                subscribers) {
            subscriber.onLoad();
        }

    }*/
}
