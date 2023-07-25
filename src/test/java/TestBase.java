import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
    protected WebDriver driver;

    @BeforeTest
    public void setup(){
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");

    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
