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
    public DashboardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver_90.exe");
        DashboardPage dashboardpage = new DashboardPage(driver);
        driver = new ChromeDriver();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.pageload("http://bvtest.school.cubes.rs/login");
        loginPage.enterEmail("qa@cubes.rs");
        loginPage.enterPassword("cubesqa");
        loginPage.clickOnLoginButton();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSignatureNavLink(){
//       WebElement signature = driver.findElement(By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[1]/li[2]/a")); 
       DashboardPage dashboardPage = new DashboardPage(driver);
       dashboardPage.clickOnSignatureNavLink();
}
}
