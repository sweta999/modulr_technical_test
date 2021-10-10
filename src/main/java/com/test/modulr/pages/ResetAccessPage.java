package com.test.modulr.pages;

import com.test.modulr.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetAccessPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    @FindBy(id = "signInHeading")
    WebElement verifyResetAccessPage;

    public String getResetAccessPage(){
        log.info("Verify the Text, Reset access : " + verifyResetAccessPage.toString());
        return getTextFromElement(verifyResetAccessPage);
    }


}
