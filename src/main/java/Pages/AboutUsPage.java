package Pages;

import org.openqa.selenium.WebDriver;

public class AboutUsPage extends BasePage {

    public AboutUsPage(WebDriver driver){
        this.driver = driver;
    }
    public LandingPage goToLandingPage(){
        return new LandingPage(driver);
    }

    public AboutUsPage assertAboutUsUrl(){
        System.out.println(driver.getCurrentUrl().contains("https://parabank.parasoft.com/parabank/about.htm"));
        return new AboutUsPage(driver);
    }
}
