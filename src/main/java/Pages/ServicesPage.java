package Pages;

import org.openqa.selenium.WebDriver;

public class ServicesPage extends BasePage {

    public ServicesPage(WebDriver driver){
        this.driver = driver;
    }

    public LandingPage goToLandingPage(){
        return new LandingPage(driver);
    }

    public ServicesPage assertServicesUrl(){
        System.out.println(driver.getCurrentUrl().contains("https://parabank.parasoft.com/parabank/services.htm"));
        return new ServicesPage(driver);
    }
}
