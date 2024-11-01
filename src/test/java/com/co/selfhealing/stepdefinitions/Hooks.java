package com.co.selfhealing.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.net.MalformedURLException;

public class Hooks {

    @Before
    public static void setup(){
        OnStage.setTheStage(new OnlineCast());
    }

}
