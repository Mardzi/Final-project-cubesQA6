/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DashboardPage;
import pages.LoginPage;



/**
 *
 * @author kromp
 */
public class DashboardTest {
    private static WebDriver driver;
    LoginPage loginPage = new LoginPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);
    
    public DashboardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver_90.exe");
        driver = new ChromeDriver();
    }
    
    @AfterClass
    public static void tearDownClass() {
        driver.quit();
    }
    
    @Before
    public void setUp() {
        loginPage.pageload("http://bvtest.school.cubes.rs/login");
        loginPage.login();
    }
    
    @After
    public void tearDown() {
        dashboardPage.clickOnLogoutButton();
       
        
    }

    @Test
    public void testSignatureNavLink(){
        dashboardPage.clickOnSignatureLink();
        String expectedHeading = "Signatures";
        String actualHeading = dashboardPage.PanelHeading();
        assertTrue("You are not on signatures page", expectedHeading.equals(actualHeading));
    }
    
    @Test
    public void testCategoriesNavLink(){
        dashboardPage.clickOnCategoriesLink();
        String expectedButtonTitle = "Add category";
        String actualButtonTitle = dashboardPage.ButtonTitle();
        assertTrue("You are not on categories", expectedButtonTitle.equals(actualButtonTitle));
    }
    @Test
    public void testRegionsNavLink(){
        dashboardPage.clickOnRegionsLink();
        String expectedButtonTitle = "Add region";
        String actualButtonTitle = dashboardPage.ButtonTitle();
        assertTrue("You are not on regions page", expectedButtonTitle.equals(actualButtonTitle));
    }
    @Test
    public void testPortalsNavLink(){
        dashboardPage.clickOnPortalsLink();
        String expectedButtonTitle = "Add portal";
        String actualButtonTitle = dashboardPage.ButtonTitle();
        assertTrue("You are not on portals page", expectedButtonTitle.equals(actualButtonTitle));
    }
   
    @Test
    public void testSourcesNavLink(){
        dashboardPage.clickOnSourcesLink();
        String expectedButtonTitle = "Add source";
        String actualButtonTitle = dashboardPage.ButtonTitle();
        assertTrue("You are not on sources page", expectedButtonTitle.equals(actualButtonTitle));
    }
      

}
