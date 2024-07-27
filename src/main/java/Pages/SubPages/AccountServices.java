package Pages.SubPages;

import Pages.BasePage;
import Pages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountServices extends BasePage {
    public AccountServices(WebDriver driver) {
        this.driver = driver;
    }
    public LandingPage goToLandingPage(){
        return new LandingPage(driver);
    }
    private final By NewAccountButton = By.xpath("//div[@id='leftPanel']//li[1]");
    private final By AccountsOverviewButton = By.xpath("//div[@id='leftPanel']//li[2]");
    private final By transferFundsButton = By.xpath("//div[@id='leftPanel']//li[3]");
    private final By billPayButton = By.xpath("//div[@id='leftPanel']//li[4]");
    private final By findTransactionButton = By.xpath("//div[@id='leftPanel']//li[5]");
    private final By updateContactInfoButton = By.xpath("//div[@id='leftPanel']//li[6]");
    private final By requestLoanButton = By.xpath("//div[@id='leftPanel']//li[7]");
    private final By logoutButton = By.xpath("//div[@id='leftPanel']//li[8]");

    // actions
    public OpenNewAccountPage clickOnOpenNewAccountButton(){
        driver.findElement(NewAccountButton).click();
        return new OpenNewAccountPage(driver);
    }
    public void clickOnAccountsOverviewButton(){
        driver.findElement(AccountsOverviewButton).click();
    }
    public void clickOnTransferFundsButton(){
        driver.findElement(transferFundsButton).click();
    }
    public void clickOnBillPayButton(){
        driver.findElement(billPayButton).click();
    }
    public void clickOnFindTransactionButton(){
        driver.findElement(findTransactionButton).click();
    }
    public void clickOnUpdateContactInfoButton(){
        driver.findElement(updateContactInfoButton).click();
    }
    public void clickOnRequestLoanButton(){
        driver.findElement(requestLoanButton).click();
    }
    public void clickOnLogoutButton(){
        driver.findElement(logoutButton).click();
    }


}
