package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test_04_xpath_advance {
    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement nameField = driver.findElement(By.xpath("//div[@class='form-group']/input[1]")); // child concept
        WebElement email = driver.findElement(By.xpath("//div[@class='post hentry uncustomized-post-template']//div/input[2]")); //Grand child
        WebElement formElements = driver.findElement(By.xpath("//div[@class=\"form-group\"]/parent::div")); //Parent concept
        WebElement tableData = driver.findElement(By.xpath("//tbody[@id=\"rows\"]/following::td")); // return all the values with td inside a table - example of following concept
        WebElement labelValue = driver.findElement(By.xpath("//input[@id='phone']/preceding::label")); // returns all the label values w.r.t phone input field
        WebElement labelValue1 = driver.findElement(By.xpath("//input[@id='name']/following-sibling::label")); //returns all label values followed by name field - following sibling

        List<WebElement> linkElements = driver.findElements(By.xpath("//div[@id='crosscol']//ul//a"));
        for (WebElement headerText : linkElements) {
            System.out.println(headerText.getText());
            }
        }
    }

