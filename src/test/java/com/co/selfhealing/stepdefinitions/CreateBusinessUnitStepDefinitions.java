package com.co.selfhealing.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.BusinessUnitModel;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ValidateBusinessUnit;
import tasks.CreateBusinessUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static userinterfaces.BusinessUnitPage.*;
import static utils.Utils.*;

public class CreateBusinessUnitStepDefinitions {

    @When("the user attempts to create a business unit")
    public void theUserAttemptsToCreateABusinessUnit(DataTable dataTable) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                CreateBusinessUnit.on(BusinessUnitModel.setData(dataTable).get(0))
        );
    }
    @Then("^the user see the (.*) unit on the list$")
    public void theUserSeeTheUnitOnTheList(String unitName) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateBusinessUnit.onList(TXT_VALIDATION.of(unitName)))
        );
    }

}
