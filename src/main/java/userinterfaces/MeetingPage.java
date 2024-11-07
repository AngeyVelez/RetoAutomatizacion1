package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MeetingPage {

    public static final Target BTN_MEETING = Target.the("Meeting option menu on sidebar").locatedBy("//a[@href='#nav_menu1_3_2']");
    public static final Target BTN_MEETINGS = Target.the("Meetings submenu from Meeting").locatedBy("//a[@href='/Meeting/Meeting']");
    public static final Target BTN_ADD_MEETING = Target.the("Add new meeting button").locatedBy("//div[contains(@class, 'add-button')]");
    public static final Target INPUT_MEETING_NAME = Target.the("Meeting name input").locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']");
    public static final Target MEETING_TYPE_DROPDOWN = Target.the("Meeting type dropdown").locatedBy("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId']");
    public static final Target LST_MEETING_TYPE = Target.the("Meeting type list container").locatedBy("//ul[@id='select2-results-6']");
    public static final Target INPUT_MEETING_NUMBER = Target.the("Meeting number input").locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']");
    public static final Target INPUT_MEETING_START_DATE = Target.the("Meeting start date input").locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_StartDate']");
    public static final Target INPUT_MEETING_END_DATE = Target.the("Meeting end date input").locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_EndDate']");
    public static final Target LOCATION_DROPDOWN = Target.the("Location dropdown").locatedBy("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId']");
    public static final Target LST_LOCATION = Target.the("Location list container").locatedBy("//ul[@id='select2-results-7']");
    public static final Target BUSINESS_UNIT_DROPDOWN = Target.the("Business unit dropdown").locatedBy("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId']");
    public static final Target LST_BUSINESS_UNIT = Target.the("Business unit list container").locatedBy("//ul[@id='select2-results-8']");
    public static final Target ORGANIZED_BY_DROPDOWN = Target.the("Organized by dropdown").locatedBy("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId']");
    public static final Target LST_ORGANIZED_BY = Target.the("Organized by list container").locatedBy("//ul[@id='select2-results-9']");
    public static final Target REPORTER_DROPDOWN = Target.the("Reporter dropdown").locatedBy("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId']");
    public static final Target LST_REPORTER = Target.the("Reporter list container").locatedBy("//ul[@id='select2-results-10']");
    public static final Target BTN_SAVE = Target.the("Save button").locatedBy("//div[@data-action='save-and-close']");
    public static final Target TXT_VALIDATION = Target.the("Text to validate the success creation").locatedBy("//*[contains(@class, 'slick-cell')]//*[contains(text(), '{0}')]");

}
