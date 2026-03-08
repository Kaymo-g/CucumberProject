package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AdminLoginPage;
import pageObjects.NewUserRegistrationPage;

public class Base {
  BrowserFactory browserFactory = new BrowserFactory();
  final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
  public NewUserRegistrationPage newUserRegistrationPage = PageFactory.initElements(driver, NewUserRegistrationPage.class);
  public AdminLoginPage adminLoginPage = PageFactory.initElements(driver, AdminLoginPage.class);
  TakeScreenshot takeScreenshot = new TakeScreenshot();
}
