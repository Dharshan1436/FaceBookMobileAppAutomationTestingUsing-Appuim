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

public class LoginPage extends TestBase {
    // Page Factory -OR
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement emailId;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement password;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Log in\"]")
    WebElement loginBtn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Create new account\"]")
    WebElement CreateBtn;
    @FindBy(xpath = "//android.view.View[@content-desc=\"Forgot password?\"]")
    WebElement ForgotBtn;

    //Initializing the page Object
    public LoginPage() throws IOException {
        PageFactory.initElements(driver,this);
    }

    //Actions:


    public void Login(String emailId, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        // Wait for email input field to be visible and send keys
        wait.until(ExpectedConditions.visibilityOf(this.emailId));
        this.emailId.sendKeys(emailId);

        // Wait for password input field to be visible and send keys
        wait.until(ExpectedConditions.visibilityOf(this.password));
        this.password.sendKeys(password);

        // Wait for login button to be clickable and click
        wait.until(ExpectedConditions.elementToBeClickable(this.loginBtn));
        this.loginBtn.click();


    }
    public void CreateAccount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(this.CreateBtn));
        this.CreateBtn.click();

    }
    public void ForgetPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(this.ForgotBtn));
        this.ForgotBtn.click();

    }


}
