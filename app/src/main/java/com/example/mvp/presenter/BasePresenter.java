package com.example.mvp.presenter;

/**
 * Created by Administrator on 2018/9/28.
 */

import com.example.mvp.model.BaseModelInter;
import com.example.mvp.view.BaseViewInter;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<T extends BaseViewInter, M extends BaseModelInter> {
    private WeakReference<T> weakReference;
    protected M model;

    /**
     * 关联presenter和view
     *
     * @param t
     */
    public void attach(T t) {
        weakReference = new WeakReference<>(t);
        model = getModel();
    }

    /**
     * 删除关联
     */
    public void delAttach() {
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;
        }
    }

    /**
     * 获取view
     *
     * @return
     */
    public T getView() {
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /**
     * 获取model
     *
     * @return
     */
    protected abstract M getModel();
}
