package org.example.fugalTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

class SwiggyTestAutomator {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.swiggy.com/");

        WebElement signin = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/div"));
        signin.click();

        Thread.sleep(90000);

        WebElement loc = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[2]/div[1]/div/div[2]"));
        loc.click();

        Thread.sleep(2000);

        WebElement currloc = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[2]/div[1]/div/div[3]/div[1]"));
        currloc.click();
        Thread.sleep(2000);

        WebElement rest = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[2]/div[2]/div/div[1]/div"));
        rest.click();
        Thread.sleep(2000);

        WebElement search = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div/form/div/div[1]/input"));
        search.click();
        Thread.sleep(2000);

        WebElement





    }
}
