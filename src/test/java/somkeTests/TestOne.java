package somkeTests;

import Pages.LandingPage;
import org.testng.annotations.Test;

public class TestOne extends BaseTest {

    @Test
    public void test01(){
        LandingPage landingPage = new LandingPage(driver);
        wait.until(d -> {
            landingPage.navigation();
            landingPage.enterUserName("");
            landingPage.enterPassWord("");
            landingPage.setLoginButton();
            return true;
        });
    }

    @Test
    public void validateCurrentUrls(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.navigation().goToAboutUsButton().assertAboutUsUrl()
                .goToLandingPage().backToPreviousPage().goToServicesButton().assertServicesUrl()
                .goToLandingPage().backToPreviousPage().goToProductsButton().assertProductsUrl()
                .goToLandingPage().backToPreviousPage().goToLocationsButton().assertLocationUrl()
                .goToLandingPage().backToPreviousPage().goToAdminButton().assertAdminUrl();
    }

    @Test
    public void creatNewAccount(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.navigation().goToRegisterButton().setFirstNameField("test").setLastNameField("test")
                .setAddressField("test address").setCityField("test city").setStateField("test state")
                .setZipCodeField("123").setPhoneField("0123456789").setSsnField("ssn test")
                .setUserNameRegisterField("usernametest2").setPassNameRegisterField("passwordtest")
                .setConfirmRegisterButton("passwordtest").clickRegisterButton().verifySuccessfulResgister();
    }
}
