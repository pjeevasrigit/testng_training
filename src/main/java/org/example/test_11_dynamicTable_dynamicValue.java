package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test_11_dynamicTable_dynamicValue {
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']//tbody/tr"));
        int rowCount = rows.size();

        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='taskTable']//thead/tr/th"));
        int colCount = cols.size();

        for(int i=1;i<=rows.size();i++){
            String name = driver.findElement(
                    By.xpath("//table[@id='taskTable']//tbody/tr[" + i + "]/td[1]")).getText().trim();
            if(name.equals("Internet Explorer")){
            String cpu = driver.findElement(
                    By.xpath("//table[@id='taskTable']//tbody/tr[" + i + "]/td[4]")
            ).getText();

            System.out.println("Internet Explorer CPU: " + cpu);

            }

            }
            }
        }



