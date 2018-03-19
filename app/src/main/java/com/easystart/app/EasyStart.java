package com.easystart.app;

import android.os.StrictMode;
import com.easystart.BuildConfig;
import com.squareup.leakcanary.LeakCanary;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class EasyStart extends DaggerApplication {

    @Override public void onCreate() {
        super.onCreate();
        initStrictMode();
        initLeakCanary();
    }

    private void initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        // Normal app init code...
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
