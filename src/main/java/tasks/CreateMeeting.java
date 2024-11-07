package tasks;

import interactions.SelectFromList;
import models.MeetingLombok;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.MeetingPage.*;

public class CreateMeeting implements Task {

    protected MeetingLombok meetingLombok;

    public CreateMeeting(MeetingLombok meetingLombok) {
        this.meetingLombok = meetingLombok;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_MEETING, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BTN_MEETING),
                JavaScriptClick.on(BTN_MEETINGS),
                JavaScriptClick.on(BTN_ADD_MEETING),
                Enter.theValue(meetingLombok.getName()).into(INPUT_MEETING_NAME),
                Click.on(MEETING_TYPE_DROPDOWN),
                SelectFromList.on(LST_MEETING_TYPE, meetingLombok.getType()),
                Enter.theValue(meetingLombok.getNumber()).into(INPUT_MEETING_NUMBER),
                Enter.theValue(meetingLombok.getStartDate()).into(INPUT_MEETING_START_DATE),
                Enter.theValue(meetingLombok.getEndDate()).into(INPUT_MEETING_END_DATE),
                Click.on(LOCATION_DROPDOWN),
                SelectFromList.on(LST_LOCATION, meetingLombok.getLocation()),
                Click.on(BUSINESS_UNIT_DROPDOWN),
                SelectFromList.on(LST_BUSINESS_UNIT, meetingLombok.getBusinessUnit()),
                Click.on(ORGANIZED_BY_DROPDOWN),
                SelectFromList.on(LST_ORGANIZED_BY, meetingLombok.getOrganizedBy()),
                Click.on(REPORTER_DROPDOWN),
                SelectFromList.on(LST_REPORTER, meetingLombok.getReporter()),
                JavaScriptClick.on(BTN_SAVE)
        );
    }

    public static CreateMeeting on(MeetingLombok meetingLombok) {
        return Instrumented.instanceOf(CreateMeeting.class).withProperties(meetingLombok);
    }
}
