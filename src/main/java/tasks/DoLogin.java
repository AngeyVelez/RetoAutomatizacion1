package tasks;

import models.LoginModel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.LoginPage.*;

public class DoLogin implements Task {

    protected LoginModel loginModel;

    public DoLogin(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USERNAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(loginModel.getUsername()).into(INPUT_USERNAME),
                Enter.theValue(loginModel.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN),
                WaitUntil.the(LBL_TITLE, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static DoLogin onSite(LoginModel loginModel) {
        return Instrumented.instanceOf(DoLogin.class).withProperties(loginModel);
    }

}
