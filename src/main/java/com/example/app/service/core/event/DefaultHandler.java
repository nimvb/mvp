package com.example.app.service.core.event;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DefaultHandler<T> implements IEventHandler<T> {


    private final HashSet<T> subscribers = new HashSet<>();

    @Override
    public List<T> getListeners() {
        return new ArrayList<>(subscribers);
    }

    @Override
    public void addListener(T subscriber) {

        subscribers.add(subscriber);

    }

    @Override
    public void removeListener(T subscriber) {
        subscribers.remove(subscriber);
    }
}
