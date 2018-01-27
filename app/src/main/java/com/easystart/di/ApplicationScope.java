package com.easystart.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Used to mark dependencies to be created only once in the scope of the component.
 */
@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationScope {
}
