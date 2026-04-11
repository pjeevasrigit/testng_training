package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test_03_xpath {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        boolean flag = driver.findElement(By.cssSelector("label")).isDisplayed();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//textarea[@class='form-control' and @id='textarea']")).sendKeys("Test Address");

        //Xpath index
        for(int i=1;i<3;i++){
        WebElement date=driver.findElement(By.xpath("//p[contains(text(),'Date')]["+i+"]"));
        //WebElement date=driver.findElement(By.xpath("//p[contains(text(),'Date')][2]"));
        date.isDisplayed();
        }


        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }
    }
}
