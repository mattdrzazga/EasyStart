package com.easystart.app;

import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Module that provides application Context.
 */
@Module
abstract class AppModule {
    @Binds
    abstract Context bindContext(EasyStart easyStart);
}
