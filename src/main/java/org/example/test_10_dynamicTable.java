package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test_10_dynamicTable {
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']//tbody/tr"));
        int rowCount = rows.size();

        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='taskTable']//thead/tr/th"));
        int colCount = cols.size();

        System.out.println("Rows: " + rowCount);
        System.out.println("Columns: " + colCount);

        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j <= colCount; j++) {
                String data = driver.findElement(
                        By.xpath("//table[@id='taskTable']//tbody/tr[" + i + "]/td[" + j + "]")
                ).getText();

                System.out.print(data + " | ");
            }
            System.out.println();
        }




    }
}
