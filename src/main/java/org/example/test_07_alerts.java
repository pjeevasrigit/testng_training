package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_07_alerts {
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
        Thread.sleep(2000);
        String alert = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept(); // accept an alert
        System.out.println(alert);
        driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();
        driver.switchTo().alert().dismiss(); // dismiss an alert
        driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
        driver.switchTo().alert().sendKeys("enter inside alert");
        driver.switchTo().alert().accept(); // accept an alert
    }

    //Simple Alert
}
