package com.easystart.ui.main;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.easystart.R;
import com.easystart.app.EasyStart;
import com.easystart.utils.Preferences;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import retrofit2.Retrofit;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    Context context;

    @Inject
    EasyStart app;

    @Inject
    ViewModelProvider.Factory factory;

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    @Inject
    SharedPreferences sp;

    @Inject
    SharedPreferences sp2;

    @Inject
    Preferences preferences;

    @Inject
    Preferences preferences2;

    @Inject
    Retrofit retrofit;

    @Inject
    Retrofit retrofit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String TAG = MainActivity.class.getSimpleName();
        Log.d(TAG, "onCreate: " + context);
        Log.d(TAG, "onCreate: " + app);
        Log.d(TAG, "onCreate: " + factory);
        Log.d(TAG, "onCreate: " + viewModelFactory);
        Log.d(TAG, "onCreate: " + sp);
        Log.d(TAG, "onCreate: " + sp2);
        Log.d(TAG, "onCreate: " + preferences);
        Log.d(TAG, "onCreate: " + preferences2);
        Log.d(TAG, "onCreate: " + retrofit);
        Log.d(TAG, "onCreate: " + retrofit2);

        ViewModelProviders.of(this, factory).get(MainViewModel.class);
    }
}
