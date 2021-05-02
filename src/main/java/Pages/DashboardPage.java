
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashboardPage {
    //Lokatori
    public WebDriver driver;
    By navDashboardLink = By.cssSelector("ul.nav:first-of-type>li:nth-of-type(1)>a");
    By navSignatureLink = By.cssSelector("ul.nav:first-of-type>li:nth-of-type(2)>a");
    By navCategoriesLink = By.cssSelector("ul.nav:first-of-type>li:nth-of-type(3)>a");
    By navRegionsLink = By.cssSelector("ul.nav:first-of-type>li:nth-of-type(4)>a");
    By navPortalsLink = By.cssSelector("ul.nav:first-of-type>li:nth-of-type(5)>a");
    By navSourcesLink = By.cssSelector("ul.nav:first-of-type>li:nth-of-type(6)>a");
    By dropdownToggle = By.cssSelector(".dropdown-toggle");
    By logoutButton = By.cssSelector(".fa-sign-out");
    By panelHeading = By.cssSelector("div.panel-heading");
    By toggleButton = By.cssSelector("a.pull-right");
    //Konstruktori

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    //Metode
    public void linkToBeCLicked(By link){
        driver.findElement(link).click();
    }
   
    
    public void clickOnSignatureLink(){
        linkToBeCLicked(navSignatureLink);
    }
    public void clickOnCategoriesLink(){
        linkToBeCLicked(navCategoriesLink);
    }
    public void clickOnRegionsLink(){
        linkToBeCLicked(navRegionsLink);
    }
    public void clickOnPortalsLink(){
        linkToBeCLicked(navPortalsLink);
    }
    public void clickOnSourcesLink(){
        linkToBeCLicked(navSourcesLink);
    }
   
    public void clickOnLogoutButton(){
        linkToBeCLicked(dropdownToggle);
        linkToBeCLicked(logoutButton);
    }
    
    public String ButtonTitle(){
        return driver.findElement(toggleButton).getText();
    }
    public String PanelHeading(){
       return driver.findElement(panelHeading).getText();
      
    }
}
