package com.organgehrmlive.demo.testsuit;

import com.organgehrmlive.demo.pages.HomePage;
import com.organgehrmlive.demo.pages.LoginPage;
import com.organgehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
        public void userShouldLoginSuccessfullyWithValidCredentials(){

        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnSignInButton();
        String expected = "Dashboard";
        Assert.assertEquals(loginPage.verifyText(),"Dashboard","not verify");

    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully (){
        loginPage.clickOnForgot();
        Assert.assertEquals(loginPage.verifyResetText(),"Reset Password","not verify");
    }


}

