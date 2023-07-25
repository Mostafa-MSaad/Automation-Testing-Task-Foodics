import org.testng.annotations.Test;

public class HomePageTest extends TestBase{

    private HomePage homePage;

    @Test
    public void ValidateSearchbar(){
        homePage = new HomePage(driver);
        homePage.SendtoSearchbar("Bird");
        homePage.RemovefromSearchbar();
    }

    @Test
    public void ValidateSearchbutton(){
        homePage = new HomePage(driver);
        homePage.SendtoSearchbar("Panda");
        homePage.clickonSearchbutton();

    }
}
