package com.example.mvp.view.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mvp.R;
import com.example.mvp.presenter.FirstFragmentPresenter;
import com.example.mvp.view.activity.BaseFragment;
import com.example.mvp.view.viewinter.FirstFragmentViewInter;

public class FirstFragment extends BaseFragment<FirstFragmentPresenter, FirstFragmentViewInter> implements FirstFragmentViewInter {
    private View view;
    private TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_first, container, false);
            tv = view.findViewById(R.id.textView);
            presenter.load("我是第二个view，我要获取数据，请presenter为我拿回一个字符串BBBB");
        }
        return view;
    }

    @Override
    public void doSth(String data) {
        tv.setText(data);
    }

    @Override
    protected FirstFragmentPresenter getPresenter() {
        return new FirstFragmentPresenter();
    }
}
