/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import Framework.Helper;
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
import pages.AddPortalPage;

/**
 *
 * @author kromp
 */
public class AddPortalTest {
    private static WebDriver driver;
    LoginPage loginPage = new LoginPage(driver);
    PortalsPage portalsPage = new PortalsPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);
    EditPortalsPage editPortalsPage = new EditPortalsPage(driver);
    AddPortalPage addPortalPage = new AddPortalPage(driver);
    public AddPortalTest() {
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
        dashboardPage.clickOnPortalsLink();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddNewPortal(){
        String addPortal = Helper.generateTitle();
        portalsPage.clickOnAddPortalButton();
        editPortalsPage.enterNewTitle(addPortal);
        editPortalsPage.enterNewUrl("test.testtest.test");
        editPortalsPage.selectDropDownMenu();
        editPortalsPage.savePortalButton();
        String expectedNewTitle = "Portal \""+ addPortal +"\" has been successfully saved!";
        String actualTitle = editPortalsPage.successMessage();
        assertTrue("Portal is not edited.", expectedNewTitle.equals(actualTitle));
    }
    @Test
    public void testAddSamePortal(){
        String addPortal = Helper.generateTitle();
        portalsPage.clickOnAddPortalButton();
        editPortalsPage.enterNewTitle(addPortal);
        editPortalsPage.enterNewUrl("test.testtest.test");
        editPortalsPage.selectDropDownMenu();
        editPortalsPage.savePortalButton();
        portalsPage.clickOnAddPortalButton();
        editPortalsPage.enterNewTitle(addPortal);
        editPortalsPage.enterNewUrl("test.testtest.test");
        editPortalsPage.selectDropDownMenu();
        editPortalsPage.savePortalButton();
        String expectedHeading = "Portals | Insert Portal";
        String actualHeading = addPortalPage.PanelHeading();
        assertTrue("You have added same portal twice", expectedHeading.equals(actualHeading));
    }
    
}
