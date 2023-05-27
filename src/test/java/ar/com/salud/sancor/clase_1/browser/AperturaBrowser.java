package ar.com.salud.sancor.clase_1.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AperturaBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        /*Apertura browser*/
        driver.get("https://www.google.com/");

        /*Cerrado browser*/
        //driver.close();//cierra ventana actual
        driver.quit();//cierra todas las ventanas abiertas por el driver

    }
}
