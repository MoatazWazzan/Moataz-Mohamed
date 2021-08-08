package base;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        homePage=new HomePage(driver);
        driver.get("https://www.google.com/?hl=en");
    }

    //Check that google logo exists
    @Test
    public void validateLogoExists()
    {
        Assert.assertTrue(homePage.findLogo());
    }

    //Check that search box exists
    @Test
    public void validateTextBoxExists()
    {
        Assert.assertTrue(homePage.findTextBox());
    }

    //check that search button exists
    @Test
    public void validateSearchButtonExists()
    {
        Assert.assertTrue(homePage.findSearchButton());
    }

    //check that I'm feeling lucky button exists
    @Test
    public void validateLuckyButtonExists()
    {
        Assert.assertTrue(homePage.findLuckyButton());
    }
}

