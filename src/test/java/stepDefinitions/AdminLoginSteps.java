package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Base;

public class AdminLoginSteps extends Base {

    @Given("the admin user is on login page")
    public void the_admin_user_is_on_login_page() {
        adminLoginPage.clickNavLoginButton();
    }
    @And("the admin user enters valid email {}")
    public void the_admin_user_enters_valid_email(String email) {
        adminLoginPage.enterUsername(email);
    }
    @And("the admin user enters valid password {}")
    public void the_admin_user_enters_valid_password(String password) {
        adminLoginPage.enterPassword(password);
    }
    @And("the admin user clicks the login button")
    public void the_admin_user_clicks_the_login_button() {
        adminLoginPage.clickLoginButton();
    }
    @Then("the admin user has logged in successfully")
    public void the_admin_user_has_logged_in_successfully() throws InterruptedException {
        adminLoginPage.verifyLoginSuccessfully();
    }
    @When("the admin user clicks on the user dropdown menu")
    public void the_admin_user_clicks_on_the_user_dropdown_menu() {
        adminLoginPage.clickNavUserDropDown();
    }
    @And("the admin user clicks on the admin panel option")
    public void the_admin_user_clicks_on_the_admin_panel() {
        adminLoginPage.clickAdminPanel();
    }
    @And("the admin user clicks on the approval button")
    public void the_admin_user_clicks_on_the_approval_button() {
        adminLoginPage.clickApprovalButton();
    }
    @And("the admin search by email address {}")
    public void the_admin_search_by_email_address(String emailAddress) {
        adminLoginPage.clickSearchByEmail(emailAddress);
    }
    @Then("the admin user clicks on the approve button")
    public void the_admin_user_clicks_on_the_approve_button() {
        adminLoginPage.clickApproveButton();
    }
    @When("the admin user clicks on the users button")
    public void the_admin_user_clicks_on_the_users_button() {
        adminLoginPage.clickUsersButton();
    }
    @Then("the admin user change the user role to admin")
    public void the_admin_user_change_the_user_type() {
        adminLoginPage.makeUserAdmin();
    }
}
