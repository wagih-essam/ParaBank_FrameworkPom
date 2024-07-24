package Pages;

import org.openqa.selenium.WebDriver;

public class LocationsPage extends BasePage {

    public LocationsPage(WebDriver driver){
        this.driver = driver;
    }

    public LandingPage goToLandingPage(){
        return new LandingPage(driver);
    }
    public LocationsPage assertLocationUrl(){
        System.out.println(driver.getCurrentUrl().contains("https://www.parasoft.com/solutions/"));
        return new LocationsPage(driver);
    }

}
