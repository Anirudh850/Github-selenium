package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SeleniumTest {
    static void main() {


        // Set the driver path
        //C://Users//Anirudh//IdeaProjects//SeleniumTestProject//drivers
        System.setProperty("webdriver.edge.driver", "C://Users//Anirudh//IdeaProjects//SeleniumTestProject//drivers//msedgedriver.exe");

        // Start Edge Session
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.get("https://demoqa.com/");
        driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
        //driver.findElement(By.xpath("(//span[@class='text'])[1]")).click();
        driver.findElement(By.xpath("//span[@class='text' and contains(text(),'Text Box')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement fn = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("userName"))
        );

        fn.sendKeys("Anirudhan");
        //driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Anirudhan");
       // driver.quit();
        driver.findElement(By.id("userEmail")).sendKeys("ani@gmail.com");
        driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']//textarea[@id='currentAddress']")).sendKeys("16/F1, Grace park apts, Chennai");
        driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']//textarea[@id='permanentAddress']")).sendKeys("16/F1, Grace park apts,Chennai");
        driver.findElement(By.xpath("//button[@type='button' and contains (text(), 'Submit')]")).click();

//@Checkbox
        driver.findElement(By.xpath("//span[@class='text' and contains(text(),'Check Box')]")).click();
        driver.findElement(By.xpath("//span[@title='Home']/preceding-sibling::span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
        //driver.findElement(By.xpath("//span[@title='Home']/preceding-sibling::span[@role='checkbox']")).click();
        driver.findElement(By.xpath("//span[@title='Desktop']/preceding-sibling::span[contains(@class, 'switcher_close')]")).click();
//@Radio Button
        driver.findElement(By.xpath("//span[contains(@class,'text') and contains(text(),'Radio Button')]")).click();
        driver.findElement(By.xpath("//input[@id='yesRadio' and @type= 'radio']")).click();
        driver.findElement(By.xpath("//span[@class='text' and contains(text(),'Web Tables')]")).click();
//@Web Tables
        driver.findElement(By.xpath("//button[@type='button' and @id='addNewRecordButton']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anirudh");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("V");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("30");
        driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("40000");
        driver.findElement(By.xpath("//input[@id='department']")).sendKeys("IT");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

//@Buttons
        driver.findElement(By.xpath("//span[@class='text' and contains(text(),'Buttons')]")).click();
        WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement button = waitt.until(
                ExpectedConditions.elementToBeClickable(By.id("doubleClickBtn"))
        );

        new Actions(driver).doubleClick(button).perform();
        driver.findElement(By.xpath("//button[@id='doubleClickBtn']")).click();


//@Links
        driver.findElement(By.xpath("//span[@class='text' and contains(text(),'Links')]")).click();
        driver.findElement(By.xpath("//a[@id='simpleLink']")).click();

//@Upload and Download
        driver.findElement(By.xpath("//a[@id='downloadButton']")).click();




//








        

    }
}
