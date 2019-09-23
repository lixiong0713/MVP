package com.example.mvp.presenter;

import com.example.mvp.model.modelimp.FirstFragmentModelImp;
import com.example.mvp.view.fragment.FirstFragment;

/**
 * Created by Administrator on 2018/9/28.
 */

public class FirstFragmentPresenter extends BasePresenter<FirstFragment, FirstFragmentModelImp> {

    public void load(String request) {
        getView().doSth(model.setResult(request));
    }

    @Override
    protected FirstFragmentModelImp getModel() {
        return new FirstFragmentModelImp();
    }
}
