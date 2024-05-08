package com.ani.bdddemo.test;

import android.app.Application;
import android.content.Context;

import com.ani.bdddemo.MyApp;

import io.cucumber.android.runner.CucumberAndroidJUnitRunner;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = {"features" },
        glue = {"com.ani.bdddemo.test.test"}
)
public class BddRunner extends CucumberAndroidJUnitRunner {

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return super.newApplication(cl, MyApp.class.getCanonicalName(), context);
    }
}