package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import java.util.List;

import java.util.NoSuchElementException;

public class Driver {
    private Driver() {
    } // default constructor'i oldurmek icin kendim parametresiz constructor yazdim

    // ve de kimse buna erisemesin, dolayisiyla da obje uretemesin diye access modifier'ini private yaptik
    // artik kimmse Drievr class'indan obje uretemez !!!!!
    private static WebDriver driver; // public yapmazsak diger package'lar csagiramaz

    private static int timeout = 5;

    public static WebDriver getDriver() { // return type WeDriver, cunku ben bu methodun bana driver vermesini istiyorum

        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }
        }

        // eger driver'a daha onceden deger atanmamissa, ona new keyword'u ile deger ata,
        // deger atanmis ise dokunma demek
        // boyle yapmazsak methodu yani driver'i her cagirdigimizda yeni bir driver olusmus olur ve
        // islemlerimizi akici sekilde yaptiramayiz
        /*
        Driver.getDriver method'u her calistiginda
        //driver=new ChromeDriver(); komutundan dolayi yeni bir driver olusturuyor
        //Biz Driver class'dan getDriver'i calsitirdigimizda new atamasi olsun
        //sonraki calistirmalarda atama olmasin istiyoruz
        //bunun icin driver= new ChromeDriver(); satiri bir if blogu iicine alacagiz

         */

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }
}