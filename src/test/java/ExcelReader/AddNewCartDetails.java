package ExcelReader;

import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class AddNewCartDetails extends ExcelReaderTest {

    static int addCount = 0;
    static boolean shippingAddress;
    static boolean userFound;

    public static void main(String[] args) throws InterruptedException, IOException {
        loginNExcelRead();
//        addProduct();
        String price = null;
        String quantity = null;
        String product = null;
        addProduct(driver, product, quantity, price);
    }

    public void test(String email, String product, String quantity, String price, String orderNumber, String externalOrderNumber, String date, String name, WebDriver driver, String nextEmail, String nextOrderNumber) throws InterruptedException, IOException {

        /*clickCancelDefaultSalesPerson();
        clickSalesPerson();
        selectSalesPerson();
        saveSelectedSalesPerson();*/
        clickShippingGroundPriceEditButton(email);
        if (shippingAddress) {
            overridePriceChange();
            clickSaveShipping();
            alternativeButton();
            tenderType();
            addTender();
            chargeButton();
            clickEditButtonSalesPerson();
            clickCancelSalesPerson();
            selectSalesPersonEnterArea();
            selectSalesPerson();
            saveSelectedSalesPerson();
            fulfillmentButton();
            selectCarrier();
            enterTrackingNumber(orderNumber);
            addFulfillButton();
            orderNote(externalOrderNumber, date, name);
            addNoteButton();
        }

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
//            driver.findElement(By.xpath("(//select[@class='sc-kgTSHT sc-hlLBRy bnfNwl erFRtJ'])[2]")).click();
            Select dropdown = new Select(driver.findElement(By.xpath("(//select[@class='sc-kgTSHT sc-hlLBRy bnfNwl erFRtJ'])[2]")));
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
            //driver.findElement(By.xpath("//button[@class='sc-jGprRt cCQNDD']")).click();
            driver.findElement(By.xpath("//button[@class='sc-jGNhvO fQJosH']")).click();
            System.out.println("Clear Sales person default");
            report.test.log(LogStatus.PASS, "Successfully Clicked Removed Sales Person");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Sales Person Removed Unsuccessfully");
        }
    }

    public static void clickSalesPerson() throws InterruptedException {
        try {
            //driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn eVpJmr jGqRAO']")).click();
            driver.findElement(By.xpath("//input[@class='sc-kgTSHT sc-jcMfQk edBmt epwzPR']")).click();
            System.out.println("clicked sales person input field");
            report.test.log(LogStatus.PASS, "Successfully Clicked Sales Person Field");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Sales Person Field Select Unsuccessfully");
        }
    }

    public static void clickEditButtonSalesPerson() throws InterruptedException {
        try {
            //driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn eVpJmr jGqRAO']")).click();
            driver.findElement(By.xpath("(//button[@class='sc-gswNZR ivaMqs'])[3]")).click();
            System.out.println("clicked sales person Edit Button Successfully");
            report.test.log(LogStatus.PASS, "Successfully Clicked Sales Person Edit Button ");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Sales Person Edit Button Select Unsuccessfully");
        }
    }

    public static void clickCancelSalesPerson() throws InterruptedException {
        try {
            //driver.findElement(By.xpath("//button[@class='sc-jGprRt cCQNDD']")).click();
            driver.findElement(By.xpath("//button[@class='sc-jGNhvO fQJosH']")).click();
            System.out.println("Clear Sales person ");
            report.test.log(LogStatus.PASS, "Successfully Clicked Removed Sales Person");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Sales Person Removed Unsuccessfully");
        }
    }
    public static void selectSalesPersonEnterArea(){

        try {
            //driver.findElement(By.xpath("//button[@class='sc-jGprRt cCQNDD']")).click();
            driver.findElement(By.xpath("(//div[@class='sc-cabOPr oZYgr'])[2]")).click();
            System.out.println("Clear Sales person ");
            report.test.log(LogStatus.PASS, "Successfully Clicked Sales Person Text Area");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Sales Person Area Clicked Unsuccessfully");
        }
    }


    public static void selectSalesPerson() throws InterruptedException {
        try {
//driver.findElement(By.xpath("(//button[@class='sc-cmYsgE jPbITj'])[1]")).click();
            String salesPerson = ("Asher de Silva");
            driver.findElement(By.xpath("//span[text()='Asher de Silva']")).click();
//            driver.findElement(By.xpath("(//span[text()='Cellar Door'])[3]")).click();
//            driver.findElement(By.xpath("(//button[@class='sc-febvLc eRiZzm'])[6]")).click();
            System.out.println("Select Sales Person ");
            report.test.log(LogStatus.PASS, "Successfully Selected Sales Person ");
            //Asher de Silva
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Sales Person Select Unsuccessfully");
        }
    }

    public static void saveSelectedSalesPerson() throws InterruptedException {
        try {
//driver.findElement(By.xpath("(//button[@class='sc-cmYsgE jPbITj'])[1]")).click();
            driver.findElement(By.xpath("(//button[@class='sc-kDvujY jsTXSv'])[2]")).click();
            report.test.log(LogStatus.PASS, "Successfully Saved Selected Sales Person ");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Sales Person Saved Unsuccessfully");
        }
    }

    //SHIPPING PRICE
    public static void clickShippingGroundPriceEditButton(String email) throws InterruptedException, IOException {
        try {
//            driver.findElement(By.xpath("(//button[@class='sc-gsnTZi jsiNjf'])[3]")).click();
//            driver.findElement(By.xpath("(//button[@class='sc-kDvujY dxfoJm'])[1]")).click();
            driver.findElement(By.xpath("(//button[@class='sc-gswNZR ivaMqs'])[3]")).click();
            report.test.log(LogStatus.PASS, "Successfully Shipping Ground Price Update Button Clicked ");
//        driver.findElement(By.xpath("(//span[text()='Add Note'])[1]")).click();
            System.out.println("Shipping ground edit button click");
            shippingAddress=true;
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            shippingAddress=false;
            report.test.log(LogStatus.FAIL, "Shipping Ground Price Update Button Clicked Unsuccessfully");
            report.test.log(LogStatus.FAIL, "Shipping Address Not Found For Customer");
            report.test.log(LogStatus.FATAL, "Customer Order Placed Unsuccessfully CustomerMail :- " + email);

            System.out.println("Click again Store tab");
            //Click on Store Tab
//                        driver.findElement(By.xpath("//a[@class='sc-gFGZVQ fqiyHI undefined active active']")).click();
            driver.findElement(By.xpath("//a[@class='sc-gGvHcT eIbnao undefined active']")).click();
            System.out.println("click store button");
            Thread.sleep(5000);
//            afterDetailAddingButtonClicks();
            //ClickADDNEW
            driver.findElement(By.xpath("//div[@class='sc-fztKhi gLbRQg']")).click();
            endReporting();
        }
    }

    public static void overridePriceChange() throws InterruptedException {
        try {
            /*driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[3]")).clear();
            driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[3]")).sendKeys("0");*/
            driver.findElement(By.xpath("(//input[@class='sc-kgTSHT sc-jcMfQk bnfNwl epwzPR'])[3]")).clear();
            driver.findElement(By.xpath("(//input[@class='sc-kgTSHT sc-jcMfQk bnfNwl epwzPR'])[3]")).sendKeys("0");
            report.test.log(LogStatus.PASS, "Successfully Override Price Updated ");
            System.out.println("Override Shipping Price Updated");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Override Shipping Price Updated Unsuccessfully");
        }
    }

    public static void clickSaveShipping() throws InterruptedException {
        //(//button[@class="sc-kDDrLX crBOCu"])[2]
        try {
//            driver.findElement(By.xpath("(//button[@class='sc-kDDrLX crBOCu'])[3]")).click();
            driver.findElement(By.xpath("(//button[@class='sc-kDvujY jsTXSv'])[2]")).click();
            System.out.println("Save Shipping Clicked");
            report.test.log(LogStatus.PASS, "Successfully Clicked Save Shipping Button");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Clicked Save Shipping Button Unsuccessfully");
        }
    }

    public static void chargeButton() throws InterruptedException {
        try {
            int elementNum;
            elementNum = (addCount * 2) + 4;
//            driver.findElement(By.xpath("(//button[@class=\'sc-kDDrLX crBOCu\'])")).click();
            driver.findElement(By.xpath("(//button[@class='sc-kDvujY jsTXSv'])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Click on Charge Button");
            System.out.println("Click on Charge Button");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Clicked on Charge Button Unsuccessfully");
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Clicked on Charge Button Unsuccessfully");
            report.test.log(LogStatus.FATAL, "Billing Address Or Payment Method Not Included ");

            Thread.sleep(5000);
            endReporting();

        }
    }

    public static void fulfillmentButton() throws InterruptedException {
        try {
//            driver.findElement(By.xpath("//button[@class='sc-kDDrLX crBOCu']")).click();
            driver.findElement(By.xpath("//button[@class='sc-kDvujY jsTXSv']")).click();
            report.test.log(LogStatus.PASS, "Successfully Click on Fulfillment Button");
            System.out.println("Click on Add Fulfillment Button");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Clicked on Fulfillment Button Unsuccessfully");
        }
    }

    public static void orderNote(String externalOrderNumber, String date, String name) throws InterruptedException {
        try {
            driver.findElement(By.xpath("//textarea[@id='content']")).clear();
            driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("Name          : " + name + "\n");
            driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("| Order Number : " + externalOrderNumber + "\n");
            driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("| Date         : " + date);
            report.test.log(LogStatus.PASS, "Successfully Added Note");
            System.out.println("Add Order Note");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Note Adding Unsuccessfully");
        }
    }

    public static void addNoteButton() throws InterruptedException {
        try {
            driver.findElement(By.xpath("(//span[text()='Add Note'])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Added Note Button Clicked");
            System.out.println("Click on Add Note Button");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Note Adding Button Clicked Unsuccessfully");
        }

    }


    public static void searchOderItem(String product) throws InterruptedException {
        try {
            driver.findElement(By.id("productVariantInlineSearch")).clear();
            driver.findElement(By.id("productVariantInlineSearch")).sendKeys(product);
            report.test.log(LogStatus.PASS, "Successfully Search Order Item Entered Item : " + product);
            System.out.println("Search Order Item");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Search Order Item Entered Unsuccessfully - Item : " + product);
        }
    }

    public static void addQuantity(String quantity) throws InterruptedException {
        try {
            /*driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH kUdrlC']")).clear();
            driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH kUdrlC']")).sendKeys(quantity);*/
            driver.findElement(By.xpath("//input[@class='sc-kgTSHT sc-jcMfQk bnfNwl gqNjnZ']")).clear();
            driver.findElement(By.xpath("//input[@class='sc-kgTSHT sc-jcMfQk bnfNwl gqNjnZ']")).sendKeys(quantity);
            report.test.log(LogStatus.PASS, "Successfully Search Order Item Quantity Entered");
            System.out.println("Add Quantity");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Order Quantity Entered Unsuccessfully");
        }
    }

    public static void addPrice(String price) throws InterruptedException {
        try {
            /*driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[2]")).clear();
            driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[2]")).sendKeys(price);*/
            driver.findElement(By.xpath("(//input[@class='sc-kgTSHT sc-jcMfQk bnfNwl epwzPR'])[2]")).clear();
            driver.findElement(By.xpath("(//input[@class='sc-kgTSHT sc-jcMfQk bnfNwl epwzPR'])[2]")).sendKeys(price);
            report.test.log(LogStatus.PASS, "Successfully Order Item Price Entered");
            System.out.println("Add Price");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Order Item Price Entered Unsuccessfully");
        }
    }

    public static void selectButton() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//span[text()='Select']")).click();
            report.test.log(LogStatus.PASS, "Successfully Order Item Select Button Entered");
            System.out.println("Click on Select Button");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Order Item Select Button Entered Unsuccessfully");
        }
    }

    public void addEmail(WebDriver driver, String email,String oderNumber) throws InterruptedException, IOException {
        searchCustomer(email,oderNumber);
        selectCustomer(email);

    }

    public static void searchCustomer(String email,String oderNumber) throws InterruptedException {
        try {
            addNewOrderButton();
            report.createReport("test_CustomersProcessDetails_" + email+"orderNumber_"+oderNumber);

            /*driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[1]")).clear();
            driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn kdDXqH jGqRAO'])[1]")).sendKeys(email);*/
            driver.findElement(By.xpath("(//input[@class='sc-kgTSHT sc-jcMfQk bnfNwl epwzPR'])[1]")).clear();
            driver.findElement(By.xpath("(//input[@class='sc-kgTSHT sc-jcMfQk bnfNwl epwzPR'])[1]")).sendKeys(email);
            report.test.log(LogStatus.PASS, "Successfully Search Customer Email Entered - Customer :- " + email);
            System.out.println("Search Customer");
            Thread.sleep(7000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Search Customer Email Entered Unsuccessfully :- " + email);
            report.test.log(LogStatus.FAIL, "Customer Not Found :- " + email);
            /*System.out.println("Click again Store tab");
            //Click on Store Tab
//                        driver.findElement(By.xpath("//a[@class='sc-gFGZVQ fqiyHI undefined active active']")).click();
            driver.findElement(By.xpath("//a[@class='sc-gGvHcT eIbnao undefined active']")).click();
            System.out.println("click store button");
            Thread.sleep(5000);
            String customerName =driver.findElement(By.xpath("//span[@class='sc-gKPRtg eNJsZr']")).getText();
            System.out.println("Get Customer Name : "+customerName);
            Thread.sleep(5000);

            excelReader();*/
        }
    }

    public static void selectCustomer(String email) throws InterruptedException, IOException {
        try {
//            driver.findElement(By.xpath("//span[@class='sc-gKXOVf dvlemO']")).click();
            String customerName = driver.findElement(By.xpath("//span[@class='sc-gKPRtg eNJsZr']")).getText();
            System.out.println("Get Customer Name : " + customerName);
            String noResultFound = "No results found";
            if (customerName.equals(noResultFound)) {
                report.test.log(LogStatus.FAIL, "Customer Email Entered Selected Unsuccessfully - Customer :- " + email);
                report.test.log(LogStatus.FATAL, "CUSTOMER IS NOT REGISTERS - Customer Email :- " + email);
                endReporting();
                System.out.println("Click again Store tab");
                //Click on Store Tab
//                        driver.findElement(By.xpath("//a[@class='sc-gFGZVQ fqiyHI undefined active active']")).click();
                driver.findElement(By.xpath("//a[@class='sc-gGvHcT eIbnao undefined active']")).click();
                System.out.println("click store button");
                Thread.sleep(5000);

                Thread.sleep(5000);
            } else {
                driver.findElement(By.xpath("//span[@class='sc-gKPRtg eNJsZr']")).click();
                report.test.log(LogStatus.PASS, "Successfully Selected Customer Email Entered - Customer :- " + email);
                System.out.println("Click on Selected Customer");
//        driver.findElement(By.xpath("//span[@class='sc-cmYsgE jPbITj']")).click();
                Thread.sleep(5000);
            }

        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Customer Email Entered Selected Unsuccessfully - Customer :- " + email);
            report.test.log(LogStatus.FATAL,"CUSTOMER NOT REGISTERED..");
            endReporting();
            excelReader();
        }
    }

    public static void selectCarrier() throws InterruptedException {
        //Select Carrier
        try {
            Select dropdown = new Select(driver.findElement(By.xpath("//select[@id=\"shipped.carrier\"]")));
            report.test.log(LogStatus.PASS, "Successfully Selected Carrier");
            System.out.println("Carrier select");
            dropdown.selectByVisibleText("Other");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Carrier Selected Unsuccessfully");
        }

    }

    public static void enterTrackingNumber(String orderNumber) {
        try {
            System.out.println("ordernumber " + orderNumber);
//        class="sc-kgflAQ sc-bPyhqo kdDXqH bgTskM"
            driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']")).clear();
            driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']")).sendKeys(orderNumber);
            report.test.log(LogStatus.PASS, "Successfully Entered Order Number - OrderNumber : " + orderNumber);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Order Number Entered Unsuccessfully - OrderNumber : " + orderNumber);
        }
    }

    public static void addFulfillButton() throws InterruptedException {
        try {
            //Click on Add Fulfillment Button
            driver.findElement(By.xpath("//span[text()='Add Fulfillment']")).click();
            report.test.log(LogStatus.PASS, "Successfully Click On Add Fulfillment Button");
//            driver.findElement(By.xpath("//button[@class='sc-kDvujY jsTXSv']")).click();
            System.out.println("Click on Add Fulfillment Button");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Click On Add Fulfillment Button Unsuccessfully");
        }
    }


}
