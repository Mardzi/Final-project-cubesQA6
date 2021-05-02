
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class EditPortalsPage {
    public WebDriver driver;
    
    
    public EditPortalsPage(WebDriver driver) {
        this.driver = driver;
    }
    By titleInputField = By.id("title");
    By urlInputField = By.id("url");
    By savePortalButton = By.id("save-portal-button");
    By successMessage = By.cssSelector("div.alert-success");
    By errorMessage = By.cssSelector("div.alert-danger");
    
    public void enterNewTitle(String newTitle){
        driver.findElement(titleInputField).clear();
        driver.findElement(titleInputField).sendKeys(newTitle);
    }
    public void enterNewUrl(String url){
        driver.findElement(urlInputField).clear();
        driver.findElement(urlInputField).sendKeys(url);
    }
    public void selectDropDownMenu(){
        Select portalDropDown = new Select(driver.findElement(By.cssSelector("select.form-control")));
        portalDropDown.selectByIndex(1);
    }
    public void savePortalButton (){
        driver.findElement(savePortalButton).click();
    }
    public String successMessage(){
        return driver.findElement(successMessage).getText();
    }
    public String errorMessage(){
        return driver.findElement(errorMessage).getText();
    }
}

