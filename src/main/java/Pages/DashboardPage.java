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
public class DashboardPage {
    //Lokatori
       private static WebDriver driver;
       By navSignatureLink = By.cssSelector("ul:first-of-type>li:nth-of-type(2)>a");
    //Konstruktori

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    //Metode
    public void clickOnSignatureNavLink(){
        driver.findElement(navSignatureLink).click();
    }
}
