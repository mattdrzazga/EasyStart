package com.easystart.app;

import com.easystart.di.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Uses dagger-android to provide {@link EasyStart} with an injector.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AndroidBindingModule.class,
        AppModule.class,
        ViewModelModule.class,
        PreferenceModule.class
})
interface AppComponent extends AndroidInjector<EasyStart> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<EasyStart> {

    }
}
