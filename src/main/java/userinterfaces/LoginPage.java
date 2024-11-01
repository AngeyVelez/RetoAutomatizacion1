package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target INPUT_USERNAME = Target.the("Input User").locatedBy("#LoginPanel0_Username");
    public static final Target INPUT_PASSWORD = Target.the("Input Password").locatedBy("#LoginPanel0_Password");
    public static final Target BTN_LOGIN = Target.the("Button Login").locatedBy("#LoginPanel0_LoginButton");
    public static final Target LBL_TITLE = Target.the("Label Dashboard").locatedBy("//h1");

}
