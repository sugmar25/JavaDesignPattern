package sugu.practice.CommonUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AbstractComponents {

    WebElement sectionElement;
    WebDriver driver;

    public AbstractComponents(By sectionElement, WebDriver driver) {
        this.sectionElement = driver.findElement(sectionElement);
        this.driver = driver;
    }

    public WebElement findElement(By findElementBy){
        return sectionElement.findElement(findElementBy);
    }

    public void waitforElementToPresent(By findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(findBy));
    }

    public void windowsMaximization()
    {
        driver.manage().window().maximize();
    }

    public List<WebElement> findElements(By findElementBy){

        return sectionElement.findElements(findElementBy);
    }

    public void waitForElementToDisappear(By findBy)
    {
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
    }



}
