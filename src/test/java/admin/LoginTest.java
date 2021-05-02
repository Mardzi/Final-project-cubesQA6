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
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

/**
 *
 * @author kromp
 */
public class LoginTest {
    LoginPage loginPage = new LoginPage(driver);
    
    private static WebDriver driver;
   
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver_90.exe");
        LoginPage loginPage = new LoginPage(driver);
        driver = new ChromeDriver();
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        driver.quit();
    }
    
    @Before
    public void setUp() {
        driver.get("http://bvtest.school.cubes.rs/login");
        
        
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testValidLogin(){
        loginPage.login();
        String expectedHeading = "Dashboard";
        String actualHeading = driver.findElement(By.cssSelector("div.panel-heading")).getText();
        assertTrue("You are not on dashboard page", expectedHeading.equals(actualHeading));
    }
        
    
    @Test
    public void testEmtpyFields(){
        
    }
    @Test
    public void testInvalidMailFormat(){
        
    }
    @Test
    public void testValidMailInvalidPassword(){
        
    }
}
