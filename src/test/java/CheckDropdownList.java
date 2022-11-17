import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.practikum.MainPageObject;

import java.time.Duration;


public class CheckDropdownList {
    private WebDriver driver;

    @Before
    public void OpenBrowser(){
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void CheckDropdownList(){
        MainPageObject mainPageObject = new MainPageObject(driver);
        new WebDriverWait(driver, 3)
                 .until(ExpectedConditions.elementToBeClickable(By.id("accordion__heading-0")));
//By.xpath(".//div[@id = 'accordion__heading-0']"
//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ".//div[@id = 'accordion__heading-0']");
        mainPageObject.clickRentPrice();
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }

}
