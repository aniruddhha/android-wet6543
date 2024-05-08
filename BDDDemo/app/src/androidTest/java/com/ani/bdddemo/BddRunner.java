package com.ani.bdddemo;


import io.cucumber.android.runner.CucumberAndroidJUnitRunner;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "features"
)
public class BddRunner extends CucumberAndroidJUnitRunner { }