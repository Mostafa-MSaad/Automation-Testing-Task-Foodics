import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage3 extends PageBase{
    public SearchPage3(WebDriver driver) {
        super(driver);
    }
    By Numberofresultspage3 = By.id("rso");
    By sugestion1 = By.xpath("//*[@id=\"bres\"]/div/div/div/div/div[5]/div/div[1]/div[1]/a");
    By sugestion2 = By.xpath("//*[@id=\"bres\"]/div/div/div/div/div[5]/div/div[1]/div[2]/a");
    List<WebElement> Numberofresultspage3element;
    WebElement sugestion1element;
    WebElement sugestion2element;

    public int GetNumberofresultspage3(){
        Numberofresultspage3element=driver.findElements(Numberofresultspage3);
        int size3=Numberofresultspage3element.size();
        return size3;
    }
    public void Getsuggestions(){
        sugestion1element =driver.findElement(sugestion1);
        sugestion2element =driver.findElement(sugestion2);
    }


}
