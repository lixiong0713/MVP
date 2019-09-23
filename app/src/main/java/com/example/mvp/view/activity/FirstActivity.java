package com.example.mvp.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mvp.R;
import com.example.mvp.presenter.FirstActivityPresenter;
import com.example.mvp.view.viewinter.FirstActivityViewInter;

public class FirstActivity extends BaseMVPActivity<FirstActivityPresenter, FirstActivityViewInter> implements FirstActivityViewInter {
    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        textView = findViewById(R.id.textView);
        presenter.load("我是第一个view，我要获取数据，请presenter为我拿回一个字符串AAAA");
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FirstActivity.this, SecondActivity.class));
                finish();
            }
        });
    }

    @Override
    protected FirstActivityPresenter getPresenter() {
        return new FirstActivityPresenter();
    }

    @Override
    public void doSth(String data) {
        textView.setText(data);
    }
}
