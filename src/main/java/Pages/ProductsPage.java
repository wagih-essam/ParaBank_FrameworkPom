package Pages;

import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public LandingPage goToLandingPage(){
        return new LandingPage(driver);
    }
    public ProductsPage assertProductsUrl(){
        System.out.println(driver.getCurrentUrl().contains("https://www.parasoft.com/products/"));
        return new ProductsPage(driver);
    }
}
