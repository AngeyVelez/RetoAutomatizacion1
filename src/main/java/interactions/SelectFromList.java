package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectFromList implements Interaction {

    protected Target element;
    protected String value;

    public SelectFromList(Target element, String value) {
        this.element = element;
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement dad = element.resolveFor(actor);
        List<WebElement> options = dad.findElements(By.tagName("li"));
        for (WebElement option : options) {
            if (option.getText().contains(value)) {
                option.click();
                break;
            }
        }
    }

    public static SelectFromList on(Target element, String value) {
        return Instrumented.instanceOf(SelectFromList.class).withProperties(element, value);
    }

}
