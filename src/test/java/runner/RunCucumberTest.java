package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},  // report de test
        features = "src/test/resources/features",   // pasta onde fica os features
        tags = {"~@ignore"},  // quando não quiser rodar um teste colacar a tags ignore
        glue = {"steps"}  // pass dos testes
)
public class RunCucumberTest {

    public static WebDriver driver;

    @BeforeClass
    public static void start(){
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void stop(){
        driver.quit();
    }
}

