
package pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



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
    By titleInputField = By.id("title");
    By urlInputField = By.id("url");
    By savePortalButton = By.id("save-portal-button");
    By errorMessage = By.cssSelector("div.alert-danger");
  
    public void clickOnAddPortalButton(){
        driver.findElement(addPortalButton).click();
    }
    
    
    public void clickOnElement(By locator, int elementToClick){
       List <WebElement> locators = driver.findElements(locator);
       locators.get(elementToClick).click();
       int i = locators.size() - 1;
       
    }
    public void clickOnAllElements(By locator ){
       List <WebElement> locators = driver.findElements(locator);
        int u = locators.size() - 1;
        for (int i = 1; i < u; i++) {
           locators.get(i).click();
        }
    }
    
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
