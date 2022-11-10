package Steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSteps {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        driver = new ChromeDriver();
    }





    @AfterAll
    public static void tearDown(){
        driver.close();
    }

}
