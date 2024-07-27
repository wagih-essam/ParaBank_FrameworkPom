package Pages;

import Pages.SubPages.AccountServices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
    private final By successfulLogin = By.xpath("//div[@id='showOverview']//h1");
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

    public LandingPage enterUserName(String username){
        driver.findElement(userNameField).sendKeys(username);
        return new LandingPage(driver);

    }
    public LandingPage enterPassWord(String password){
        driver.findElement(passWordField).sendKeys(password);
        return new LandingPage(driver);
    }
    public LandingPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new LandingPage(driver);
    }
    public void setSuccessfulLogin(){
        String successfullogin = driver.findElement(successfulLogin).getText();
        Assert.assertEquals(successfullogin,"Accounts Overview");
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
    public AccountServices goToAccountServiecsPage(){
        return new AccountServices(driver);
    }

    // navigation pages

}
