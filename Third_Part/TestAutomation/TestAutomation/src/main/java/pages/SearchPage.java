package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;
    WebElement wikipediaLinkElement;


    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean findWikipediaPage()
    {
        wikipediaLinkElement=driver.findElement(By.xpath("//h3[text()='Software testing - Wikipedia']"));
        return wikipediaLinkElement.isDisplayed();
    }

    /*public void setInput(String sInput){
        inputText.findElement(searchField).sendKeys(sInput);
    }

     */
}
