package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewUserRegistrationPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='nav-user-section']")
    WebElement navLoginButtonXpath;
    @FindBy(id = "signup-toggle")
    WebElement signupUserId;
    @FindBy(id = "register-firstName")
    WebElement registerFirstNameId;
    @FindBy(id = "register-lastName")
    WebElement registerLastNameId;
    @FindBy(id = "register-email")
    WebElement registerEmailId;
    @FindBy(id = "register-password")
    WebElement registerPasswordId;
    @FindBy(id = "register-confirmPassword")
    WebElement registerConfirmPasswordId;
    @FindBy(id = "register-group")
    WebElement registerGroupId;
    @FindBy(id = "register-submit")
    WebElement registerSubmitId;

    public NewUserRegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLoginButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(navLoginButtonXpath));
        navLoginButtonXpath.click();
    }
    public void clickSignUpUser(){
        signupUserId.click();
    }
    public void registerFirstName(String firstname){
        registerFirstNameId.sendKeys(firstname);
    }
    public void registerLastName(String lastname){
        registerLastNameId.sendKeys(lastname);
    }
    public void registerEmailAddress(String email){
        registerEmailId.sendKeys(email);
    }
    public void registerNewPassword(String password){
        registerPasswordId.sendKeys(password);
    }
    public void registerConfirmPassword(String confirmPassword){
        registerConfirmPasswordId.sendKeys(confirmPassword);
    }
    public void registerGroup(){
        registerGroupId.sendKeys("group 5 assignment");
    }
    public void clickCreateButton(){
        registerSubmitId.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();
        driver.quit();
    }

}
