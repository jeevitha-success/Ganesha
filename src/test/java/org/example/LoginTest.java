package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginTest {

        @Test
        public void testGoogle() {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");

            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver(options);

            driver.get("https://www.google.com");
            System.out.println(driver.getTitle());

            driver.quit();
        }
    }

