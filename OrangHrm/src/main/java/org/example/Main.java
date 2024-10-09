package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myBrowser = new ChromeDriver();

        // Navigating Webpage.
        myBrowser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        myBrowser.manage().window().maximize();
        Thread.sleep(300);

        // Login using valid credentials.
        myBrowser.findElement(By.name("username")).sendKeys("Admin");
        myBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        myBrowser.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3000);

        // Navigating to Admin menu.
        myBrowser.findElement(By.cssSelector("span[class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
        Thread.sleep(3000);

        // Click on Add button.
        myBrowser.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        Thread.sleep(3000);

        // Navigating to User Role dropdown list and select "Admin".
        myBrowser.findElement(By.cssSelector("div[class='oxd-select-text-input']")).click();
        Thread.sleep(1500);
        WebElement dropdownOption = myBrowser.findElement(By.xpath("//div[@role='option'][contains(.,'Admin')]"));
        dropdownOption.click();

        // Navigating to Status dropdown list and select "Enabled".
        myBrowser.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
        Thread.sleep(1500);
        WebElement dropdownUserRole = myBrowser.findElement(By.xpath("//div[@role='option'][contains(.,'Enabled')]"));
        dropdownUserRole.click();

        // Navigating to Employee Name dropdown list and select "user".
        myBrowser.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("m");
        Thread.sleep(3000);
        WebElement dropdownEmployeeName = myBrowser.findElement(By.xpath("//div[@role='listbox']"));
        dropdownEmployeeName.click();

        // Navigate to Username field and insert "user1"
        myBrowser.findElement(By.xpath("(//INPUT[@data-v-1f99f73c=''])[2]")).sendKeys("newUsername");

        // Navigate to Password field and insert "User123"
        myBrowser.findElement(By.xpath("(//INPUT[@data-v-1f99f73c=''])[3]")).sendKeys("User123");

        // Navigate to Confirm Password field and insert "User123"
        myBrowser.findElement(By.xpath("(//INPUT[@data-v-1f99f73c=''])[4]")).sendKeys("User123");

        // Navigate to Save button and click it
        myBrowser.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(4000);
        myBrowser.quit();
    }
}
