package com.easystart.app;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


public class EasyStart extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
