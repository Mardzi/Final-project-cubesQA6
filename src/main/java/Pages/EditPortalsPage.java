/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author kromp
 */
public class EditPortalsPage {
    public WebDriver driver;
    
    
    public EditPortalsPage(WebDriver driver) {
        this.driver = driver;
    }
    By titleInputField = By.id("title");
    By urlInputField = By.id("url");
    By savePortalButton = By.id("save-portal-button");
    
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
        portalDropDown.selectByVisibleText("Beograd");
    }
    public void savePortalButton (){
        driver.findElement(savePortalButton).click();
    }
}

