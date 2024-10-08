package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myBrowser = new ChromeDriver();
        myBrowser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        myBrowser.manage().window().maximize();
        Thread.sleep(300);
        myBrowser.findElement(By.name("username")).sendKeys("Admin");
        myBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        myBrowser.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3000);
        myBrowser.findElement(By.cssSelector("span[class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
        Thread.sleep(3000);
        myBrowser.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']")).click(); //Add
        Thread.sleep(3000);
        myBrowser.findElement(By.cssSelector("div[class='oxd-select-text-input']")).click(); //User Role Field Drop-Down
        Thread.sleep(3000);
        WebElement dropdownOption = myBrowser.findElement(By.xpath("//div[@role='option'][contains(.,'Admin')]")); // User Role
        dropdownOption.click();

        myBrowser.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click(); //Status filed
        Thread.sleep(3000);
        WebElement dropdownUserRole = myBrowser.findElement(By.xpath("//div[@role='option'][contains(.,'Enabled')]"));
        dropdownUserRole.click();

        myBrowser.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("M"); //Employee Name filed
        Thread.sleep(3000);
        WebElement dropdownEmployeeName = myBrowser.findElement(By.xpath("//INPUT[@data-v-75e744cd='']"));
        dropdownEmployeeName.click();


        myBrowser.quit();


    }
}