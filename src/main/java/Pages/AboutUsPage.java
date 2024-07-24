package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutUsPage {
    private WebDriver driver;

    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void tearDown(){
        driver.quit();
    }

    public AboutUsPage(WebDriver driver){
        this.driver = driver;
    }
}
