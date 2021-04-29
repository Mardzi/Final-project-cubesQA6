/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

/**
 *
 * @author kromp
 */
public class AdminPage {
    //Lokatori
    private WebDriver driver;
    By navDashboardLink = By.cssSelector("ul:first-of-type>li:nth-of-type(1)>a");
    By navSignatureLink = By.cssSelector("ul:first-of-type>li:nth-of-type(2)>a");
    By navCategoriesLink = By.cssSelector("ul:first-of-type>li:nth-of-type(3)>a");
    By navRegionsLink = By.cssSelector("ul:first-of-type>li:nth-of-type(4)>a");
    By navPortalsLink = By.cssSelector("ul:first-of-type>li:nth-of-type(5)>a");
    By navSourcesLink = By.cssSelector("ul:first-of-type>li:nth-of-type(6)>a");
    By dropdownToggle = By.cssSelector(".dropdown-toggle");
    By logoutButton = By.cssSelector(".fa-sign-out");
    WebDriverWait waitMe = new WebDriverWait(driver, 2, 50);
    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clickOnDashboardNavLink(){
        driver.findElement(navDashboardLink).click();
    }
    public void clickOnSignatureNavLink(){
        driver.findElement(navSignatureLink).click();
    }
    public void clickOnCategoriesNavLink(){
        driver.findElement(navCategoriesLink).click();
    }
    public void clickOnRegionsNavLink(){
        driver.findElement(navRegionsLink).click();
    }
    public void clickOnPortalsNavLink(){
        driver.findElement(navPortalsLink).click();
    }
    public void clickOnSourcesNavLink(){
        driver.findElement(navSourcesLink).click();
    }
    public void clickOnCubesDropDownMenu(){
        driver.findElement(dropdownToggle).click(); 
    }
    public void clickOnLogoutButton(){
        driver.findElement(logoutButton).click();
    }
    public void logout(){
        clickOnCubesDropDownMenu();
        clickOnLogoutButton();
    }
    
    
}
