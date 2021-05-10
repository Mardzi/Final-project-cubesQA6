///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package admin;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pages.DashboardPage;
//import pages.LoginPage;
//import pages.SignaturesPage;
//
///**
// *
// * @author kromp
// */
//public class SignaturesTest {
//    private static WebDriver driver;
//    public SignaturesTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//        System.setProperty("webdriver.chrome.driver","c:\\chromedriver_90.exe");
//        DashboardPage dashboardpage = new DashboardPage(driver);
//        driver = new ChromeDriver();
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//        LoginPage loginPage = new LoginPage(driver);
//        SignaturesPage signaturesPage = new SignaturesPage(driver);
//        loginPage.pageload("http://bvtest.school.cubes.rs/login");
//        loginPage.enterEmail("qa@cubes.rs");
//        loginPage.enterPassword("cubesqa");
//        loginPage.clickOnLoginButton();
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    
//    @Test
//    public void clickOnFirstElementOnPortalDropdownMenu(){
//        SignaturesPage signatureMethods = new SignaturesPage(driver);
//        DashboardPage dashboardPage = new DashboardPage(driver);
//        dashboardPage.clickOnSignatureLink();
//        signatureMethods.clickOnPortalDropDownMenu();
//        signatureMethods.clickOnFirstItem();
//        
//        
//    }
//}
