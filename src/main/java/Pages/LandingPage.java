package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {
    String url = "https://eshop.vodafone.com.eg/en/";

    // constructor
    public LandingPage(WebDriver driver){
        this.driver = driver;
    }
    // Locators
    private final By userNameField = By.xpath("//input[@name='username']");
    private final By passWordField = By.xpath("//input[@name='password']");
    private final By loginButton = By.xpath("//input[@value='Log In']");
    private final By forgotButton = By.xpath("//a[contains(text(), 'Forgot login info?')]\n");
    private final By registerButton = By.xpath("//a[contains(text(), 'Register')]");
    private final By aboutUsButton = By.xpath("//ul[@class='leftmenu']//a[contains(text(), 'About Us')]");
    private final By servicesButton = By.xpath("//ul[@class='leftmenu']//a[contains(text(), 'Services')]");
    private final By productsButton = By.xpath("//ul[@class='leftmenu']//a[contains(text(), 'Products')]");
    private final By locationsButton = By.xpath("//ul[@class='leftmenu']//a[contains(text(), 'Locations')]");
    private final By adminButton = By.xpath("//ul[@class='leftmenu']//a[contains(text(), 'Admin Page')]");

    // actions
    public void navigateToEshop(){
        driver.navigate().to(url);
    }

    public void enterUserName(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public void enterPassWord(String password){
        driver.findElement(passWordField).sendKeys(password);
    }
    public void setLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void setForgotButton(){
        driver.findElement(forgotButton).click();
    }
    public void setRegisterButton(){
        driver.findElement(registerButton).click();
    }
    public void setAboutUsButton(){
        driver.findElement(aboutUsButton).click();
    }
    public void setServicesButton(){
        driver.findElement(servicesButton).click();
    }
    public void setProductsButton(){
        driver.findElement(productsButton).click();
    }
    public void setLocationsButton(){
        driver.findElement(locationsButton).click();
    }
    public void setAdminButton(){
        driver.findElement(adminButton).click();
    }

    // navigation pages
    public AboutUsPage aboutUsPage(){
        return new AboutUsPage(driver);
    }
    public AdminPage adminPage(){
        return new AdminPage(driver);
    }
    public SolutionsPage solutionsPage(){
        return new SolutionsPage(driver);
    }
    public ServicesPage servicesPage(){
        return new ServicesPage(driver);
    }
    public ProductsPage productsPage(){
        return new ProductsPage(driver);
    }
    public LocationsPage locationsPage(){
        return new LocationsPage(driver);
    }

}
