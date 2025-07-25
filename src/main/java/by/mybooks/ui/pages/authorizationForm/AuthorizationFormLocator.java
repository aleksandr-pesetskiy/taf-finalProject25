package by.mybooks.ui.pages.authorizationForm;

public class AuthorizationFormLocator {

    public static final String FIELD_LOGIN_PLACEHOLDER = "//div[@id='enter']//div[@class='ok-form-row -input-special data-input-check']/div";
    public static final String FIELD_PASSWORD_PLACEHOLDER = "//div[@id='enter']//div[@class='ok-form-row -input-special data-input-check']/span/div";
    public static final String BUTTON_LOGIN = "//li[@href='#enter']";
    public static final String BUTTON_REGISTRATION = "//li[@href='#registration']";
    public static final String BUTTON_LOGIN_CONFIRMATION = "//div[@id='enter']//button[@class='ok-btn -btn-theme-action -width-full']";
    public static final String FIELD_INPUT_LOGIN = "//div[@id='enter']//input[@name='log_email']";
    public static final String FIELD_INPUT_PASSWORD = "//div[@id='enter']//input[@name='log_password']";
    public static final String LINE_UNDER_LOGIN_OK = "//div[@id='enter']//div[@class='ok-form-row -input-special data-input-check']/span[@class='-input-border']";
    public static final String LINE_UNDER_LOGIN_ERROR = "//div[@id='enter']//div[@class='ok-form-row -input-special data-input-check -state-error']/span[@class='-input-border']";
    public static final String LINE_UNDER_PASSWORD = "//div[@id='enter']//div[@class='ok-form-row -input-special data-input-check']/span/span[@class='-input-border']";
}
