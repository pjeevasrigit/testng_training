package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class test_13_table_pagination_select {
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']//a"));
        int totalPages = pages.size();

        System.out.println("Total Pages: " + totalPages);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        for (int p = 1; p <= totalPages; p++) {
            driver.findElement(By.xpath("//ul[@id='pagination']//a[text()='" + p + "']")).click();

            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
            for (int i = 1; i <= rows.size(); i++) {

                String nameRow = driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr[" + i + "]/td[2]")).getText().trim();

                if (nameRow.equalsIgnoreCase("Soundbar")) {
                    WebElement selectCheckbox= driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[4]/input"));
                    selectCheckbox.click();
                    break;
                }
            }
        }
    }

}
