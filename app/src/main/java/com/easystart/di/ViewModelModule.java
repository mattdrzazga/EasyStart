package com.easystart.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.easystart.ui.main.MainViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Module that provides {@code Map<K, Provider<V>>} object injected into ViewModelFactory {@link VMFactory}
 */
@Module
public interface ViewModelModule {
    @Binds ViewModelProvider.Factory bindViewModelFactory(VMFactory factory);

    @Binds @IntoMap @ViewModelKey(MainViewModel.class) ViewModel bindMainViewModel(MainViewModel viewModel);
//    @Binds @IntoMap @ViewModelKey(ViewModel.class) ViewModel bindViewModel(ViewModel viewModel);
}
