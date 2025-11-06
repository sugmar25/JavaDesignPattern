package sugu.practice.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sugu.practice.PageComponents.NavigationBar;

public class TravelHomePage {
    By sectionElement = By.id("buttons");
    WebDriver driver;

    public TravelHomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }

    public NavigationBar getNavigationBar(){
        return new NavigationBar(sectionElement,driver);
    }
}
