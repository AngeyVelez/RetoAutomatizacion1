package com.co.selfhealing.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.LoginModel;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ValidateText;
import tasks.DoLogin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static userinterfaces.LoginPage.LBL_TITLE;
import static utils.Utils.*;

public class LoginStepDefinitions {

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(
                Open.url(SERENITY_URL)
        );
    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DoLogin.onSite(LoginModel.setData(dataTable).get(0))
        );
    }

    @Then("^the user should see the (.*) page")
    public void theUserShouldSeeTheDashboardPage(String title) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateText.on(LBL_TITLE), containsString(title))
        );

    }

}
