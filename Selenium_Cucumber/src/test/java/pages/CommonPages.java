package pages;


import elements.CommonElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.DriverFactory;

public class CommonPages extends DriverFactory {

    private static final CommonElements commonElements = new CommonElements();

    public boolean headerVisible() {
        return commonElements.getHeaderVisible().isDisplayed();}

    public boolean headingVisible() {
        return commonElements.getHeadingVisible().isDisplayed();}

    public void scrollToElement(String string) throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector("body > div > h3:nth-" + string));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public boolean placesDescriptionVisible() {
        return commonElements.getplacesDescriptionVisible().isDisplayed();}

    public boolean placeCodeDescriptionVisible() {
        return commonElements.getplaceCodeDescriptionVisible().isDisplayed();}

    public boolean forecastsDescriptionVisible(){
        return commonElements.getforecastsDescriptionVisible().isDisplayed();}

    public boolean forecastsTypeDescriptionVisible(){
        return commonElements.getforecastsTypeDescriptionVisible().isDisplayed();}
}
