package sugu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sugu.practice.PageObject.TravelHomePage;

public class HomePageTest {
    WebDriver driver;
    TravelHomePage travelHomePage;

    @BeforeTest
    public void initizalization(){
        driver = new ChromeDriver();
        travelHomePage = new TravelHomePage(driver);

    }

    @Test
    public void demoTest() throws InterruptedException {
        travelHomePage.goTo();
        System.out.println(travelHomePage.getNavigationBar().getFlightAttribute());
        //travelHomePage.selectMultiTrip().selectRadioButton();
        //travelHomePage.selectRoundTrip().clickRoundTrip();
        travelHomePage.selectTrip("roundtrip");
        travelHomePage.checkAvail("reservationDetails");
        Thread.sleep(1000);

    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }

}
