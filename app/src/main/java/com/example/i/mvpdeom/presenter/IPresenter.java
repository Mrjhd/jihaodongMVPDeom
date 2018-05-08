package com.example.i.mvpdeom.presenter;

import com.example.i.mvpdeom.model.IModel;
import com.example.i.mvpdeom.view.LoginView;
import com.example.i.mvpdeom.view.RegView;

/**
 * Created by 因为有个你i on 2018/5/8.
 */

public interface IPresenter {
    void loginPresenter(IModel iModel, LoginView loginView);
    void regPresenter(IModel iModel, RegView regView);
}
