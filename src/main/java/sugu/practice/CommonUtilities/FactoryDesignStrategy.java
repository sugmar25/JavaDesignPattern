package sugu.practice.CommonUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sugu.practice.PageComponents.MultiTrip;
import sugu.practice.PageComponents.RoundTrip;

public class FactoryDesignStrategy {
    WebDriver driver;
    By sectionElement= By.id("flightSearchContainer");

    public FactoryDesignStrategy(WebDriver driver) {
        this.driver = driver;
    }

    public SearchFlightAvail selectTrip(String tripname) {
        if (tripname.equalsIgnoreCase("roundtrip")){
            return new MultiTrip(sectionElement,driver);
        }
        if (tripname.equalsIgnoreCase("multitrip")){
            return new RoundTrip(sectionElement,driver);
        }
        return null;

    }
}
