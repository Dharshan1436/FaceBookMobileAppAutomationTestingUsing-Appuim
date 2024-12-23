package com.fb.qa.pages;

import com.fb.qa.base.TestBase;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class HomePage extends LoginPage {

    // Page Factory - OR
    @FindBy(xpath = "(//android.widget.Button[@content-desc=\"Not now\"]/android.view.ViewGroup")
    WebElement notNow;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")
    WebElement skip1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]")
    WebElement skip2;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Friends, tab 3 of 6\"]")
    WebElement friends;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Video, tab 2 of 6\"]")
    WebElement Videos;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Messaging\"]/android.view.View")
    WebElement message;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Notifications, tab 5 of 6\"]")
    WebElement notifications;

    // Initializing the page object
    public HomePage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    // Utility method for explicit wait
    private void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Actions
    public void setUpPage() throws InterruptedException {
        Thread.sleep(50000);
        waitForElementToBeClickable(notNow, 50);
        this.notNow.click();

        waitForElementToBeClickable(skip1, 50);
        this.skip1.click();

        waitForElementToBeClickable(skip2, 50);
        this.skip2.click();
    }

    public void friendsPage() {
        waitForElementToBeClickable(friends, 50);
        this.friends.click();
    }

    public void videosPage() {
        waitForElementToBeClickable(Videos, 50);
        this.Videos.click();
    }

    public void notificationPage() {
        waitForElementToBeClickable(notifications, 50);
        this.notifications.click();
    }

    public void messagePage() {
        waitForElementToBeClickable(message, 50);
        this.message.click();
    }
}
