package com.example.mvp.model.modelinter;

import com.example.mvp.model.BaseModelInter;

/**
 * Created by Administrator on 2018/9/28.
 */

public interface FirstActivityModelInter extends BaseModelInter{
    void dealSth(String request,OnSendStrListener listener);
}
