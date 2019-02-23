package com.example.app.service.core.event;

@SuppressWarnings("ALL")
public interface IEvent<T> {

    void addListener(T subscriber);

    @SuppressWarnings("unused")
    void removeListener(T subscriber);

}
