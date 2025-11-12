package sugu.practice.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sugu.practice.CommonUtilities.AbstractComponents;
import sugu.practice.CommonUtilities.SearchFlightAvail;

import java.util.HashMap;

public class RoundTrip extends AbstractComponents implements SearchFlightAvail {

    private By selectRoundTrip=By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]");

    public RoundTrip(By sectionElement, WebDriver driver) {
        super(sectionElement, driver);
    }

    public void clickRoundTrip(){
        findElement(selectRoundTrip).click();
    }

    @Override
    public void checkAvail(String reservationDetails) {

    }
}

