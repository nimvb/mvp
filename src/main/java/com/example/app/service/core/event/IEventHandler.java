package com.example.app.service.core.event;

import java.util.List;

public interface IEventHandler<T> extends IEvent<T> {

    List<T> getListeners();

}
