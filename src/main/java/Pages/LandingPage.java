package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {
    String url = "https://parabank.parasoft.com/parabank/index.htm";

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
    public LandingPage navigation(){
        driver.navigate().to(url);
        return this;
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
    public RegisterPage goToRegisterButton(){
        driver.findElement(registerButton).click();
        return new RegisterPage(driver);
    }
    public AboutUsPage goToAboutUsButton(){
        driver.findElement(aboutUsButton).click();
        return new AboutUsPage(driver);
    }
    public ServicesPage goToServicesButton(){
        driver.findElement(servicesButton).click();
        return new ServicesPage(driver);
    }
    public ProductsPage goToProductsButton(){
        driver.findElement(productsButton).click();
        return new ProductsPage(driver);
    }
    public LocationsPage goToLocationsButton(){
        driver.findElement(locationsButton).click();
        return new LocationsPage(driver);
    }
    public AdminPage goToAdminButton(){
        driver.findElement(adminButton).click();
        return new AdminPage(driver);
    }
    public LandingPage backToPreviousPage(){
        driver.navigate().back();
        return new LandingPage(driver);
    }

    // navigation pages

}
