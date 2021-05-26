package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.DriverFactory.driver;

public class CommonElements {

    public WebElement getHeaderVisible(){
        return driver.findElement(By.cssSelector("body > div > div")); }

    public WebElement getHeadingVisible(){
        return driver.findElement(By.cssSelector("body > div > div > h1"));
    }

    public WebElement getplacesDescriptionVisible() { return driver.findElement(By.cssSelector("body > div > p:nth-child(15) > b"));}

    public WebElement getplaceCodeDescriptionVisible() {return driver.findElement(By.cssSelector("body > div > p:nth-child(22) > b"));}

    public WebElement getforecastsDescriptionVisible() {return driver.findElement(By.cssSelector("body > div > p:nth-child(30) > b"));}

    public WebElement getforecastsTypeDescriptionVisible() {return driver.findElement(By.cssSelector("body > div > p:nth-child(38) > b"));}
}
