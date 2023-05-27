package ar.com.salud.sancor.clase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //Ejemplo con error (Modificamos la "c", se puso en minúscula)
        //WebElement ejemplo = driver.findElement(By.id("globalcontainer"));

        //Ejemplo sin error (Ponemos el texto exacto que figura en el ID de un div)
        WebElement ejemplo = driver.findElement(By.id("globalContainer"));

       //Ejemplo 2 sin error
        WebElement ejemplo2 = driver.findElement(By.id("reg_pages_msg"));

       driver.quit();
    }
}
