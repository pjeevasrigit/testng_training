package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test_12_table_pagination {
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']//a"));
        int totalPages = pages.size();

        System.out.println("Total Pages: " + totalPages);

        for (int p = 1; p <= totalPages; p++) {
            driver.findElement(By.xpath("//ul[@id='pagination']//a[text()='" + p + "']")).click();
            Thread.sleep(1000);

            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
            for (int i = 1; i <= rows.size(); i++) {

                // Get columns
                List<WebElement> cols = driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr[" + i + "]/td"));

                for (WebElement col : cols) {
                    System.out.print(col.getText() + " | ");
                }
                System.out.println();
            }
        }
        }


    }

