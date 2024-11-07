package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusinessUnitPage {

    public static final Target BTN_ORGANIZATION = Target.the("Organization button").locatedBy("//i[@class='s-sidebar-icon fa fa-sitemap premium-feature']");
    public static final Target BTN_BUSINESS_UNIT = Target.the("Business unit button").locatedBy("//a[@href='/Organization/BusinessUnit']");
    public static final Target BTN_ADD_BUSINESS_UNIT = Target.the("Add business unit button").locatedBy("//*[contains(@class, 'fa-plus-circle')]");
    public static final Target INPUT_BUSINESS_UNIT = Target.the("Business unit name input").locatedBy("//input[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Name']");
    public static final Target DROPDOWN = Target.the("Dropdown list").locatedBy("//div[@id='s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId']");
    public static final Target LST_DROPDOWN = Target.the("Dropdown list container").locatedBy("//ul[@id='select2-results-1']");
    public static final Target BTN_SAVE = Target.the("Save business unit button").locatedBy("//div[@data-action='save-and-close']");
    public static final Target TXT_VALIDATION = Target.the("Text to validate the success creation").locatedBy("//*[contains(@class, 'slick-cell')]//*[contains(text(), '{0}')]");

}
