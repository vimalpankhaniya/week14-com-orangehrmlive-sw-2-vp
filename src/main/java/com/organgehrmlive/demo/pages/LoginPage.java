package com.organgehrmlive.demo.pages;

import com.organgehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By username = By.name("username");
    By password = By.name("password");
    By LoginText = By.xpath("//button[@type ='submit']");

    By verifyMessage =By.xpath("//h6[normalize-space()='Dashboard']");
    By clickOnforgot = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]");
    By resetText =By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]");
    public void enterUserName(String username1) {
        sendTextToElement(username,username1);
    }

    public void enterPassword(String password1) {
        sendTextToElement(password,password1);
    }
    public void clickOnSignInButton() {
        clickOnElement(LoginText);

}
    public String verifyText() {
        return getTextFromElement(verifyMessage);
    }
    public void clickOnForgot (){
        clickOnElement(clickOnforgot);
    }
    public String verifyResetText(){
        return getTextFromElement(resetText);
    }
}