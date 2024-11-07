package tasks;

import models.LoginLombok;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.LoginPage.*;

public class DoLogin implements Task {

    protected LoginLombok loginLombok;

    public DoLogin(LoginLombok loginLombok) {
        this.loginLombok = loginLombok;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USERNAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(loginLombok.getUsername()).into(INPUT_USERNAME),
                Enter.theValue(loginLombok.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN),
                WaitUntil.the(LBL_TITLE, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static DoLogin onSite(LoginLombok loginLombok) {
        return Instrumented.instanceOf(DoLogin.class).withProperties(loginLombok);
    }

}
