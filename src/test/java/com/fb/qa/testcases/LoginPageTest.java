package com.fb.qa.testcases;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.LoginPage;
import org.testng.annotations.*;

import java.io.IOException;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;

    public LoginPageTest() throws IOException {}

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        
        initialization();
        loginPage = new LoginPage();
    }


    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        System.out.println("Executing login test");
        loginPage.Login(prop.getProperty("emailId"), prop.getProperty("password"));
//        loginPage.Login("dharshan1436@gmail.com", "Navana@6143");
        Thread.sleep(50000);
    }
    @Test(priority = 2)
    public void CreateTest() throws InterruptedException {
        System.out.println("Executing Create test");
       loginPage.CreateAccount();
    }
    @Test(priority = 3)
    public void ForgetPasswordTest() throws InterruptedException {
        System.out.println("Executing Create test");
        loginPage.ForgetPassword();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Closing browser and ending session");
        if (driver != null) {
            driver.quit();
        }
    }
}
