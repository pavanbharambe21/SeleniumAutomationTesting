import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumFirstProgram {

    public static void main(String[] args) {
        String browserName ="Edge";
        WebDriver driver = null;
        if(browserName.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if(browserName.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(browserName.equals("FireFox")){
            System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
            WebDriverManager.firefoxdriver().setup();

        }

        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.cssSelector("input[placeholder='Search")).sendKeys("HP");
        driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();

    }
}
