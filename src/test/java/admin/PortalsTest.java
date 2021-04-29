/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PortalsPage;
/**
 *
 * @author kromp
 */
public class PortalsTest {
    private static WebDriver driver;
    private static WebDriverWait wait;
    LoginPage loginPage = new LoginPage(driver);
    PortalsPage portalsPage = new PortalsPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);
    
   
    public PortalsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver_90.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 2);
    }
    
    @AfterClass
    public static void tearDownClass() {
//        driver.quit();
    }
    
    @Before
    public void setUp() {
        loginPage.pageload("http://bvtest.school.cubes.rs/login");
        loginPage.login();
        dashboardPage.clickOnPortalsNavLink();
    }
    
    @After
    public void tearDown() {
        dashboardPage.clickOnLogoutButton();
    }


   
//    @Test
//    public void testEditLastPortal(){
//        portalsPage.clickOnLastEditButton();
//    }
    @Test
    public void testDisableLastPortal() {
        portalsPage.clickOnLastDisableButton(); 
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.confirmDisabling();
        
        
    }
    
    @Test
    
    public void testEnableLastPortal(){
        portalsPage.clickOnLastEnableButton();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.confirmEnabling();
    }
    
    @Test
    public void testDeleteLastPortal() {
        portalsPage.clickOnLastDeleteButton(); 
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.confirmDeleting();
        
        
    }
}
