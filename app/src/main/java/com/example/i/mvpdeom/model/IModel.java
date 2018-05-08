package com.example.i.mvpdeom.model;

import java.util.Map;

/**
 * Created by 因为有个你i on 2018/5/8.
 */

public interface IModel {
    void loginModel(String url, Map<String,String> map,LoginListener loginListener);
    void regModel(String url, Map<String,String> map,RegListener regListener);
}
