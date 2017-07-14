package com.rongle.onekey.onekey.framework;

import android.view.View;

/**
 * Created by Administrator on 2017/7/13.
 */
public class BasePresenter<V extends IBaseView> {
    private V mView;

    protected void attach(V view){
        this.mView = view;
    }

    protected void detachView(){
        this.mView =null;
    }
}
