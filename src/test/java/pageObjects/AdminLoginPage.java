package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminLoginPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='nav-user-section']")
    WebElement navLoginButtonXpath;
    @FindBy(id = "login-email")
    WebElement usernameId;
    @FindBy(id = "login-password")
    WebElement passwordId;
    @FindBy(id = "login-submit")
    WebElement loginButtonId;
    @FindBy(xpath = "//h2[contains(text(),'Welcome back, ')]")
    WebElement verifyLoginXpath;
    @FindBy(xpath = "//button[contains(@class,'user-pill')]")
    WebElement navUserDropDownXpath;
    @FindBy(xpath = "(//span[text()=('Admin Panel')])[1]")
    WebElement selectAdminPanelXpath;
    @FindBy(xpath = "//button[contains(.,'Approvals')]")
    WebElement selectApprovalButtonXpath;
    @FindBy(xpath = "//input[@placeholder='Search by name or email...']")
    WebElement searchByEmailXpath;
    @FindBy(xpath = "//button[contains(text(),'Approve')]")
    WebElement approveButtonXpath;
    @FindBy(xpath = "//button[contains(.,'Users')]")
    WebElement selectUsersButtonXpath;
    @FindBy(xpath = "//select/option[@value='admin']")
    WebElement selectAdminUserXpath;

    public AdminLoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickNavLoginButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(navLoginButtonXpath));
        navLoginButtonXpath.click();
    }
    public void enterUsername(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(usernameId));
        usernameId.sendKeys(email);
    }
    public void enterPassword(String password) {
        passwordId.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButtonId.click();
    }
    public void verifyLoginSuccessfully(){
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifyLoginXpath));
        verifyLoginXpath.isDisplayed();
    }
    public void clickNavUserDropDown(){
        navUserDropDownXpath.click();
    }
    public void clickAdminPanel(){
        selectAdminPanelXpath.click();
    }
    public void clickApprovalButton(){
        selectApprovalButtonXpath.click();
    }
    public void clickSearchByEmail(){
        searchByEmailXpath.sendKeys("");
    }
    public void clickApproveButton(){
        approveButtonXpath.click();
    }
    public void clickUsersButton(){
        selectUsersButtonXpath.click();
    }
    public void makeUserAdmin(){
        selectAdminUserXpath.click();
    }

}
