/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */
package com.mycompany.mavenproject1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 *
 * @author Ahmed Elrefaiy
 */
public class TestMavinIT_Organized {
    
    public TestMavinIT_Organized(){
    
    }
    

    @org.testng.annotations.BeforeTest
    public static void setUpClass() throws Exception {
        //initialize driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //to maximize browser window
    }

    @org.testng.annotations.AfterTest
    public static void tearDownClass() throws Exception {
        //Close the browser
        Thread.sleep(2000);
        driver.quit();
    }

    
    static WebDriver driver;
    
    @DataProvider(name="testLogin")
    public Object[][] data1()
    {
        return new Object[][]{{"Admin","admin123","orangehrm-login-button","oxd-userdropdown-name","Paul Collings"}};
    }
    @Test(dataProvider = "testLogin")
    public void testLogin(String username, String password, String loginButton, String dropdown, String expName) throws Exception {
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.className(loginButton)).click();
        Thread.sleep(3000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(dropdown)).getText(),expName);
    }
    
    @DataProvider(name="testTabAdmin")
    public Object[][] data2()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/admin/viewAdminModule']","oxd-topbar-header-breadcrumb-level","User Management"}};
    }
    @Test(dataProvider = "testTabAdmin")
    public void testTabAdmin(String AdminButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(AdminButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        
    }
    
    @DataProvider(name="testTabPim")
    public Object[][] data3()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/pim/viewPimModule']","oxd-topbar-header-breadcrumb-module","PIM"}};
    }
    @Test(dataProvider = "testTabPim")
    public void testTabPim(String pimButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(pimButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        
    }
    
    @DataProvider(name="testTabLeave")
    public Object[][] data4()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/leave/viewLeaveModule']","oxd-topbar-header-breadcrumb-module","Leave"}};
    }
    @Test(dataProvider = "testTabLeave")
    public void testTabLeave(String leaveButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(leaveButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        
    }
    
    @DataProvider(name="testTabTime")
    public Object[][] data5()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/time/viewTimeModule']","oxd-topbar-header-breadcrumb-level","Timesheets"}};
    }
    @Test(dataProvider = "testTabTime")
    public void testTabTime(String TimeButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(TimeButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        
    }
    
    @DataProvider(name="testTabRecru")
    public Object[][] data6()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/recruitment/viewRecruitmentModule']","oxd-topbar-header-breadcrumb-module","Recruitment"}};
    }
    @Test(dataProvider = "testTabRecru")
    public void testTabRecru(String recruButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(recruButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        
    }
    
    @DataProvider(name="testTabMyInfo")
    public Object[][] data7()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/pim/viewMyDetails']","orangehrm-main-title","Personal Details"}};
    }
    @Test(dataProvider = "testTabMyInfo")
    public void testTabMyInfo(String myinfoButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(myinfoButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        
    }
    
    @DataProvider(name="testTabPerformance")
    public Object[][] data8()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/performance/viewPerformanceModule']","oxd-topbar-header-breadcrumb-level","Manage Reviews"}};
    }
    @Test(dataProvider = "testTabPerformance")
    public void testTabPerformance(String performanceButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(performanceButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        
    }
    
    @DataProvider(name="testTabDash")
    public Object[][] data9()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/dashboard/index']","oxd-topbar-header-breadcrumb-module","Dashboard"}};
    }
    @Test(dataProvider = "testTabDash")
    public void testTabDash(String dashButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(dashButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        
    }
    
    @DataProvider(name="testTabDire")
    public Object[][] data10()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/directory/viewDirectory']","oxd-topbar-header-breadcrumb-module","Directory"}};
    }
    @Test(dataProvider = "testTabDire")
    public void testTabDire(String direButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(direButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        
    }
    
    @DataProvider(name="testSideBarClose")
    public Object[][] data11()
    {
        return new Object[][]{{"oxd-main-menu-button","bi-chevron-right","oxd-icon bi-chevron-right"}};
    }
    @Test(dataProvider = "testSideBarClose")
    public void testSideBarClose(String sidebarButton, String button, String expButton) throws Exception {
        driver.findElement(By.className(sidebarButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(button)).getAttribute("class"),expButton);
        
    }
    
    
    @DataProvider(name="testSideBarOpen")
    public Object[][] data12()
    {
        return new Object[][]{{"oxd-main-menu-button","bi-chevron-left","oxd-icon bi-chevron-left"}};
    }
    @Test(dataProvider = "testSideBarOpen")
    public void testSideBarOpen(String sidebarButton, String button, String expButton) throws Exception {
        driver.findElement(By.className(sidebarButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(button)).getAttribute("class"),expButton);
        
    }
    
    @DataProvider(name="testTabMainten")
    public Object[][] data13()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/maintenance/viewMaintenanceModule']","orangehrm-admin-access-title","Administrator Access"}};
    }
    @Test(dataProvider = "testTabMainten")
    public void testTabMainten(String maintenButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(maintenButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        driver.navigate().back();
         
    }
    
    @DataProvider(name="testTabBuzz")
    public Object[][] data14()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/buzz/viewBuzz']","oxd-topbar-header-breadcrumb-module","Buzz"}};
    }
    @Test(dataProvider = "testTabBuzz")
    public void testTabBuzz(String buzzButton, String header, String expHeader) throws Exception {
        driver.findElement(By.cssSelector(buzzButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(header)).getText(),expHeader);
        
    }
    
    @DataProvider(name="testLogout")
    public Object[][] data15()
    {
        return new Object[][]{{"oxd-userdropdown","//a[@href='/web/index.php/auth/logout']","orangehrm-login-title","Login"}};
    }
    @Test(dataProvider = "testLogout")
    public void testLogout(String dropdownButton, String logoutButton, String Header, String expHeader) throws Exception {
        driver.findElement(By.className(dropdownButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(logoutButton)).click();
        Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(Header)).getText(),expHeader);
        
    }
    
     @DataProvider(name="testTabDashFunc")
    public Object[][] data16()
    {
        return new Object[][]{{".oxd-main-menu-item[href='/web/index.php/dashboard/index']"
                ,"orangehrm-attendance-card-action"
                ,"//input[@placeholder='yyyy-mm-dd']","2022-12-30",
        "//input[@placeholder='hh:mm']","02:30 PM","oxd-textarea",
        "Test Comment","oxd-topbar-header-breadcrumb-module","Attendance",
        "orangehrm-leave-card-icon","oxd-text--card-body","Employees on Leave Today","orangehrm-left-space","//button[@title='My Timesheet']",
        "oxd-topbar-header-breadcrumb-level","Timesheets"}};
    }
    @Test(dataProvider = "testTabDashFunc")
    public void testTabDashFunc(String DashboardButton,String AlarmButton,String DateField,String Date,String TimeField,
            String Time,String TextArea,String Text,String header1,String expHeader1,String gearIcon,String header2,String expHeader2,
            String SaveButton,String TimeSheetButton,String header3,String expHeader3) throws Exception {
        driver.findElement(By.cssSelector(DashboardButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.className(AlarmButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(DateField)).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.xpath(DateField)).sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        driver.findElement(By.xpath(DateField)).sendKeys(Date);
        Thread.sleep(2000);
        driver.findElement(By.xpath(TimeField)).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.xpath(TimeField)).sendKeys(Keys.DELETE);
        driver.findElement(By.xpath(TimeField)).sendKeys(Time);
        Thread.sleep(2000);
        driver.findElement(By.className(TextArea)).sendKeys(Text);
        Thread.sleep(2000);
        //driver.findElement(By.cssSelector(".oxd-button--secondary.orangehrm-left-space")).click();
        //driver.findElement(By.id("submit")).click();
        //Thread.sleep(2000);
//        driver.findElement(By.className("oxd-button--secondary")).click();
        Assert.assertEquals(driver.findElement(By.className(header1)).getText(),expHeader1);
        driver.findElement( By.cssSelector(DashboardButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.className(gearIcon)).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.className(header2)).getText(),expHeader2);
        driver.findElement(By.className(SaveButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(TimeSheetButton)).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.className(header3)).getText(),expHeader3);
    }
   
    
}