import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage1 extends PageBase{
    public SearchPage1(WebDriver driver) {
        super(driver);
    }
    By Numberofresults = By.id("result-stats");
    By Page2 = By.linkText("2");

    WebElement Numberofresultselement;
    WebElement Page2element;

    public String GetNumberofresults(){
        Numberofresultselement= driver.findElement(Numberofresults);
        return Numberofresultselement.getText();

    }
    public SearchPage2 clickonPage2(){
        Page2element= driver.findElement(Page2);
        Clicking(Page2element);
        return new SearchPage2(driver);
    }



}
