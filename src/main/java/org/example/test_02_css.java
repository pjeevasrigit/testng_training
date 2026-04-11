package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_02_css {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        boolean flag = driver.findElement(By.cssSelector("label")).isDisplayed();
        System.out.println(flag);
       // driver.findElement(By.cssSelector("#name")).sendKeys("name field Testing");
        driver.findElement(By.cssSelector(".form-control")).sendKeys("name field");
        driver.findElement(By.cssSelector("#email")).sendKeys("test@gmail.com");
        driver.findElement(By.cssSelector("#phone")).sendKeys("45646546");
        driver.findElement(By.cssSelector("label[for='textarea']")).isDisplayed();
        driver.findElement(By.cssSelector("input[class='form-check-input'][value='male']")).click();
        driver.findElement(By.cssSelector("input[class*='form-check'][value='female']")).click();


    }
}
