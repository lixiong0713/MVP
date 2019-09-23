package com.example.mvp.model.modelimp;

import android.util.Log;

import com.example.mvp.model.modelinter.FirstActivityModelInter;
import com.example.mvp.model.modelinter.OnSendStrListener;

/**
 * Created by Administrator on 2018/9/28.
 */

public class FirstActivityModelImp implements FirstActivityModelInter {

    @Override
    public void dealSth(String request, OnSendStrListener listener) {
        if (request.equals("我是第一个view，我要获取数据，请presenter为我拿回一个字符串AAAA")){
            Log.i("IT_Real", "dealSth: presenter需要一个AAAA数据，我要返回一个AAAA数据");
            //接口回调该方法，就是将AAAA发回给presenter
            listener.sendAAAA("AAAA");
        }
    }
}
