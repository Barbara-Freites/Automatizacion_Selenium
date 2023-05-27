package ar.com.salud.sancor.clase_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosGet {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        /*Apertura browser*/
        driver.get("https://www.saucedemo.com/");

        System.out.println("Metodo getTitle(): " + driver.getTitle());
        System.out.println("Metodo getCurrentUrl(): " + driver.getCurrentUrl());
        System.out.println("Metodo getPageSource(): " + driver.getPageSource());


        /*Cerrado browser*/
        //driver.close();//cierra ventana actual
        driver.quit();//cierra todas las ventanas abiertas por el driver

    }
}
