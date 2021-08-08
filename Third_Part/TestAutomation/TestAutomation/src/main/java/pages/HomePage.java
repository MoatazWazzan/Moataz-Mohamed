package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage {
    private WebDriver driver;
    WebElement textElement;
    WebElement imageElement;
    WebElement luckyButtonElement;
    WebElement searchButton;


    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public boolean findLogo()
    {
      imageElement= driver.findElement(By.id("hpcta"));
      return imageElement.isDisplayed();
    }

    public boolean findTextBox()
    {
        textElement=driver.findElement(By.xpath("//input[@title='Search']"));
        return textElement.isDisplayed();
    }
    public boolean findLuckyButton()
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOf(luckyButtonElement));
        luckyButtonElement=driver.findElement(By.xpath("(//input[@name='btnI'])[1]"));
        return luckyButtonElement.isEnabled();

    }

    public boolean findSearchButton()
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        searchButton=driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[1]"));
        return searchButton.isEnabled();
    }

    public SearchPage search(String input)
    {
        textElement.sendKeys(input);
        textElement.sendKeys(Keys.ENTER);
        //searchButton.click();
        return new SearchPage(driver);

    }

}
