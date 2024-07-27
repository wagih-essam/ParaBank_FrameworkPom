package somkeTests;

import Pages.LandingPage;
import org.testng.annotations.Test;

public class TestOne extends BaseTest {

    @Test(priority = 2)
    public void loginFunctionality(){
        LandingPage landingPage = new LandingPage(driver);
        wait.until(d -> {
            landingPage.navigation().enterUserName("usernametest")
                    .enterPassWord("passwordtest").clickLoginButton().setSuccessfulLogin();
            return true;
        });
    }

    @Test
    public void validateCurrentUrls(){
        LandingPage landingPage = new LandingPage(driver);
        wait.until(d -> {
        landingPage.navigation().goToAboutUsButton().assertAboutUsUrl()
                .goToLandingPage().backToPreviousPage().goToServicesButton().assertServicesUrl()
                .goToLandingPage().backToPreviousPage().goToProductsButton().assertProductsUrl()
                .goToLandingPage().backToPreviousPage().goToLocationsButton().assertLocationUrl()
                .goToLandingPage().backToPreviousPage().goToAdminButton().assertAdminUrl();
            return true;
        });
    }

    @Test(priority = 1)
    public void creatNewAccount(){
        LandingPage landingPage = new LandingPage(driver);
        wait.until(d -> {
        landingPage.navigation().goToRegisterButton().setFirstNameField("test").setLastNameField("test")
                .setAddressField("test address").setCityField("test city").setStateField("test state")
                .setZipCodeField("123").setPhoneField("0123456789").setSsnField("ssn test")
                .setUserNameRegisterField("usernametest").setPassNameRegisterField("passwordtest")
                .setConfirmRegisterButton("passwordtest").clickRegisterButton().verifySuccessfulResgister();
        return true;
    });
    }

    @Test(priority = 3)
    public void logoutFunctionality(){
        LandingPage landingPage = new LandingPage(driver);
        wait.until(d -> {
            landingPage.navigation().goToAccountServiecsPage().clickOnLogoutButton();
            return true;
        });
    }

    @Test(priority = 4)
    public void openNewAccountFunctionality() {
        LandingPage landingPage = new LandingPage(driver);
        wait.until(d -> {
            creatNewAccount();
//            loginFunctionality();
            landingPage.navigation().goToAccountServiecsPage().clickOnOpenNewAccountButton()
                    .openAccountTypeDropdown("SAVING")
                    .openMinimumDepositDropdown("14232")
                    .clickOnConfirmOpenNewAccountButton().verifyOpenAccountStatus("Account Opened!");
            return true;
        });
        }
}
