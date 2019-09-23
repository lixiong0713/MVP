package com.example.mvp.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.mvp.R;
import com.example.mvp.view.fragment.FirstFragment;

public class SecondActivity extends BaseActivity {
    private FirstFragment firstFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        firstFragment = new FirstFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fl_container, firstFragment, "FirstFragment");
        transaction.commit();
    }
}
