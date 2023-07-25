import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

public class SearchPageTest extends TestBase{



    private HomePage homePage;
    private SearchPage1 searchPage1;
    private SearchPage2 searchPage2;


    @Test
    public void Numberofresults(){

        homePage = new HomePage(driver);
        driver.navigate().to("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.SendtoSearchbar("Panda");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        searchPage1 = homePage.clickonSearchbutton();
        Assert.assertTrue(searchPage1.GetNumberofresults().contains("About ") || searchPage1.GetNumberofresults().contains("حوالى ") );
    }

    @Test
    public void ValidatenumberofresultsANDdiffrenrsuggestions(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)", "");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        searchPage2 =searchPage1.clickonPage2();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        int Resultspage2 =searchPage2.GetNumberofresultspage2();
        js.executeScript("window.scrollBy(0,3000)", "");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        SearchPage3 searchPage3 = searchPage2.clickonPage3();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        int Resultspage3 = searchPage3.GetNumberofresultspage3();
        Assert.assertEquals(Resultspage2,Resultspage3);
        js.executeScript("window.scrollBy(0,3000)", "");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        searchPage3.Getsuggestions();
        Assert.assertNotEquals(searchPage3.sugestion1element, searchPage3.sugestion2element);
    }

}
