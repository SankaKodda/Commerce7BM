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

   /*private static void addProduct() throws InterruptedException {
        String product = null;
        String quantity = null;
        String price = null;
        driver.findElement(By.id("productVariantInlineSearch")).clear();
        driver.findElement(By.id("productVariantInlineSearch")).sendKeys(product);

        Thread.sleep(5000);

        //Add Quantity
        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn jDKUna kUdrlC']")).clear();
        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn jDKUna kUdrlC']")).sendKeys(quantity);

        Thread.sleep(5000);

        //Add Price
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn jDKUna jGqRAO'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn jDKUna jGqRAO'])[2]")).sendKeys(price);

        Thread.sleep(5000);

        //Click on Select Button
        driver.findElement(By.xpath("//span[text()='Select']")).click();

        Thread.sleep(5000);
    }*/

    public void test(String email, String product, String quantity, String price, String orderNumber, String externalOrderNumber, WebDriver driver, String nextEmail, String nextOrderNumber) throws InterruptedException {
        /*int elementNum;
        Thread.sleep(7000);

        //Select Tender Type

        try {

            Thread.sleep(5000);
            Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='sc-kgflAQ sc-hlnMnd kdDXqH libHtu']")));
            dropdown.selectByVisibleText("External");
        } catch (Exception e) {
            System.out.println(e);
        }


        Thread.sleep(5000);

        //Click on Add Tender Button
        driver.findElement(By.xpath("//span[text()='Add Tender']")).click();
        System.out.println("Click on Add Tender Button");
        Thread.sleep(10000);

        //Click on Charge Button
        elementNum = (addCount * 2) + 4;
//        System.out.println("elementNUmber = "+elementNum);
        driver.findElement(By.xpath("(//span[@class=\"sc-iqcoie cXrpHJ\"])[8]")).click();
        System.out.println("Click on Charge Button");
        Thread.sleep(5000);

        //Click on Fulfill Button
//        driver.findElement(By.xpath("(//span[@class=\"sc-iqcoie cXrpHJ\"])[1]")).click();
        driver.findElement(By.xpath("//button[@class='sc-kDDrLX crBOCu']")).click();
        //button[@class='sc-kDDrLX crBOCu']
        System.out.println("Click on Fulfill Button");
        Thread.sleep(5000);

        //Select Carrier

        try {

            Thread.sleep(5000);
            Select dropdown = new Select(driver.findElement(By.xpath("//select[@id=\"shipped.carrier\"]")));
            System.out.println("Carrier select");
            dropdown.selectByVisibleText("Other");
        } catch (Exception e) {
            System.out.println(e);
        }

        Thread.sleep(5000);
        System.out.println("Select Carrier");

        //Enter Tracking Number
        System.out.println("ordernumber " + orderNumber);
//        class="sc-kgflAQ sc-bPyhqo kdDXqH bgTskM"
        driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']")).clear();
        driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']")).sendKeys(orderNumber);
//        driver.findElement(By.id("shippingInstructions")).clear();
//        driver.findElement(By.id("shippingInstructions")).sendKeys(orderNumber);
//        driver.findElement(By.xpath("//input[@class=\"sc-kgflAQ sc-bPyhqo kdDXqH bgTskM\"]")).clear();


        System.out.println("Enter Tracking Number");
        Thread.sleep(5000);

        //Click on Add Fulfillment Button
        driver.findElement(By.xpath("//span[text()='Add Fulfillment']")).click();
        System.out.println("Click on Add Fulfillment Button");
        Thread.sleep(5000);

        //Add Order Note
        driver.findElement(By.xpath("//textarea[@id='content']")).clear();
        driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys(externalOrderNumber);
        System.out.println("Add Order Note");
        Thread.sleep(5000);

        //Click on Add Note Button
        driver.findElement(By.xpath("(//span[text()='Add Note'])[1]")).click();
        System.out.println("Click on Add Note Button");
        Thread.sleep(5000);*/
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
        orderNote(externalOrderNumber);
        addNoteButton();
    }

    public static void addProduct(WebDriver driver, String product, String quantity, String price) throws InterruptedException {

//        //Search Order Item
//        driver.findElement(By.id("productVariantInlineSearch")).clear();
//        driver.findElement(By.id("productVariantInlineSearch")).sendKeys(product);
//        System.out.println("Search Order Item");
//        Thread.sleep(5000);
//
//        //Add Quantity
//        /*driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn jDKUna kUdrlC']")).clear();
//        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn jDKUna kUdrlC']")).sendKeys(quantity);*/
//        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH kUdrlC']")).clear();
//        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH kUdrlC']")).sendKeys(quantity);
////        sc-fejtnb eGZlbd
//        System.out.println("Add Quantity");
//        Thread.sleep(5000);
//
//        //Add Price
//        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[2]")).clear();
//        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[2]")).sendKeys(price);
//        System.out.println("Add Price");
//        Thread.sleep(5000);
//
//        //Click on Select Button
//        driver.findElement(By.xpath("//span[text()='Select']")).click();
//        System.out.println("Click on Select Button");
//        Thread.sleep(5000);
        searchOderItem(product);
        addQuantity(quantity);
        addPrice(price);
        selectButton();
        addCount++;

    }


    public static void alternativeButton() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Add Alternate Tender']")).click();
        System.out.println();
        Thread.sleep(5000);
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
        driver.findElement(By.xpath("//span[text()='Add Tender']")).click();
        System.out.println("Click on Add Tender Button");
        Thread.sleep(5000);
    }

    //SALES ASSOCIATE
    public static void clickCancelDefaultSalesPerson() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='sc-jGprRt cCQNDD']")).click();
        System.out.println("Clear Sales person default");
        Thread.sleep(5000);
    }

    public static void clickSalesPerson() throws InterruptedException {
        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn eVpJmr jGqRAO']")).click();
        System.out.println("clicked sales person input field");
        Thread.sleep(5000);
    }

    public static void selectSalesPerson() throws InterruptedException {
        driver.findElement(By.xpath("(//button[@class='sc-cmYsgE jPbITj'])[1]")).click();
        System.out.println("Select Sales Person 1");
        Thread.sleep(5000);
    }

    //SHIPPING PRICE
    public static void clickShippingGroundPriceEditButton() throws InterruptedException {
        driver.findElement(By.xpath("(//button[@class='sc-gsnTZi jsiNjf'])[3]")).click();
//        driver.findElement(By.xpath("(//span[text()='Add Note'])[1]")).click();
        System.out.println("Shipping ground edit button click");
        Thread.sleep(5000);
    }

    public static void overridePriceChange() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[3]")).clear();
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[3]")).sendKeys("0");
        System.out.println("Override Shipping Price Changed");
        Thread.sleep(5000);
    }

    public static void clickSaveShipping() throws InterruptedException {
        driver.findElement(By.xpath("(//button[@class='sc-kDDrLX crBOCu'])[2]")).click();
        System.out.println("Save Shipping Clicked");
        Thread.sleep(5000);
        //(//button[@class="sc-kDDrLX crBOCu"])[2]
    }

    public static void chargeButton() throws InterruptedException {
        int elementNum;
        elementNum = (addCount * 2) + 4;
//        System.out.println("elementNUmber = "+elementNum);
//        driver.findElement(By.xpath("(//span[@class=\"sc-iqcoie cXrpHJ\"])[8]")).click();
        //button[@class="sc-kDDrLX crBOCu"]
        driver.findElement(By.xpath("(//button[@class=\'sc-kDDrLX crBOCu\'])")).click();
        System.out.println("Click on Charge Button");
        Thread.sleep(5000);
    }

    public static void fulfillmentButton() throws InterruptedException {
//        driver.findElement(By.xpath("//span[text()='Add Fulfillment']")).click();

        driver.findElement(By.xpath("//button[@class='sc-kDDrLX crBOCu']")).click();
        System.out.println("Click on Add Fulfillment Button");
        Thread.sleep(5000);
    }

    public static void orderNote(String externalOrderNumber) throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@id='content']")).clear();
        driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys(externalOrderNumber);
        System.out.println("Add Order Note");
        Thread.sleep(5000);
    }

    public static void addNoteButton() throws InterruptedException {
        driver.findElement(By.xpath("(//span[text()='Add Note'])[1]")).click();
        System.out.println("Click on Add Note Button");
        Thread.sleep(5000);

    }


    public static void searchOderItem(String product) throws InterruptedException {
        driver.findElement(By.id("productVariantInlineSearch")).clear();
        driver.findElement(By.id("productVariantInlineSearch")).sendKeys(product);
        System.out.println("Search Order Item");
        Thread.sleep(5000);
    }

    public static void addQuantity(String quantity) throws InterruptedException {
        /*driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn jDKUna kUdrlC']")).clear();
        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn jDKUna kUdrlC']")).sendKeys(quantity);*/
        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH kUdrlC']")).clear();
        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH kUdrlC']")).sendKeys(quantity);
//        sc-fejtnb eGZlbd
        System.out.println("Add Quantity");
        Thread.sleep(5000);
    }

    public static void addPrice(String price) throws InterruptedException {
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[2]")).sendKeys(price);
        System.out.println("Add Price");
        Thread.sleep(5000);
    }

    public static void selectButton() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Select']")).click();
        System.out.println("Click on Select Button");
        Thread.sleep(5000);
    }

    public void addEmail(WebDriver driver, String email) throws InterruptedException {

       /* //Search Customer
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[1]")).sendKeys(email);
        System.out.println("Search Customer");
        Thread.sleep(7000);

        //Click on Selected Customer
//        driver.findElement(By.xpath("//span[@class='sc-gKXOVf hmjBXl']")).click();
//        sc-hhICeM hFSTQR
        driver.findElement(By.xpath("//span[@class='sc-gKXOVf dvlemO']")).click();


        System.out.println("Click on Selected Customer");
//        driver.findElement(By.xpath("//span[@class='sc-cmYsgE jPbITj']")).click();
        Thread.sleep(5000);*/
        searchCustomer(email);
        selectCustomer();

    }

    public static void searchCustomer(String email) throws InterruptedException {
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[1]")).sendKeys(email);
        System.out.println("Search Customer");
        Thread.sleep(7000);
    }

    public static void selectCustomer() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='sc-gKXOVf dvlemO']")).click();
        System.out.println("Click on Selected Customer");
