package Pages.SubPages;

import Pages.BasePage;
import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OpenNewAccountPage extends BasePage {
    public OpenNewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    // locators
    private final By accountTypeDropdown = By.xpath("//select[@class='input'][1]");
    private final By minimumDepositDropdown = By.xpath("//select[@class='input'][2]");
    private final By confirmOpenNewAccountButton = By.xpath("//input[@class='button']");
    private final By openAccountResultField = By.xpath("//div[@ID='openAccountResult']//h1");
    private final By openAccountResultMessage = By.xpath("//div[@id='openAccountResult']//p[1]");

    // actions
    public OpenNewAccountPage openAccountTypeDropdown(String option){
        driver.findElement(accountTypeDropdown).sendKeys(option, Keys.ENTER);
        return new OpenNewAccountPage(driver);
    }
    public OpenNewAccountPage openMinimumDepositDropdown(String deposit){
        driver.findElement(minimumDepositDropdown).sendKeys(deposit, Keys.ENTER);
        return new OpenNewAccountPage(driver);
    }
    public OpenNewAccountPage clickOnConfirmOpenNewAccountButton(){
        driver.findElement(confirmOpenNewAccountButton).click();
        return new OpenNewAccountPage(driver);
    }
    public void verifyOpenAccountStatus(String status){
        String excpectedopenstatus = driver.findElement(openAccountResultField).getText();
//        String excpectedopenmessage = driver.findElement(openAccountResultMessage).getText();
        Assert.assertEquals(excpectedopenstatus,status);
//        Assert.assertEquals(excpectedopenmessage,message);
    }
}
