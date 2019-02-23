package com.example.app.view.core;

import com.example.app.model.core.event.ViewLoad;
import com.example.app.service.core.event.DefaultHandler;
import com.example.app.service.core.event.IEvent;
import com.example.app.service.core.event.IEventHandler;

import java.util.List;

public abstract class View implements IView {
    private final IEventHandler<ViewLoad> loadHandler = new DefaultHandler<>();

    @Override
    public IEvent<ViewLoad> getViewLoadRequest() {
        return loadHandler;
    }


    protected void viewLoadInvoke() {
        List<ViewLoad> subscribers = loadHandler.getListeners();
        for (ViewLoad subscriber :
                subscribers) {
            subscriber.onLoad();
        }
    }
}
