package ExcelReader;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.stream.IntStream;

public class ExcelReaderTest {
    static WebDriver driver;
    static boolean login;

    public static void main(String[] args) throws IOException, InterruptedException {
        /*int rowCount = 0;

        // Read Excel file path
        String excelPath = "./data/TestData.xlsx";
        // Excel Sheet Name
        String sheetName = "ExcelReader";
        // Create object from AddNewCartDetails Class
        AddNewCartDetails addNewCartDetails = new AddNewCartDetails();

        // Read Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
        // Select the related sheet
        XSSFSheet sheet = workbook.getSheet(sheetName);
        // get the count of rows in the sheet
        rowCount = sheet.getPhysicalNumberOfRows();

        // Open Browser
        System.setProperty("webdriver.chrome.driver","D:\\Commerce7BM\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // Open URL
        driver.get("https://borough-markets.admin.platform.commerce7.com/login");


        // Maximise the Browser
        driver.manage().window().maximize();

        // Enter Valid Username
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("timalka@fh.technology");

        Thread.sleep(5000);

        //Enter Valid Password
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Timalka123");

        Thread.sleep(5000);

        //Click on Login BUtton
        driver.findElement(By.xpath("//span[text()='Login']")).click();


        Thread.sleep(5000);

        //Click on Store Tab
        driver.findElement(By.xpath("(//a[@class='sc-gFGZVQ cGUkEo'])[2]")).click();

        Thread.sleep(5000);

        //Click on Add New Button
        driver.findElement(By.xpath("//a[@class='sc-kDDrLX cApLfP']")).click();

        Thread.sleep(7000);

        // loop all rows using rowCount
        // rowCount --> count of the rows
        // x --> index of the iteration
        IntStream.range(0,rowCount).forEach(
                rowNum-> {


                    try {
                        // Excel sheet formatter
                        DataFormatter formatter = new DataFormatter();
                        String email = formatter.formatCellValue(sheet.getRow(rowNum).getCell(0)).toString();
                        String product = formatter.formatCellValue(sheet.getRow(rowNum).getCell(1)).toString();
                        String quantity = formatter.formatCellValue(sheet.getRow(rowNum).getCell(2)).toString();
                        String price = formatter.formatCellValue(sheet.getRow(rowNum).getCell(3)).toString();
                        String oderNumber = formatter.formatCellValue(sheet.getRow(rowNum).getCell(4)).toString();
                        String externalOrderNumber = formatter.formatCellValue(sheet.getRow(rowNum).getCell(5)).toString();
                        System.out.println(email);

                        String previousEmail = "";
                        String previousOrderNumber = "";
                        if (rowNum > 0) {
                            previousEmail = formatter.formatCellValue(sheet.getRow(rowNum - 1).getCell(0)).toString();
                            previousOrderNumber = formatter.formatCellValue(sheet.getRow(rowNum - 1).getCell(4)).toString();
                        }
//                        new String(email).equals(previousEmail);
                        if (rowNum > 0 && email.equals(previousEmail) && oderNumber.equals(previousOrderNumber)) {
                            System.out.println("test1");
                            addNewCartDetails.addProduct(driver, product,quantity,price);

                        } else {
                            System.out.println("Test2");
                            addNewCartDetails.addEmail(driver, email);
                            addNewCartDetails.addProduct(driver, product,quantity,price);

                        }

                        String nextEmail = formatter.formatCellValue(sheet.getRow(rowNum + 1).getCell(0)).toString();
                        String nextOrderNumber = formatter.formatCellValue(sheet.getRow(rowNum + 1).getCell(4)).toString();


                        if (email.equals(nextEmail) && oderNumber.equals(nextOrderNumber)) {
                            System.out.println("test3");
                            return;
                        }
                        else {
                            System.out.println("test4");
                            addNewCartDetails.test(email,product,quantity,price,oderNumber,externalOrderNumber,driver,nextEmail,nextOrderNumber);

                        }

                        Thread.sleep(4000);

                        //Click on Store Tab
                        driver.findElement(By.xpath("//a[@class='sc-gFGZVQ cGUkEo undefined active active']")).click();

                        Thread.sleep(5000);

                        //Click on Add New Button
                        driver.findElement(By.xpath("//a[@class='sc-kDDrLX cApLfP']")).click();

                        Thread.sleep(7000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        driver.quit();*/
        loginNExcelRead();
    }

    public static void loginNExcelRead() throws InterruptedException, IOException {
        int rowCount = 0;

        // Read Excel file path
        String excelPath = "./data/TestData2.xlsx";
        // Excel Sheet Name
        String sheetName = "OldUserName_ReplacedNewProducts";
        // Create object from AddNewCartDetails Class
        AddNewCartDetails addNewCartDetails = new AddNewCartDetails();

        // Read Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
        // Select the related sheet
        XSSFSheet sheet = workbook.getSheet(sheetName);
        // get the count of rows in the sheet
        rowCount = sheet.getPhysicalNumberOfRows();
        // Open Browser
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\SankaKodda\\Downloads\\Commerce7BM\\Commerce7BM\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

//        DesiredCapabilities caps = new DesiredCapabilities();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("incognito");
//        caps.setCapability(ChromeOptions.CAPABILITY, options);
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);
//        driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Open URL
        driver.get("https://borough-markets.admin.platform.commerce7.com/login");

        // Maximise the Browser
        driver.manage().window().maximize();

        // Enter Valid Username
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("timalka@fh.technology");
        System.out.println("Enter Valid Username");

        Thread.sleep(5000);

        //Enter Valid Password
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Timalka123");
        System.out.println("Enter Valid Password");
        Thread.sleep(5000);

