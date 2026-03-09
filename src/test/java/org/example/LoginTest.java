package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

        @Test
        public void testGoogle() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            System.out.println("Title: " + driver.getTitle());
            driver.quit();
        }
    }

