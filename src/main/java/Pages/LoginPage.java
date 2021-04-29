package pages;

// Lokatori po nacinu selekcije

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    
    //Lokatori
    public WebDriver driver;
    private By emailFieldLocator = By.name("email");
    private By passwordFieldLocator = By.name ("password");
    private By loginButtonLocator = By.className("btn-primary");
    
    //Konstruktori

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    //Metode
    
    public void enterEmail(String email){
        driver.findElement(emailFieldLocator).sendKeys(email);
    }
    public void enterPassword(String password){
        driver.findElement(passwordFieldLocator).sendKeys(password);
    }
    
    public void clickOnLoginButton(){
        driver.findElement(loginButtonLocator).click();
    }
    
    public void pageload(String url){
        driver.get(url);
    }
    public void login(){
        enterEmail("qa@cubes.rs");
        enterPassword("cubesqa");
        clickOnLoginButton();
    }
    
    

}
