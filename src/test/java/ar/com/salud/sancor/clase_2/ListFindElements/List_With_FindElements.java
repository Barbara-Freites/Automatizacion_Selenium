package ar.com.salud.sancor.clase_2.ListFindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class List_With_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        List<WebElement> ejemploList = driver.findElements(By.tagName("div"));
        System.out.println("Cantidad de elementos div encontrados:" + ejemploList.size());

        List<WebElement> ejemplo_unico = driver.findElements(By.xpath("//a[text() = 'Crea una página']"));
        System.out.println("Cantidad de elementos //a[text() = 'Crea una página'] encontrados:" + ejemplo_unico.size());

        driver.quit();
    }
}
