package com.fb.qa.testcases;
import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends TestBase {
    public HomePageTest() throws IOException {
    }
    HomePage homePage;
    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        homePage = new HomePage();
        homePage.Login(prop.getProperty("emailId"),prop.getProperty("password"));
        homePage.setUpPage();


    }


    @Test(priority = 1)
    public void friendsPageTest() throws InterruptedException {
         homePage.friendsPage();

    }

    @Test(priority = 2)
    public void videoPageTest() throws InterruptedException {
         homePage.videosPage();



    }

    @Test(priority = 3)
    public  void notificationPageTest() throws InterruptedException {
        homePage.notificationPage();
    }


    @Test(priority = 4)
    public  void messagePageTest(){
        homePage.messagePage();
    }


    @AfterMethod
    public void teatDown(){
        driver.quit();
    }
}
