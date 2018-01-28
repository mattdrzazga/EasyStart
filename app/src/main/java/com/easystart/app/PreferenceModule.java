package com.easystart.app;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Module;
import dagger.Provides;

/**
 * Module that provides SharedPreferences.
 */
@Module
public class PreferenceModule {
    @Provides
    SharedPreferences provideSharedPreferences(EasyStart context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
