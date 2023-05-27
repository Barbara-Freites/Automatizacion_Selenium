package ar.com.salud.sancor.clase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //Ejemplo con error (Ponemos algo diferente en el texto del link (a) del HTML)
        //WebElement link = driver.findElement(By.linkText("Crear una página"));


        //Ejemplo sin error (Ponemos el texto exacto que figura en el link (a) del HTML)
        WebElement link = driver.findElement(By.linkText("Crea una página"));

        driver.quit();
    }
}
