package com.fb.qa.testcases;
import com.fb.qa.base.TestBase;
import com.fb.qa.pages.CreateNewAccountPage;
import com.fb.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

public class CreateNewAccountPageTest extends LoginPage {
    CreateNewAccountPage createNewAccountPage;
    public CreateNewAccountPageTest() throws IOException {

    }


    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        createNewAccountPage = new CreateNewAccountPage();
        createNewAccountPage.CreateAccount();
    }


    @Test(priority = 1)
    public  void signUpTest() throws InterruptedException {
        createNewAccountPage.signUp("Dharshan","dharsha","9844480769","9844480769");
    }

    @AfterMethod
    public void teatDown(){
        driver.quit();
    }
}
