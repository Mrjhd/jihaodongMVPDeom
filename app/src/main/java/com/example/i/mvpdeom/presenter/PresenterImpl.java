package com.example.i.mvpdeom.presenter;

import com.example.i.mvpdeom.http.HttpConfig;
import com.example.i.mvpdeom.model.IModel;
import com.example.i.mvpdeom.model.LoginListener;
import com.example.i.mvpdeom.model.RegListener;
import com.example.i.mvpdeom.view.LoginView;
import com.example.i.mvpdeom.view.RegView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 因为有个你i on 2018/5/8.
 */

public class PresenterImpl implements IPresenter {
    @Override
    public void loginPresenter(IModel iModel, final LoginView loginView) {
        Map<String,String> map=new HashMap<>();
        map.put("mobile",loginView.getUsername());
        map.put("password",loginView.getPassword());
        iModel.loginModel(HttpConfig.login_url, map, new LoginListener() {
            @Override
            public void LoginSuccess(String json) {
                loginView.showSuccessMsg();
            }

            @Override
            public void LoginError(String error) {
                loginView.showErrorMsg();
            }
        });
    }

    @Override
    public void regPresenter(IModel iModel,final RegView regView) {
        Map<String,String> map=new HashMap<>();
        map.put("mobile",regView.getUsername());
        map.put("password",regView.getPassword());
        iModel.regModel(HttpConfig.reg_url, map, new RegListener() {
            @Override
            public void regSuccess(String json) {
                regView.showSuccessMsg();
            }

            @Override
            public void regError(String error) {
                regView.showErrorMsg();
            }
        });
    }
}
