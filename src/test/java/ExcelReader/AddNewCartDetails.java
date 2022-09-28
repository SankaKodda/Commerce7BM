package ExcelReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class AddNewCartDetails extends ExcelReaderTest {

    static int addCount = 0;

    public static void main(String[] args) throws InterruptedException, IOException {
        loginNExcelRead();
//        addProduct();
        String price = null;
        String quantity = null;
        String product = null;
        addProduct(driver, product, quantity, price);
    }
    public void test(String email, String product, String quantity, String price, String orderNumber, String externalOrderNumber, String date, String name, WebDriver driver, String nextEmail, String nextOrderNumber) throws InterruptedException {
        clickCancelDefaultSalesPerson();
        clickSalesPerson();
        selectSalesPerson();
        clickShippingGroundPriceEditButton();
        overridePriceChange();
        clickSaveShipping();
        alternativeButton();
        tenderType();
        addTender();
        chargeButton();
        fulfillmentButton();
        selectCarrier();
        enterTrackingNumber(orderNumber);
        addFulfillButton();
        orderNote(externalOrderNumber, date, name);
        addNoteButton();
    }
    public static void addProduct(WebDriver driver, String product, String quantity, String price) throws InterruptedException {
        searchOderItem(product);
        addQuantity(quantity);
        addPrice(price);
        selectButton();
        addCount++;
    }
    public static void alternativeButton() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//span[text()='Add Alternate Tender']")).click();
            System.out.println();
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }
    public static void tenderType() throws InterruptedException {
        try {
            Thread.sleep(5000);
            Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='sc-kgflAQ sc-hlnMnd kdDXqH libHtu']")));
            dropdown.selectByVisibleText("External");
        } catch (Exception e) {
            System.out.println(e);
        }
        Thread.sleep(5000);
    }
    public static void addTender() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//span[text()='Add Tender']")).click();
            System.out.println("Click on Add Tender Button");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    //SALES ASSOCIATE
    public static void clickCancelDefaultSalesPerson() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//button[@class='sc-jGprRt cCQNDD']")).click();
            System.out.println("Clear Sales person default");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void clickSalesPerson() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn eVpJmr jGqRAO']")).click();
            System.out.println("clicked sales person input field");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void selectSalesPerson() throws InterruptedException {
        try {
//driver.findElement(By.xpath("(//button[@class='sc-cmYsgE jPbITj'])[1]")).click();
            driver.findElement(By.xpath("//span[text()='Asher de Silva']")).click();
            //driver.findElement(By.xpath("//span[text()='Cellar Door']")).click();
            System.out.println("Select Sales Person ");
            //Asher de Silva
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    //SHIPPING PRICE
    public static void clickShippingGroundPriceEditButton() throws InterruptedException {
        try {
            driver.findElement(By.xpath("(//button[@class='sc-gsnTZi jsiNjf'])[3]")).click();
//        driver.findElement(By.xpath("(//span[text()='Add Note'])[1]")).click();
            System.out.println("Shipping ground edit button click");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void overridePriceChange() throws InterruptedException {
        try {
            driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[3]")).clear();
            driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[3]")).sendKeys("0");
            System.out.println("Override Shipping Price Changed");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void clickSaveShipping() throws InterruptedException {
        //(//button[@class="sc-kDDrLX crBOCu"])[2]
        try {
            driver.findElement(By.xpath("(//button[@class='sc-kDDrLX crBOCu'])[3]")).click();
            System.out.println("Save Shipping Clicked");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void chargeButton() throws InterruptedException {
        try {
            int elementNum;
            elementNum = (addCount * 2) + 4;
            driver.findElement(By.xpath("(//button[@class=\'sc-kDDrLX crBOCu\'])")).click();
            System.out.println("Click on Charge Button");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void fulfillmentButton() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//button[@class='sc-kDDrLX crBOCu']")).click();
            System.out.println("Click on Add Fulfillment Button");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void orderNote(String externalOrderNumber, String date, String name) throws InterruptedException {
        try {
            driver.findElement(By.xpath("//textarea[@id='content']")).clear();
            driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("Name          : " + name + "\n");
            driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("|Order Number : " + externalOrderNumber + "\n");
            driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("|Date         : " + date);
            System.out.println("Add Order Note");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void addNoteButton() throws InterruptedException {
        try {
            driver.findElement(By.xpath("(//span[text()='Add Note'])[1]")).click();
            System.out.println("Click on Add Note Button");
            Thread.sleep(5000);
        } catch (Exception e) {

        }

    }


    public static void searchOderItem(String product) throws InterruptedException {
        try {
            driver.findElement(By.id("productVariantInlineSearch")).clear();
            driver.findElement(By.id("productVariantInlineSearch")).sendKeys(product);
            System.out.println("Search Order Item");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void addQuantity(String quantity) throws InterruptedException {
        try {
            driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH kUdrlC']")).clear();
            driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH kUdrlC']")).sendKeys(quantity);
//        sc-fejtnb eGZlbd
            System.out.println("Add Quantity");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void addPrice(String price) throws InterruptedException {
        try {
            driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[2]")).clear();
            driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[2]")).sendKeys(price);
            System.out.println("Add Price");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void selectButton() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//span[text()='Select']")).click();
            System.out.println("Click on Select Button");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public void addEmail(WebDriver driver, String email) throws InterruptedException {
        searchCustomer(email);
        selectCustomer();

    }

    public static void searchCustomer(String email) throws InterruptedException {
        try {
            driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[1]")).clear();
            driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[1]")).sendKeys(email);
            System.out.println("Search Customer");
            Thread.sleep(7000);
        } catch (Exception e) {

        }
    }

    public static void selectCustomer() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//span[@class='sc-gKXOVf dvlemO']")).click();
            System.out.println("Click on Selected Customer");
//        driver.findElement(By.xpath("//span[@class='sc-cmYsgE jPbITj']")).click();
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void selectCarrier() throws InterruptedException {
        //Select Carrier
        try {
            Select dropdown = new Select(driver.findElement(By.xpath("//select[@id=\"shipped.carrier\"]")));
            System.out.println("Carrier select");
            dropdown.selectByVisibleText("Other");
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void enterTrackingNumber(String orderNumber) {
        try {
            System.out.println("ordernumber " + orderNumber);
//        class="sc-kgflAQ sc-bPyhqo kdDXqH bgTskM"
            driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']")).clear();
            driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']")).sendKeys(orderNumber);
        } catch (Exception e) {

        }
    }

    public static void addFulfillButton() throws InterruptedException {
        try {
            //Click on Add Fulfillment Button
            driver.findElement(By.xpath("//span[text()='Add Fulfillment']")).click();
            System.out.println("Click on Add Fulfillment Button");
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }


}
