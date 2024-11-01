package tasks;

import interactions.SelectFromList;
import models.BusinessUnitModel;
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

    protected BusinessUnitModel businessUnitModel;

    public CreateBusinessUnit(BusinessUnitModel businessUnitModel) {
        this.businessUnitModel = businessUnitModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ORGANIZATION, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BTN_ORGANIZATION),
                JavaScriptClick.on(BTN_BUSINESS_UNIT),
                JavaScriptClick.on(BTN_ADD_BUSINESS_UNIT),
                Enter.theValue(businessUnitModel.getUnitName()).into(INPUT_BUSINESS_UNIT),
                Click.on(DROPDOWN),
                SelectFromList.on(LST_DROPDOWN, businessUnitModel.getBusiness()),
                JavaScriptClick.on(BTN_SAVE)
        );
    }

    public static CreateBusinessUnit on(BusinessUnitModel businessUnitModel) {
        return Instrumented.instanceOf(CreateBusinessUnit.class).withProperties(businessUnitModel);
    }
}
