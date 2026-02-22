package google_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaTest
{

    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\koush\\Downloads\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com");


        driver.manage().window().maximize();


        driver.findElement(By.name("q"))
              .sendKeys("south africa captian in 2026 t20world cup");


        driver.findElement(By.name("q"))
              .sendKeys(Keys.ENTER);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.open('https://fast.com','_blank');");


        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        driver.quit();
    }

}
