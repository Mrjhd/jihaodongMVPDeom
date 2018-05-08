package com.example.i.mvpdeom.model;

/**
 * Created by 因为有个你i on 2018/5/8.
 */

public interface RegListener {
    void regSuccess(String json);
    void regError(String error);
}
