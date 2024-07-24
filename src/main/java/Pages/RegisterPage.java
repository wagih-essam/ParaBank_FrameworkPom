package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    // locatores
    private final By firstNameField = By.xpath("//input[@name='customer.firstName']");
    private final By lastNameField = By.xpath("//input[@name='customer.lastName']");
    private final By addressField = By.xpath("//input[@name='customer.address.street']");
    private final By cityField = By.xpath("//input[@name='customer.address.city']");
    private final By stateField = By.xpath("//input[@name='customer.address.state']");
    private final By zipCodeField = By.xpath("//input[@name='customer.address.zipCode']");
    private final By phoneField = By.xpath("//input[@name='customer.phoneNumber']");
    private final By ssnField = By.xpath("//input[@name='customer.ssn']");
    private final By userNameRegisterField = By.xpath("//input[@name='customer.username']");
    private final By passNameRegisterField = By.xpath("//input[@name='customer.password']");
    private final By confirmRegisterButton = By.xpath("//input[@name='repeatedPassword']");
    private final By registerButton = By.xpath("//input[@value='Register']");
    private final By successfulRegister = By.xpath("//div[@id='rightPanel']/p");

    // actions

    public RegisterPage setFirstNameField(String firstnamefield){
        driver.findElement(firstNameField).sendKeys(firstnamefield);
        return new RegisterPage(driver);
    }
    public RegisterPage setLastNameField(String lastnamefield){
        driver.findElement(lastNameField).sendKeys(lastnamefield);
        return new RegisterPage(driver);
    }
    public RegisterPage setAddressField(String addressfield){
        driver.findElement(addressField).sendKeys(addressfield);
        return new RegisterPage(driver);
    }
    public RegisterPage setCityField(String cityfield){
        driver.findElement(cityField).sendKeys(cityfield);
        return new RegisterPage(driver);
    }
    public RegisterPage setStateField(String statefield){
        driver.findElement(stateField).sendKeys(statefield);
        return new RegisterPage(driver);
    }
    public RegisterPage setZipCodeField(String zipcodefield){
        driver.findElement(zipCodeField).sendKeys(zipcodefield);
        return new RegisterPage(driver);
    }
    public RegisterPage setPhoneField(String phonefield){
        driver.findElement(phoneField).sendKeys(phonefield);
        return new RegisterPage(driver);
    }
    public RegisterPage setSsnField(String ssnfield){
        driver.findElement(ssnField).sendKeys(ssnfield);
        return new RegisterPage(driver);
    }
    public RegisterPage setUserNameRegisterField(String usernameregisterfield){
        driver.findElement(userNameRegisterField).sendKeys(usernameregisterfield);
        return new RegisterPage(driver);
    }
    public RegisterPage setPassNameRegisterField(String passnameregisterfield){
        driver.findElement(passNameRegisterField).sendKeys(passnameregisterfield);
        return new RegisterPage(driver);
    }
    public RegisterPage setConfirmRegisterButton(String confirmregisterbutton){
        driver.findElement(confirmRegisterButton).sendKeys(confirmregisterbutton);
        return new RegisterPage(driver);
    }
    public RegisterPage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return new RegisterPage(driver);
    }
    public void verifySuccessfulResgister(){
        String successfulwelcomemessafe = driver.findElement(successfulRegister).getText();
        Assert.assertEquals(successfulwelcomemessafe,"Your account was created successfully. You are now logged in.");
    }

}
