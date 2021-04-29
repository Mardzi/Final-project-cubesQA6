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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DashboardPage;
import pages.EditPortalsPage;
import pages.LoginPage;
import pages.PortalsPage;

/**
 *
 * @author kromp
 */
public class EditPortalsTest {
    private static WebDriver driver;
    LoginPage loginPage = new LoginPage(driver);
    PortalsPage portalsPage = new PortalsPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);
    EditPortalsPage editPortalsPage = new EditPortalsPage(driver);
    public EditPortalsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver_90.exe");
        driver = new ChromeDriver();
    }
    
    @AfterClass
    public static void tearDownClass() {
//         driver.quit();
    }
    
    @Before
    public void setUp() {
        loginPage.pageload("http://bvtest.school.cubes.rs/login");
        loginPage.login();
        dashboardPage.clickOnPortalsNavLink();
        
    }
    
    @After
    public void tearDown() {
//        dashboardPage.clickOnLogoutButton();
    }

    @Test
    public void testEditLastCategory(){
        portalsPage.clickOnLastEditButton();
        editPortalsPage.enterNewTitle("Belgrade Beat");
        editPortalsPage.enterNewUrl("https://belgrade-beat.rs/");
        editPortalsPage.selectDropDownMenu();
        editPortalsPage.savePortalButton();
    }
}
