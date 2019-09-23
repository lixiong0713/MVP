package com.example.mvp.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.mvp.presenter.BasePresenter;
import com.example.mvp.view.BaseViewInter;

/**
 * 需要与model交互使用的activity的基类
 * Created by Administrator on 2018/9/28.
 */

public abstract class BaseMVPActivity<P extends BasePresenter, V extends BaseViewInter> extends BaseActivity {
    protected P presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = getPresenter();
        presenter.attach((V) this);
    }

    protected abstract P getPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.delAttach();
    }
}
