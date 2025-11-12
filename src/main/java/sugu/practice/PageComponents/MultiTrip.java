package sugu.practice.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sugu.practice.CommonUtilities.AbstractComponents;
import sugu.practice.CommonUtilities.SearchFlightAvail;

public class MultiTrip extends AbstractComponents implements SearchFlightAvail {

    private By from = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
    private By to = By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
    private By submit = By.id("ctl00_mainContent_btn_FindFlights");
    private By multiCity_rdo = By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_2']");
    private By destination_2= By.id("ctl00_mainContent_ddl_originStation2_CTXT");
    private By modalPopUp = By.id("MultiCityModelAlert");


    public MultiTrip(By sectionElement, WebDriver driver) {
        super(sectionElement, driver);
    }

    public void selectRadioButton(){
        findElement(multiCity_rdo).click();
    }

    @Override
    public void checkAvail(String reservationDetails) {
        waitForElementToDisappear(modalPopUp);
    }
}
