package com.test.modulr;

import com.cucumber.listener.Reporter;
import com.test.modulr.basepage.BasePage;
import com.test.modulr.propertyreader.PropertyReader;
import com.test.modulr.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends BasePage {

    @Before
    public void openBrowser() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));  //getting browser from property file
        Reporter.assignAuthor("Modulr", "Sweta Jani");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
