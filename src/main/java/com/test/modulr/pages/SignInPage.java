package com.test.modulr.pages;

import com.test.modulr.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    @FindBy(xpath = "//input[@id='username-inp']")    //id = "username-inp"
    WebElement usernameField;
    @FindBy(xpath = "//input[@id='password-inp']")   //id = "password-inp"
    WebElement passwordField;
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement signInButton;
    @FindBy(xpath = "//a[@id='forgotPasswordHref']") //id = "forgotPasswordHref"
    WebElement forgotPasswordButton;
    @FindBy(xpath = "//div[contains(text(),'This field is required')]")
    WebElement errorMessageFieldEmpty;
    @FindBy(xpath = "//body/app-root[1]/app-signin[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]")
    WebElement errorMessageInvalidCredentials;

    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
        log.info("Enter Username : " + username + " to username field : " + usernameField.toString());
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
        log.info("Enter password : " + password + "to password field : " + passwordField.toString());
    }

    public void clickOnSignInButton(){
        clickOnElement(signInButton);
        log.info("Clicking on Sign In Button : " + signInButton.toString());
    }

    public void clickOnForgotPasswordButton(){
        clickOnElement(forgotPasswordButton);
        log.info("Clicking on Forgot Password Button : " + forgotPasswordButton.toString());
    }

    public String getErrorMessageForFieldEmpty(){
        log.info("Error Message for Empty Field: " + errorMessageFieldEmpty.toString());
        return getTextFromElement(errorMessageFieldEmpty);
    }

    public String getErrorMessageForInvalidCredentials(){
        log.info("Error Message for Invalid Credentials: " + errorMessageInvalidCredentials.toString());
        return getTextFromElement(errorMessageInvalidCredentials);
    }

}
