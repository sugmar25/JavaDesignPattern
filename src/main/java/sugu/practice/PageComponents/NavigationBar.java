package sugu.practice.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sugu.practice.CommonUtilities.AbstractComponents;

public class NavigationBar extends AbstractComponents {

    By flights = By.cssSelector("[title='Flights']");

    public NavigationBar(By sectionElement, WebDriver driver) {
        super(sectionElement, driver);
    }

    public String getFlightAttribute() {
        windowsMaximization();
        waitforElementToPresent(flights);
        return findElement(flights).getAttribute("class");
    }
}
