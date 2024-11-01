package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateBusinessUnit implements Question<Boolean> {

    private Target element;

    public ValidateBusinessUnit(Target element) {
        this.element = element;
    }

    public static Question<Boolean> onList(Target element) {
        return new ValidateBusinessUnit(element);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return element.resolveFor(actor).isDisplayed();
    }

}
