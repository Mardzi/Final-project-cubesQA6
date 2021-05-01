/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PortalsPage {
    public WebDriver driver;
    
    public PortalsPage(WebDriver driver) {
        this.driver = driver;
    }

   
    
    By addPortalButton = By.cssSelector(".pull-right");
    By disableConfirmation = By.xpath("//*[@id=\"portalDisableDialog\"]/div/div/div[3]/button[2]");
    By deleteConfirmation = By.xpath("//*[@id=\"portalDeleteDialog\"]/div/div/div[3]/button[2]");
    By enableConfirmation = By.xpath("//*[@id=\"portalEnableDialog\"]/div/div/div[3]/button[2]");
    By successMessage = By.cssSelector("div.alert-success");
    By enableLocator = By.cssSelector("button[title=\"Enable\"]");
    By disableLocator = By.cssSelector("button[title=\"Disable\"]");
    By deleteLocator = By.cssSelector("button[title=\"Delete\"]");
    By editLocator = By.cssSelector("a[title=\"Edit\"]");
           
       
            
    
    
    
    public void clickOnAddPortalButton(){
        driver.findElement(addPortalButton).click();
    }
    
    // pokusaj skracivanja code
    
    public void clickOnElement(By locator, int elementToClick){
       List <WebElement> locators = driver.findElements(locator);
       locators.get(elementToClick).click();
    }
    //
    public void clickOnLastElement(By locator){
       List <WebElement> locators = driver.findElements(locator);
       int i = locators.size() - 1;
       locators.get(i).click();
    }
    
    public void clickOnFirstEditButton(){
     clickOnElement(editLocator, 1);
    }
    public void clickOnLastEditButton(){
        clickOnLastElement(editLocator);
    }
    public void clickOnLastDisableButton(){
        clickOnLastElement(disableLocator);
    }
    public void clickOnLastDeleteButton(){
        clickOnLastElement(deleteLocator);
    }
    public void clickOnLastEnableButton(){
        clickOnLastElement(enableLocator);
   }
    
    public String checkStatusOfLastPortal(){
        By statusIcon =By.cssSelector("span.label");
    List <WebElement> statusIcons = driver.findElements(statusIcon);
        int i = statusIcons.size();
       return statusIcons.get(i - 1).getText();
    }
    
    public void confirmDisabling(){
        driver.findElement(disableConfirmation).click();
        
    }
    public void confirmEnabling(){
        driver.findElement(enableConfirmation).click();
    }
    public void confirmDeleting(){
        driver.findElement(deleteConfirmation).click();
    }
    public String successMessage(){
        return driver.findElement(successMessage).getText();
    }
    
}
//izlistaj sve enabled/disable opcije.
//lociraj poslednju opciju
//proveri status opcije
// if los promeni else continue

