package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class test_05_methods {
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/"); // web page launch type 1
        driver.manage().window().maximize();

        System.out.println("Previous Title "+driver.getTitle());
        driver.findElement(By.xpath("//a[text()='Udemy Courses']")).click();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url.contains( "https://www.pavanonlinetrainings.com/p/udemy-courses.html")){
            System.out.println("Test is passed");
        }
        System.out.println("Changed Title "+driver.getTitle());
        //System.out.println(driver.getPageSource());
        driver.navigate().to("https://testautomationpractice.blogspot.com/"); // web page launch type 2
        String parentWindow = driver.getWindowHandle();
        System.out.println("This is current window id"+parentWindow); //idDD7EEA3A5A03777D41452B5D02A802F8 //id435A027107CCC7DE93615F211F6F4728
        driver.findElement(By.cssSelector("#PopUp")).click();
        Set<String> allWindows = driver.getWindowHandles();
        List<String> windows = new ArrayList<>(allWindows);
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
            }
        }

        driver.switchTo().window(windows.get(2)); //switch to child window
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Get started']")).click();
        Thread.sleep(2000);
        driver.switchTo().window(parentWindow); // switch to parent window


        driver.close(); // closed the current browser window
        driver.quit(); // closes all the window sessions

    }
}
