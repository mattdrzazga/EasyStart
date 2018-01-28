package com.easystart.app;

import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Module that provides application Context.
 */
@Module
interface AppModule {
    @Binds Context bindContext(EasyStart application);
}
