package com.easystart.utils;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Preferences {
    private static final String KEY_FIRST_RUN = "first_run";

    @NonNull
    private final SharedPreferences preferences;

    @Inject
    public Preferences(@NonNull SharedPreferences preferences) {
        this.preferences = preferences;
    }

    public void saveFirstRun(boolean firstRun) {
        preferences.edit()
                .putBoolean(KEY_FIRST_RUN, firstRun)
                .apply();
    }

    public boolean getFirstRun() {
        return preferences.getBoolean(KEY_FIRST_RUN, false);
    }
}
