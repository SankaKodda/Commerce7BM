package ExcelReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElements extends ExcelReaderTest {
    //Web Elements on Excel Reader
    String loadUrl = "https://borough-markets.admin.platform.commerce7.com/login";
    String liveUrl = "https://kay-brothers.admin.platform.commerce7.com/";
    WebElement clickStoreButton = driver.findElement(By.xpath("//a[text()='Store']"));
    WebElement clickAddOrderButton = driver.findElement(By.xpath("//div[@class='sc-gVzlyS hugcGX']"));
    WebElement clickStoreButtonWhenActive = driver.findElement(By.xpath("//a[@class='sc-gGvHcT eIbnao undefined active active']"));
    WebElement email = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("password"));
    WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));

    //Web Elements on Add new cart
    WebElement ShippingGroundPriceButton = driver.findElement(By.xpath("(//button[@class='sc-gswNZR ivaMqs'])[3]"));
    WebElement overridePriceButton = driver.findElement(By.xpath("(//input[@class='sc-kgTSHT sc-jcMfQk bnfNwl epwzPR'])[3]"));
    WebElement saveShippingButton = driver.findElement(By.xpath("(//button[@class='sc-kDvujY jsTXSv'])[2]"));
    WebElement alternativeButton = driver.findElement(By.xpath("//span[text()='Add Alternate Tender']"));
    WebElement tenderType = driver.findElement(By.xpath("(//select[@class='sc-kgTSHT sc-hlLBRy bnfNwl erFRtJ'])[2]"));
    WebElement tenderAddButton = driver.findElement(By.xpath("//span[text()='Add Tender']"));
    WebElement chargeButton = driver.findElement(By.xpath("(//button[@class='sc-kDvujY jsTXSv'])[1]"));
    WebElement editSalesPersonButton = driver.findElement(By.xpath("(//button[@class='sc-gswNZR ivaMqs'])[3]"));
    WebElement cancelSalesPersonButton = driver.findElement(By.xpath("//button[@class='sc-jGNhvO fQJosH']"));
    WebElement salesPersonEnterArea =  driver.findElement(By.xpath("(//div[@class='sc-cabOPr oZYgr'])[2]"));
    WebElement salesPerson = driver.findElement(By.xpath("//span[text()='Asher de Silva']"));
    WebElement saveSelectedSalesPersonButton = driver.findElement(By.xpath("(//button[@class='sc-kDvujY jsTXSv'])[2]"));
    WebElement fulfillmentButton = driver.findElement(By.xpath("//button[@class='sc-kDvujY jsTXSv']"));
    WebElement carrier = driver.findElement(By.xpath("//select[@id=\"shipped.carrier\"]"));
    WebElement trackingNumberField = driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']"));
    WebElement addFulfillButton = driver.findElement(By.xpath("//span[text()='Add Fulfillment']"));
    WebElement orderNoteArea = driver.findElement(By.xpath("//textarea[@id='content']"));
    WebElement addOrderNoteButton = driver.findElement(By.xpath("(//span[text()='Add Note'])[1]"));


}
