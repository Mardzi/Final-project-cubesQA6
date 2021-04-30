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
    By statusEnabled = By.cssSelector("span.span.label-danger");
            
           
       
            
    
    
    
    public void clickOnAddPortalButton(){
        driver.findElement(addPortalButton).click();
    }
    
    public void clickOnFirstEditButton(){
    By editButton = By.cssSelector("a[title=\"Edit\"]");
    List <WebElement> editButtons = driver.findElements(By.cssSelector("a[title=\"Edit\"]"));
    editButtons.get(1).click();
    }
    public void clickOnLastEditButton(){
    By editButton = By.cssSelector("a[title=\"Edit\"]");
    List <WebElement> editButtons = driver.findElements(By.cssSelector("a[title=\"Edit\"]"));
    int i = editButtons.size();
    editButtons.get(i - 1).click();
    }
    public void clickOnLastDisableButton(){
    By disableButton = By.cssSelector("button[title=\"Delete\"]");
    List <WebElement> disableButtons = driver.findElements(By.cssSelector("button[title=\"Disable\"]"));
    int u = disableButtons.size();
    disableButtons.get(u - 1).click();
    }
    public void clickOnLastDeleteButton(){
        By editButton = By.cssSelector("button[title=\"Delete\"]");
    List <WebElement> editButtons = driver.findElements(By.cssSelector("button[title=\"Delete\"]"));
        int i = editButtons.size();
    editButtons.get(i - 1).click();
    }
    public void clickOnLastEnableButton(){
        By editButton = By.cssSelector("button[title=\"Delete\"]");
    List <WebElement> editButtons = driver.findElements(By.cssSelector("button[title=\"Enable\"]"));
        int f = editButtons.size();
    editButtons.get(f - 1).click();
    }
    public void lastAddedTitle(){
        By lastAddedTitle = By.cssSelector(" tr.ui-sortable-handle:last-of-type td:nth-of-type(3)");
        driver.findElement(lastAddedTitle).getText();
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
    
}
//izlistaj sve enabled/disable opcije.
//lociraj poslednju opciju
//proveri status opcije
// if los promeni else continue

