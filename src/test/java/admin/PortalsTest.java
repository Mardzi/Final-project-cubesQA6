
package admin;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PortalsPage;

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
    public void testDisableLastPortal() {
       String expectedStatus = "E";
       String actualStatus = portalsPage.checkStatusOfLastPortal();
       if(expectedStatus.equals(actualStatus)){
        portalsPage.clickOnLastDisableButton(); 
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.confirmDisabling();
        String expectedNewStatus = "D";
        String actualNewStatus = portalsPage.checkStatusOfLastPortal();
        assertTrue("Portal is not disabled", expectedNewStatus.equals(actualNewStatus));
       }
       else{
        portalsPage.clickOnLastEnableButton();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.confirmEnabling();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.clickOnLastDisableButton(); 
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.confirmDisabling();
        String expectedNewStatus = "D";
        String actualNewStatus = portalsPage.checkStatusOfLastPortal();
        assertTrue("Portal is not disabled", expectedNewStatus.equals(actualNewStatus));
       } 
    }
    
    @Test
    
    public void testEnableLastPortal(){
        String expectedStatus = "D";
        String actualStatus = portalsPage.checkStatusOfLastPortal();
        if(expectedStatus.equals(actualStatus)){
            portalsPage.clickOnLastEnableButton();
            driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
            portalsPage.confirmEnabling();
            String expectedNewStatus = "E";
            String actualNewStatus = portalsPage.checkStatusOfLastPortal();
            assertTrue("Portal is not enabled", expectedNewStatus.equals(actualNewStatus));
        }
        else{
        portalsPage.clickOnLastDisableButton(); 
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.confirmDisabling();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.clickOnLastEnableButton();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.confirmEnabling();
        String expectedNewStatus = "E";
        String actualNewStatus = portalsPage.checkStatusOfLastPortal();
        assertTrue("Portal is not enabled", expectedNewStatus.equals(actualNewStatus));
        }  
    }
    
    @Test
    public void testDeleteLastPortal() {
        portalsPage.clickOnLastDeleteButton(); 
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS) ;
        portalsPage.confirmDeleting();
    } 
}
