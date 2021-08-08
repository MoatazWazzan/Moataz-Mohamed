package seach;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchTests extends BaseTests {
    private WebDriver driver;

    //Validate search functionality by checking that one of the search results is Wikipedia
    @Test
    public void ValidateWikipediaLinkIsFound()
        {
        var searchPage = homePage.search("Software testing");
        Assert.assertTrue(searchPage.findWikipediaPage());
    }
}
