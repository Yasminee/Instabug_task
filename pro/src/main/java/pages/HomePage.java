package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
public class HomePage {

    private WebDriver driver;
    private By create_new_account = By.xpath("//a[normalize-space()='Create new account']");



    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage Create_new_account()
    {
        driver.findElement(create_new_account).click();
        return new LoginPage(driver);
    }

}
