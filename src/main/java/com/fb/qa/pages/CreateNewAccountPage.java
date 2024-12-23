package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static com.fb.qa.base.TestBase.driver;

public class CreateNewAccountPage extends LoginPage {
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Get started\"]/android.view.ViewGroup")
    WebElement GetStart;

    @FindBy(xpath = "com.android.packageinstaller:id/permission_deny_button")
    WebElement deny;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement FirstName;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement LastName;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")
    WebElement next1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.Button[1]")
    WebElement  year;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    WebElement set;

    @FindBy(xpath = "\t\n" +
            "//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")
    WebElement next2;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Male\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement male;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")
    WebElement next3;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement mobileNo;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")
    WebElement next4;

    @FindBy(xpath = "@FindBy(xpath = \"//android.widget.Button[@content-desc=\\\"Next\\\"]/android.view.ViewGroup\")\n" +
            "    WebElement next3;")
    WebElement cca;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement password;

    @FindBy(xpath = "\t\n" +
            "//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")
    WebElement passNext;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]/android.view.ViewGroup")
    WebElement LoginInfoSave;

    @FindBy(xpath = "//android.view.View[@content-desc=\"I already have an account\"]")
    WebElement iHaveAlreadyAccount;

    public CreateNewAccountPage() throws IOException {
        PageFactory.initElements(driver,this);
    }
    //Actions:




    public void signUp(String firstname, String lastName, String mobile, String pass) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Click 'Get Started' button
        wait.until(ExpectedConditions.elementToBeClickable(this.GetStart)).click();


        // Click 'Deny' for permissions
        wait.until(ExpectedConditions.elementToBeClickable(this.deny)).click();
         Thread.sleep(20000);
        // Enter first name
        wait.until(ExpectedConditions.visibilityOf(this.FirstName)).sendKeys(firstname);



        // Enter last name
        wait.until(ExpectedConditions.visibilityOf(this.LastName)).sendKeys(lastName);



        // Click 'Next' button after last name
        wait.until(ExpectedConditions.elementToBeClickable(this.next1)).click();

        // Adjust year using clicks
        for (int i = 0; i < 10; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(this.year)).click();
        }

        // Click 'Set' to confirm the year
        wait.until(ExpectedConditions.elementToBeClickable(this.set)).click();

        // Click 'Next' after setting the year
        wait.until(ExpectedConditions.elementToBeClickable(this.next2)).click();

        // Select gender as Male
        wait.until(ExpectedConditions.elementToBeClickable(this.male)).click();

        // Click 'Next' after selecting gender
        wait.until(ExpectedConditions.elementToBeClickable(this.next3)).click();

        // Enter mobile number
        wait.until(ExpectedConditions.visibilityOf(this.mobileNo)).sendKeys(mobile);

        // Click 'Next' after entering mobile number
        wait.until(ExpectedConditions.elementToBeClickable(this.next4)).click();

        // Click on Country Code Area (cca)
        wait.until(ExpectedConditions.elementToBeClickable(this.cca)).click();

        // Enter password
        wait.until(ExpectedConditions.visibilityOf(this.password)).sendKeys(pass);

        // Click 'Next' after entering password
        wait.until(ExpectedConditions.elementToBeClickable(this.passNext)).click();

        // Save login information
        wait.until(ExpectedConditions.elementToBeClickable(this.LoginInfoSave)).click();
    }
}
