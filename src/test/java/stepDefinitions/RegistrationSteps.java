package stepDefinitions;

import io.cucumber.java.en.*;
import utils.Base;
import utils.ReadFromFile;

public class RegistrationSteps extends Base {

    @Given("the user in on home login page")
    public void the_user_in_on_home_login_page() {
        newUserRegistrationPage.clickLoginButton();
    }

    @When("the user clicks the register button")
    public void the_user_clicks_the_register_button() {
        newUserRegistrationPage.clickSignUpUser();
    }

    @And("the user enters valid firstname {}")
    public void the_user_enters_valid_firstname(String firstname) {
        newUserRegistrationPage.registerFirstName(firstname);
    }

    @And("the user enters valid lastname {}")
    public void the_user_enters_valid_lastname(String lastname) {
        newUserRegistrationPage.registerLastName(lastname);
    }

    @And("the user enters valid emailaddress {}")
    public void the_user_enters_valid_email(String email) {
        newUserRegistrationPage.registerEmailAddress(email);
    }

    @And("the user enters valid newpassword {}")
    public void the_user_enters_valid_newpassword(String password) {
        newUserRegistrationPage.registerNewPassword(password);
    }

    @And("the user enters valid confirmation Password {}")
    public void the_user_enters_valid_confirmation_Password(String confirmPassword) {
        newUserRegistrationPage.registerConfirmPassword(confirmPassword);
    }

    @And("the user select the group")
    public void the_user_select_the_group() {
        newUserRegistrationPage.registerGroup();
    }

    @Then("the user clicks the create account button")
    public void the_user_click_the_create_account_button() {
        newUserRegistrationPage.clickCreateButton();
    }
}
