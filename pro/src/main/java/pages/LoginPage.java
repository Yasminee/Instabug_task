package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class LoginPage {
    private WebDriver driver;

    private By first_name = By.xpath("//input[@name='firstname']");
    private By Surname = By.xpath("//input[@name='lastname']");
    private By mobile_number_or_email_address = By.xpath("//input[@name='reg_email__']");
    private By password = By.xpath(" //input[@name='reg_passwd__']");
    WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
    WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
    WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
    private By gender_select = By.xpath(" //input[@value='1']");

    private By SignUp = By.xpath(" //button[@name='websubmit']");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setFirst_name(String user)
    {
        driver.findElement(first_name).sendKeys(user);
    }
    public void setSurname(String user)
    {
        driver.findElement(Surname).sendKeys(user);
    }
    public void setMobile_number_or_email_address(String emailAddress)
    {
        driver.findElement(mobile_number_or_email_address).sendKeys(emailAddress);
    }
    public void setPassword(String Password)
    {
        driver.findElement(password).sendKeys(Password);
    }
    public void set_day(String Day)
    {
        Select dropdown_day = new Select(day);
        dropdown_day.selectByValue(Day);
    }

    public void set_month(String Month)
    {
        Select dropdown_day = new Select(month);
        dropdown_day.selectByValue(Month);
    }

    public void set_year(String Year)
    {
        Select dropdown_day = new Select(year);
        dropdown_day.selectByValue(Year);
    }

    public void set_gender()
    {
        driver.findElement(gender_select).click();
    }

    public Facebook SignUp()
    {
        driver.findElement(mobile_number_or_email_address).click();
        return new Facebook(driver);
    }





}
