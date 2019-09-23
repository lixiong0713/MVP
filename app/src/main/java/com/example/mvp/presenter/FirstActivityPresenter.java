package com.example.mvp.presenter;

import com.example.mvp.model.modelimp.FirstActivityModelImp;
import com.example.mvp.model.modelinter.OnSendStrListener;
import com.example.mvp.view.activity.FirstActivity;

/**
 * Created by Administrator on 2018/9/28.
 */

public class FirstActivityPresenter extends BasePresenter<FirstActivity,FirstActivityModelImp> {
    @Override
    protected FirstActivityModelImp getModel() {
        return new FirstActivityModelImp();
    }

    public void load(String request){
        model.dealSth(request,new OnSendStrListener(){

            @Override
            public void sendAAAA(String aaaa) {
                getView().doSth(aaaa);
            }
        });
    }
}