//        driver.findElement(By.xpath("//span[@class='sc-cmYsgE jPbITj']")).click();
        Thread.sleep(5000);
    }

    public static void selectCarrier() throws InterruptedException {
        //Select Carrier

        try {

            Thread.sleep(5000);
            Select dropdown = new Select(driver.findElement(By.xpath("//select[@id=\"shipped.carrier\"]")));
            System.out.println("Carrier select");
            dropdown.selectByVisibleText("Other");
        } catch (Exception e) {
            System.out.println(e);
        }

        Thread.sleep(5000);
        System.out.println("Select Carrier");

    }

    public static void enterTrackingNumber(String orderNumber) {
        System.out.println("ordernumber " + orderNumber);
//        class="sc-kgflAQ sc-bPyhqo kdDXqH bgTskM"
        driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']")).clear();
        driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']")).sendKeys(orderNumber);
//        driver.findElement(By.id("shippingInstructions")).clear();
//        driver.findElement(By.id("shippingInstructions")).sendKeys(orderNumber);
//        driver.findElement(By.xpath("//input[@class=\"sc-kgflAQ sc-bPyhqo kdDXqH bgTskM\"]")).clear();

    }

    public static void addFulfillButton() throws InterruptedException {
        //Click on Add Fulfillment Button
        driver.findElement(By.xpath("//span[text()='Add Fulfillment']")).click();
        System.out.println("Click on Add Fulfillment Button");
        Thread.sleep(5000);
    }


}
