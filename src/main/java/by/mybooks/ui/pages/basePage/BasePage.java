package by.mybooks.ui.pages.basePage;

import by.mybooks.ui.expectedMessages.ExpectedMessages;
import by.mybooks.ui.pages.authorizationForm.AuthorizationFormLocator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import by.mybooks.ui.driver.Driver;

public class BasePage {

    protected final Logger logger = LogManager.getLogger(getClass());
    protected final WebDriver driver = Driver.getDriver();

    public void open() {
        logger.info("Открытие главной страницы: {}", ExpectedMessages.HOME_PAGE);
        driver.get(ExpectedMessages.HOME_PAGE);
        try {
            clickButtonAcceptCookie();
            logger.info("Cookie закрыты");
            clickButtonCabinet();
            logger.info("Открыта форма авторизации");
        } catch (Exception e) {
            logger.warn("Не удалось принять Cookie: {}", e.getMessage());
        }
    }

    public void clickButtonAcceptCookie() {
        logger.info("Принятие Cookie");
        driver.findElement(By.xpath(BasePageLocator.BUTTON_ACCEPT_COOKIE)).click();
    }

    public void clickButtonCabinet() {
        logger.info("Открытие формы авторизации");
        driver.findElement(By.xpath(BasePageLocator.BUTTON_CABINET)).click();
    }

    public void waitTime(int waitTimeMilliseconds) throws InterruptedException {
        logger.info("Ожидание: {}", waitTimeMilliseconds);
        Thread.sleep(waitTimeMilliseconds);
    }
}
