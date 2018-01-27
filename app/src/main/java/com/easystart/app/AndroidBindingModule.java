package com.easystart.app;

import com.easystart.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Uses dagger-android to inject dependencies into activities and fragments.
 */
@Module
interface AndroidBindingModule {
    @ContributesAndroidInjector MainActivity mainActivity();
}