        login = true;
        //Click on Login BUtton
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        System.out.println();

        Thread.sleep(5000);


        //Click on Store Tab
        driver.findElement(By.xpath("(//a[@class='sc-gFGZVQ fqiyHI'])[2]")).click();
//        class="sc-gFGZVQ fqiyHI"
//        driver.findElement(By.xpath("(//a[@class=\"sc-gFGZVQ fqiyHI undefined active active\"]")).click();
        Thread.sleep(5000);
        System.out.println("Click on Store Tab");
        //Click on Add New Button
        driver.findElement(By.xpath("//a[@class='sc-kDDrLX crBOCu']")).click();
        System.out.println("Click on Add New Button");
        Thread.sleep(7000);
//        newOrder();

        // loop all rows using rowCount
        // rowCount --> count of the rows
        // x --> index of the iteration
        IntStream.range(0, rowCount).forEach(
                rowNum -> {
                    try {
                        // Excel sheet formatter
                        DataFormatter formatter = new DataFormatter();
                        String email = formatter.formatCellValue(sheet.getRow(rowNum).getCell(0)).toString();
                        String product = formatter.formatCellValue(sheet.getRow(rowNum).getCell(1)).toString();
                        String quantity = formatter.formatCellValue(sheet.getRow(rowNum).getCell(2)).toString();
                        String price = formatter.formatCellValue(sheet.getRow(rowNum).getCell(3)).toString();
                        String oderNumber = formatter.formatCellValue(sheet.getRow(rowNum).getCell(4)).toString();
                        String externalOrderNumber = formatter.formatCellValue(sheet.getRow(rowNum).getCell(5)).toString();
                        String date = formatter.formatCellValue(sheet.getRow(rowNum).getCell(6)).toString();
                        System.out.println(email);

                        String previousEmail = "";
                        String previousOrderNumber = "";
                        if (rowNum > 0) {
                            previousEmail = formatter.formatCellValue(sheet.getRow(rowNum - 1).getCell(0)).toString();
                            previousOrderNumber = formatter.formatCellValue(sheet.getRow(rowNum - 1).getCell(4)).toString();
                        }

//                        new String(email).equals(previousEmail);
                        if (rowNum > 0 && email.equals(previousEmail) && oderNumber.equals(previousOrderNumber)) {
                            System.out.println("test1");
                            addNewCartDetails.addProduct(driver, product, quantity, price);
                            System.out.println();
                        } else {
                            System.out.println("Test2");
                            addNewCartDetails.addEmail(driver, email);
                            addNewCartDetails.addProduct(driver, product, quantity, price);
                            System.out.println();
                        }

                        String nextEmail = formatter.formatCellValue(sheet.getRow(rowNum + 1).getCell(0)).toString();
                        String nextOrderNumber = formatter.formatCellValue(sheet.getRow(rowNum + 1).getCell(4)).toString();


                        if (email.equals(nextEmail) && oderNumber.equals(nextOrderNumber)) {
                            System.out.println("test3");
                            return;
                        } else {
                            System.out.println("test4");
                            addNewCartDetails.test(email, product, quantity, price, oderNumber, externalOrderNumber,date, driver, nextEmail, nextOrderNumber);

                        }

                        Thread.sleep(4000);
//                        newOrder();

                        //Click on Store Tab
                        driver.findElement(By.xpath("//a[@class='sc-gFGZVQ fqiyHI undefined active active']")).click();
                        System.out.println("click store button");
                        Thread.sleep(5000);
//
                        //Click on Add New Order Button
//                            driver.findElement(By.xpath("//div[@class='sc-bgA-dc eafPRL']")).click();
                        //a[@class='sc-kDDrLX crBOCu']
                        driver.findElement(By.xpath("//a[@class='sc-kDDrLX crBOCu']")).click();
                        System.out.println("click add new button");
                        Thread.sleep(7000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
        driver.quit();
    }
    public static void newOrder() throws InterruptedException {
        storeTab();
        addNewButton();
    }
    public static void excelReader() {

    }

    public static void storeTab() throws InterruptedException {
        //Click on Store Tab
        driver.findElement(By.xpath("//a[@class='sc-gFGZVQ cGUkEo undefined active active']")).click();
        System.out.println("click store button");
        Thread.sleep(5000);
    }

    public static void addNewButton() throws InterruptedException {
        //Click on Add New Button
        driver.findElement(By.xpath("//a[@class='sc-kDDrLX cApLfP']")).click();
        System.out.println("click add new button");
        Thread.sleep(7000);
    }

    public static void openBrowser() {
        // Open Browser
        /*System.setProperty("webdriver.chrome.driver","D:\\Commerce7BM\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/

//        DesiredCapabilities caps = new DesiredCapabilities();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("incognito");
//        caps.setCapability(ChromeOptions.CAPABILITY, options);
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);
//        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static void openURL() {
        // Open URL
        driver.get("https://borough-markets.admin.platform.commerce7.com/login");
    }

    public static void maximizeBrowser() {
        // Maximise the Browser
        driver.manage().window().maximize();
    }

    public static void validEmail() throws InterruptedException {
        // Enter Valid Username
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("timalka@fh.technology");
        System.out.println("Enter Valid Username");

        Thread.sleep(5000);
    }

    public static void validPassword() throws InterruptedException {
        //Enter Valid Password
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Timalka123");
        System.out.println("Enter Valid Password");
        Thread.sleep(5000);

        login = true;
    }

    public static void clickLogin() throws InterruptedException {
        //Click on Login BUtton
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        System.out.println();

        Thread.sleep(5000);
    }

}
