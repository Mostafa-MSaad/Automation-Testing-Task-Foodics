import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    By SearchBar = By.name("q");
    //By SearchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");
    By SearchButton = By.name("btnK");

    WebElement Searchbuttonelement;
    WebElement Searchbarelement;

    public void SendtoSearchbar(String text){
        Searchbarelement= driver.findElement(SearchBar);
        Searchbarelement.sendKeys(text);
    }
    public void RemovefromSearchbar(){
        Searchbarelement= driver.findElement(SearchBar);
        //Searchbarelement.sendKeys(Keys.BACK_SPACE);
        Searchbarelement.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public SearchPage1 clickonSearchbutton(){
        Searchbuttonelement= driver.findElement(SearchButton);
        Clicking(Searchbuttonelement);
        return new SearchPage1(driver);
    }

}
