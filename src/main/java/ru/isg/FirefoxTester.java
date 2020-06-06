package ru.isg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTester {

    public static void main(String[] args) {

        System.out.println("Starting");

        WebDriver driver = new FirefoxDriver();
        driver.get(args[0]);

        System.out.println(driver.getPageSource());

        driver.quit();

        System.out.println("Successfully finished");
    }
}