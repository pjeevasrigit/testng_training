package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_14_date_picker {
public static void main(String[] args){
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
    String targetMonth = "May";
    String targetYear = "2027";
    String targetDay = "30";

    while (true){
        String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();

        String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

        if (currentMonth.equals(targetMonth) && currentYear.equals(targetYear)) {
            break;
        } else {
            driver.findElement(By.xpath("//a[@title='Next']")).click();
        }
        //day selection
        driver.findElement(By.xpath("//a[text()='" + targetDay + "']")).click();
    }
}
}
