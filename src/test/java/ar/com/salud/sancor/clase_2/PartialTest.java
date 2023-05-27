package ar.com.salud.sancor.clase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //Ejemplo con error (Ponemos algo diferente en el texto del link (a) del HTML)
        //WebElement link = driver.findElement(By.partialLinkText("Crean"));


        //Ejemplo sin error: (Ponemos solo una parte del texto en el link (a) del HTML)
        //Si sabemos que esta palabra siempre nos devolverá lo que necesitamos, todo bien, sino es mejor usar .link
        WebElement link = driver.findElement(By.partialLinkText("Crea"));

        driver.quit();
    }
}
