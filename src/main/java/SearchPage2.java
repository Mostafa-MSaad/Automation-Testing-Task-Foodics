import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class SearchPage2 extends PageBase{
    public SearchPage2(WebDriver driver) {
        super(driver);
    }
    By Page3 = By.linkText("3");
    By Numberofresultspage2 = By.id("rso");
    WebElement Page3element;
    List<WebElement> Numberofresultspage2element;
    public SearchPage3 clickonPage3(){
        Page3element= driver.findElement(Page3);
        Clicking(Page3element);
        return new SearchPage3(driver);
    }
    public int GetNumberofresultspage2(){
        Numberofresultspage2element=driver.findElements(Numberofresultspage2);
        int size2=Numberofresultspage2element.size();
        return size2;
    }

}
