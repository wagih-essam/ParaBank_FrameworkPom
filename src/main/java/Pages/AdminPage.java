package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminPage extends BasePage {
    public AdminPage(WebDriver driver){
        this.driver = driver;
    }

    public LandingPage goToLandingPage(){
        return new LandingPage(driver);
    }
    public AdminPage assertAdminUrl(){
        System.out.println(driver.getCurrentUrl().contains("https://parabank.parasoft.com/parabank/admin.htm"));
        return new AdminPage(driver);
    }

}
