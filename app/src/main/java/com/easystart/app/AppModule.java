package com.easystart.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Module that provides application Context.
 */
@Module
interface AppModule {
    @Binds Context bindContext(EasyStart application);
}
