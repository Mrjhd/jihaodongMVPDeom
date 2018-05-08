package com.example.i.mvpdeom.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.i.mvpdeom.R;
import com.example.i.mvpdeom.model.IModelImpl;
import com.example.i.mvpdeom.presenter.PresenterImpl;

public class MainActivity extends AppCompatActivity implements LoginView,View.OnClickListener{

    private EditText edit_name;
    private EditText edit_pass;

    private Button btn_log;
    private Button btn_reg;
    private PresenterImpl presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    private void initViews() {
        edit_name = (EditText) findViewById(R.id.mobile);
        edit_pass = (EditText) findViewById(R.id.pwd);

        btn_log = (Button) findViewById(R.id.login);
        btn_reg = (Button) findViewById(R.id.reg);
        btn_log.setOnClickListener(this);
        btn_reg.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                presenter = new PresenterImpl();
                presenter.loginPresenter(new IModelImpl(),this);
                break;
            case R.id.reg:
                Intent intent=new Intent(MainActivity.this,RegActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public String getUsername() {
        return edit_name.getText().toString();
    }

    @Override
    public String getPassword() {
        return edit_pass.getText().toString();
    }



    @Override
    public void showSuccessMsg() {
        Toast.makeText(MainActivity.this, "成功---", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showErrorMsg() {
        Toast.makeText(MainActivity.this, "失败---请注册", Toast.LENGTH_SHORT).show();
    }
}
