package sugu.practice.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sugu.practice.CommonUtilities.FactoryDesignStrategy;
import sugu.practice.CommonUtilities.SearchFlightAvail;
import sugu.practice.PageComponents.MultiTrip;
import sugu.practice.PageComponents.NavigationBar;
import sugu.practice.PageComponents.RoundTrip;

public class TravelHomePage {
    By sectionElement = By.id("buttons");
    WebDriver driver;
    SearchFlightAvail searchFlightAvail;

    public TravelHomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }

    public NavigationBar getNavigationBar(){
        return new NavigationBar(sectionElement,driver);
    }

    public MultiTrip selectMultiTrip(){
        return new MultiTrip(sectionElement,driver);
    }

    public RoundTrip selectRoundTrip(){
        return new RoundTrip(sectionElement,driver);
    }

    public void selectTrip(String tripName) {
        FactoryDesignStrategy selectTripName = new FactoryDesignStrategy(driver);
        searchFlightAvail = selectTripName.selectTrip(tripName);
        this.searchFlightAvail = searchFlightAvail;
    }

    public void checkAvail(String destinationName){

        searchFlightAvail.checkAvail(destinationName);
    }
}
