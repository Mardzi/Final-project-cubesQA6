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
        dashboardPage.clickOnLogoutButton();
    }

    @Test
    public void testEditLastCategory(){
        String addNewTitle = Helper.generateTitle();
        portalsPage.clickOnLastEditButton();
        editPortalsPage.enterNewTitle(addNewTitle);
        editPortalsPage.enterNewUrl("https://belgrade-beat.rs/");
        editPortalsPage.selectDropDownMenu();
        editPortalsPage.savePortalButton();
        String expectedNewTitle = "Portal \""+ addNewTitle +"\" has been successfully saved!";
        String actualTitle = editPortalsPage.successMessage();
        assertTrue("Portal is not edited.", expectedNewTitle.equals(actualTitle));
    }
    @Test
    public void testEnteringMoreThen255Chars(){
        String addNewTitle = Helper.generateTitle();
        portalsPage.clickOnLastEditButton();
        editPortalsPage.enterNewTitle(addNewTitle);
        editPortalsPage.enterNewUrl("fObXSrQzHiaKC03njj95ncY7DlN7EG03v5bVLo3WZhzX81No7iQmDpl8WGsN8HJDYccfVeo0MxCSSSIhlk1APcJo26x7JF6HyOWB2wrMww8TQArpWAyt2P98bBaftrVEXpy2r9v10Naaki5EClBKngMaKnwrqj8jMavfpaYbq42CmvRUZmn9iXWgbIo0FfaohkRQgrCL0kbkb5FD5RdNobaQYHhZCANlyNFvrA1VSq3Ge2Odo6fkNho71hnaHVcn");
        editPortalsPage.selectDropDownMenu();
        editPortalsPage.savePortalButton();
        String expectedErrorMesage = "The url may not be greater than 255 characters.";
        String actualErrorMessage = editPortalsPage.errorMessage();
        assertTrue("Portal is not edited.", expectedErrorMesage.equals(actualErrorMessage));
    }
    @Test
    public void testEnteringLessThen10(){
        String addNewTitle = Helper.generateTitle();
        portalsPage.clickOnLastEditButton();
        editPortalsPage.enterNewTitle(addNewTitle);
        editPortalsPage.enterNewUrl("ninechars");
        editPortalsPage.selectDropDownMenu();
        editPortalsPage.savePortalButton();
        String expectedErrorMesage = "The url must be at least 10 characters.";
        String actualErrorMessage = editPortalsPage.errorMessage();
        assertTrue("Portal is not edited.", expectedErrorMesage.equals(actualErrorMessage));
    }
}
