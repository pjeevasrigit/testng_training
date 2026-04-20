package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class test_08_select {

    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Select countryDropdown = new Select(driver.findElement(By.id("country")));
        countryDropdown.selectByVisibleText("India");
        //colors
        Select colorsDropdown = new Select(driver.findElement(By.id("colors")));
        colorsDropdown.selectByValue("green");

        Select animalDropdown = new Select(driver.findElement(By.id("animals")));
        animalDropdown.selectByIndex(2);

        List<WebElement> options = animalDropdown.getOptions();
        System.out.println("Number of options: " + options.size());
        for(WebElement option:options){
            System.out.println(option.getText());
            if(option.getText().equals("Dog")){
                System.out.println("Test case passed");
            }
        }

    }
}
