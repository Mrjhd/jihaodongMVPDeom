package com.example.i.mvpdeom.model;

/**
 * Created by 因为有个你i on 2018/5/8.
 */

public interface LoginListener {
    void LoginSuccess(String json);
    void LoginError(String error);
}
