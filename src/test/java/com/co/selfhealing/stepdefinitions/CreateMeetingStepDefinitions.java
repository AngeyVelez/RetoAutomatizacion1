package com.co.selfhealing.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.MeetingLombok;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.CreateMeeting;
import questions.ValidateBusinessUnit;
import static userinterfaces.MeetingPage.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static utils.Utils.ACTOR;

public class CreateMeetingStepDefinitions {

    @When("the user attempts to create a new meeting")
    public void theUserAttemptsToCreateANewMeeting(DataTable dataTable) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
            CreateMeeting.on(MeetingLombok.setData(dataTable).get(0))
        );
    }
    @Then("^the user see the new meeting (.*) on the list$")
    public void theUserSeeTheNewMeetingOnTheList(String name) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateBusinessUnit.onList(TXT_VALIDATION.of(name)))
        );
    }

}
