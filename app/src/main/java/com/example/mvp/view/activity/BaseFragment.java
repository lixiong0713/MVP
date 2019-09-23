package com.example.mvp.view.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.example.mvp.presenter.BasePresenter;
import com.example.mvp.view.BaseViewInter;

/**
 * Created by Administrator on 2018/9/29.
 */

public abstract  class BaseFragment <P extends BasePresenter, V extends BaseViewInter> extends Fragment {
    protected P presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = getPresenter();
        presenter.attach((V) this);
    }

    protected abstract P getPresenter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.delAttach();
    }
}