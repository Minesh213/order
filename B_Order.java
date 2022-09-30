package A_Homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B_Order {
    WebDriver driver;
    Alert alert;

    @Test(priority = 1)
    void Openbrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Driver//chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.getTitle();
       }
    @Test(priority = 2)
    void Product(){
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();

    }
    @Test(priority = 3)
    void add() {
        driver.findElement(By.id("add-to-cart-button-3")).click();
        }
    @Test(priority = 4)
    void shopingcart() {
        driver.findElement(By.id("topcartlink")).click();
       driver.findElement(By.className("qty-input")).clear();
       driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.id("updatecart")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
    }
    @Test(priority = 5)
    void checkout() {

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Minesh");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Valand");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("mpvaland123@gmail.com");
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("unify");
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United Kingdom");
        driver.findElement(By.id("BillingNewAddress_StateProvinceId")).sendKeys("Texas");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Leicester");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("111 above lane");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("LE7 7AA");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("447474746525");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
        driver.findElement(By.id("paymentmethod_1")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
    }
    @Test(priority = 6)
    void payment(){
        driver.findElement(By.id("CardholderName")).sendKeys("Mr Minesh Valand");
        driver.findElement(By.xpath("//*[@id=\"checkout-payment-info-load\"]/div/div/div/table/tbody/tr[2]/td[2]/span")).sendKeys("123412341234");
        driver.findElement(By.xpath("//*[@id=\"ExpireMonth\"]")).sendKeys("5");
        driver.findElement(By.xpath("//*[@id=\"ExpireYear\"]")).sendKeys("2025");
        driver.findElement(By.id("CardCode")).sendKeys("123");
        driver.findElement(By.className("button-1 payment-info-next-step-button")).click();


    }

}

