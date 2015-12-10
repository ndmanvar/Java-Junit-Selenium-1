package com.yourcompany.Tests;


import com.yourcompany.Pages.*;
import com.yourcompany.TestRules.Retry;
import com.yourcompany.Tests.SampleSauceTestBase;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.InvalidElementStateException;

import java.util.UUID;

import static org.junit.Assert.*;


/**
 * Created by mehmetgerceker on 12/7/15.
 */

public class SampleSauceTextInputTest extends SampleSauceTestBase {

    public SampleSauceTextInputTest(String os,
                                    String version, String browser, String deviceName, String deviceOrientation) {
            super(os, version, browser, deviceName, deviceOrientation);
    }

    /**
     * Runs a simple test verifying if the email input is functional.
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest() throws InvalidElementStateException, InterruptedException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("http://www.carnival.com/?optimizely_opt_out=true&facx=faclegacy");

        Alert alert = driver.switchTo().alert();

        alert.accept();

        Thread.sleep(5000);

    }


}