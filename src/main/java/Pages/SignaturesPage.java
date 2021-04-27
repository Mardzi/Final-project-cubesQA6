/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author kromp
 */
public class SignaturesPage {
    
    //Lokatori
    private WebDriver driver;
    By portalDropdownMenu = By.cssSelector("div.panel-body div.form-group:nth-of-type(1)");
    By portalSignatureStatusDropdownMenu = By.cssSelector("div.panel-body div.form-group:nth-of-type(2)");
    By firstElementOfDropDownMenu = By.cssSelector("option:nth-of-type(2)");
    By categoryDropdownMenu = By.cssSelector("div.panel-body div.form-group:nth-of-type(1)");
    //Konstruktori

    public SignaturesPage(WebDriver driver) {
        this.driver = driver;
    }

    
    
        
    //Metode
    public void clickOnPortalDropDownMenu(){
        driver.findElement(portalDropdownMenu).click();
        
    }
    public void clickOnFirstItem(){
        driver.findElement(firstElementOfDropDownMenu).click();
    }
}
