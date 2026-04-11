package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_01 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("name")).sendKeys("testing name field");
        driver.findElement(By.name("start")).click();
        driver.findElement(By.linkText("Errorcode 400")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Errorcode")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.className("pagination"));
        driver.findElement(By.tagName("input")).sendKeys("Testing tag name");






    }
}
