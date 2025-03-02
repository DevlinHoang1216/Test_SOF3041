package fpt.ontapKiemThu.Bai3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class WebSeleniumTest {

    ChromeDriver chromeDriver;

    @BeforeEach
    public void setUp() {
       WebDriverManager.chromedriver().setup();
       chromeDriver = new ChromeDriver();

    }

    @Test
    public void testYeuCau1() {
        chromeDriver.get("https://lamia.com.vn/san-pham/dam-chu-a-tay-coc-co-tron-phoi-dai-eo-ld413");

        WebElement chooseTheSize = chromeDriver.findElement(By.xpath("//span[normalize-space()='XL']"));
        chooseTheSize.click();

        WebElement addToCart = chromeDriver.findElement(By.xpath("//button[contains(text(),'Thêm vào giỏ')]"));
        addToCart.click();

        WebElement nhapSDT = chromeDriver.findElement(By.xpath("//input[@placeholder='Nhập số điện thoại']"));
        nhapSDT.sendKeys("0971502422");

        WebElement submitSDT = chromeDriver.findElement(By.xpath("//div[@class='form-subscribe-popup']//button[@type='submit'][contains(text(),'Gửi')]"));
        submitSDT.click();


    }

}