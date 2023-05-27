package ar.com.salud.sancor.clase_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosNavigate {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        /*Apertura browser*/
        driver.get("https://www.saucedemo.com/"); // va primero a este

      driver.navigate().to("https://www.facebook.com"); // luego entra a facebook
      driver.navigate().refresh();//refresh pag
      driver.navigate().back();// va de nuevo al paso 1
      driver.navigate().forward();//vuelve a facebook


        /*Cerrado browser*/
        //driver.close();//cierra ventana actual
        driver.quit();//cierra todas las ventanas abiertas por el driver

    }
}
