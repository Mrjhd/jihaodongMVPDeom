package com.example.i.mvpdeom.http;

/**
 * Created by 因为有个你i on 2018/5/8.
 */

public interface OkLoadListener {
    void okLoadSuccess(String json);
    void okLoadError(String error);
}
