package com.easystart.app;

import android.os.StrictMode;
import com.easystart.BuildConfig;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class EasyStart extends DaggerApplication {

    @Override public void onCreate() {
        super.onCreate();
        initStrictMode();
    }

    private void initStrictMode() {
        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(
                    new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
            StrictMode.setVmPolicy(
                    new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
        }
    }

    @Override protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
