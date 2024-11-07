package tasks;

import interactions.SelectFromList;
import models.BusinessUnitLombok;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.BusinessUnitPage.*;

public class CreateBusinessUnit implements Task {

    protected BusinessUnitLombok businessUnitLombok;

    public CreateBusinessUnit(BusinessUnitLombok businessUnitLombok) {
        this.businessUnitLombok = businessUnitLombok;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ORGANIZATION, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BTN_ORGANIZATION),
                JavaScriptClick.on(BTN_BUSINESS_UNIT),
                JavaScriptClick.on(BTN_ADD_BUSINESS_UNIT),
                Enter.theValue(businessUnitLombok.getUnitName()).into(INPUT_BUSINESS_UNIT),
                Click.on(DROPDOWN),
                SelectFromList.on(LST_DROPDOWN, businessUnitLombok.getBusiness()),
                JavaScriptClick.on(BTN_SAVE)
        );
    }

    public static CreateBusinessUnit on(BusinessUnitLombok businessUnitLombok) {
        return Instrumented.instanceOf(CreateBusinessUnit.class).withProperties(businessUnitLombok);
    }
}
