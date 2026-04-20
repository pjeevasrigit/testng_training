package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class test_09_staticTable {
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        int rows=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
        int col=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[1]//td")).size();
        System.out.println(rows);
        System.out.println(col);

        List<WebElement> tRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));

        for (int i = 1; i < tRows.size(); i++) {   // skip header
            List<WebElement> cols = tRows.get(i).findElements(By.tagName("td"));

            for (WebElement col1 : cols) {
                System.out.print(col1.getText() + " | ");
            }
            System.out.println();
        }

    }
}