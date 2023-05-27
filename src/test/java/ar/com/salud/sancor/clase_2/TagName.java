package ar.com.salud.sancor.clase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //Ejemplo con error
        //driver.findElement(By.tagName("dkjwkldjidiwwd"));

        //Ejemplo sin error
        //driver.findElement(By.tagName("img"));

        //Usando el Web Element (metemos el driver en una variable)
        WebElement imagen = driver.findElement(By.tagName("img"));

        driver.quit();
    }
}
