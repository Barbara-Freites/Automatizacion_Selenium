package ar.com.salud.sancor.clase_2.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class XpRelativos {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //Ejemplo con error (Se puso una palabra cualquier en el atributo a ver si lo conseguía)
        //WebElement xpRelativos = driver.findElement(By.xpath("//input[@type = 'numerico']"));

        //Ejemplo sin error (Se usa Xpath ya que no hay atributos predeterminados para "type" como .type)
        //Se usa el input que es lo que tomamos del HTML y es de tipo texto, entonces con el @ ponemos el atributo
        // del input y el valor del mismo "text".
       // WebElement xpRelativo = driver.findElement(By.xpath("//input[@type = 'text']"));

        //Ejemplo 2 sin error - simulando Linktext
        //--> así se usa el atributo Linktext: driver.findElement(By.linkText("Crea una página"));
        WebElement xpRelativo2 = driver.findElement(By.xpath("//a[text() = 'Crea una página']"));


              driver.quit();
    }
}
