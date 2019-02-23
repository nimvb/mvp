package com.example.app.view.core;

import com.example.app.model.core.event.ViewLoad;
import com.example.app.service.core.event.IEvent;

public interface IView {
    IEvent<ViewLoad> getViewLoadRequest();

    void show();
}
