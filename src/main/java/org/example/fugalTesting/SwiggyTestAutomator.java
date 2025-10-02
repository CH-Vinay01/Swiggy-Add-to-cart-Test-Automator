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

        Thread.sleep(45000);

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
        Thread.sleep(1000);
        search.sendKeys("Naidu Gari Kunda Biryani - Vijayawada");
        Thread.sleep(2000);



        WebElement restpress = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/button[1]"));
        restpress.click();
        Thread.sleep(2000);

        WebElement main = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[3]/div[1]/div/a/div[2]"));
        main.click();
        Thread.sleep(2000);

        WebElement searchDish = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[2]/div[6]/button"));
        searchDish.click();
        Thread.sleep(2000);

        WebElement typeDish = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[1]/div/div/div[1]/label/input"));
        typeDish.sendKeys("Chilli Chicken");
        Thread.sleep(2000);


        WebElement add = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div/div/button[2]/div"));
        add.click();
        Thread.sleep(2000);

        WebElement view = driver.findElement(By.xpath("//*[@id=\"view-cart-btn\"]/span/span[1]/span[1]"));
        view.click();
        Thread.sleep(2000);

    }
}
