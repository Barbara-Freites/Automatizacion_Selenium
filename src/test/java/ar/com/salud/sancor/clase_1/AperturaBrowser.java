package ar.com.salud.sancor.clase_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AperturaBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");

        //Creamos un webdriver del tipo browser
        WebDriver driver = new ChromeDriver();

        //Mediante el método get, indicamos la URL a visitar (apertura del browser)
        driver.get("https://www.google.com/");

        /*Cerrado browser*/
        //driver.close();//cierra ventana actual
        driver.quit();//cierra todas las ventanas abiertas por el driver

    }
}
