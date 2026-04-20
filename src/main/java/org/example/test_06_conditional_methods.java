package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class test_06_conditional_methods {
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/"); // web page launch type 1
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        boolean flagVal = driver.findElement(By.cssSelector("#email")).isDisplayed();


        //WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));

        System.out.println(flagVal);
        driver.findElement(By.cssSelector("#email")).sendKeys("test@gmail.com");
        boolean enableVal = driver.findElement(By.cssSelector("#phone")).isEnabled();
        System.out.println(enableVal);
        driver.findElement(By.cssSelector("#phone")).sendKeys("45646546");
        boolean selectedFlag = driver.findElement(By.cssSelector("input[class='form-check-input'][value='male']")).isSelected();
        System.out.println("Before selection "+selectedFlag);
        driver.findElement(By.cssSelector("input[class='form-check-input'][value='male']")).click();
        boolean selectedFlag1 = driver.findElement(By.cssSelector("input[class='form-check-input'][value='male']")).isSelected();
        System.out.println("After selection "+selectedFlag1);
    }
    }
