package com.easystart.ui.main;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.easystart.R;
import com.easystart.app.EasyStart;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;


public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    Context context;

    @Inject
    EasyStart app;

    @Inject
    ViewModelProvider.Factory factory;

    @Inject
    ViewModelProvider.Factory viewModelFactory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String TAG = MainActivity.class.getSimpleName();
        Log.d(TAG, "onCreate: " + context);
        Log.d(TAG, "onCreate: " + app);
        Log.d(TAG, "onCreate: " + factory);
        Log.d(TAG, "onCreate: " + viewModelFactory);

        ViewModelProviders.of(this, factory).get(MainViewModel.class);
    }
}
