import Reporter.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tc_AddNewCartDetails {

    public static void main(String[] args) throws InterruptedException {

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

        //Click on SignIn Button
        driver.findElement(By.xpath("//span[text()='Login']")).click();

        Thread.sleep(5000);

        //Click on Store Tab
        driver.findElement(By.xpath("(//a[@class='sc-gFGZVQ cGUkEo'])[2]")).click();

        Thread.sleep(5000);

        //Click on Add New Button
        driver.findElement(By.xpath("//a[@class='sc-kDDrLX cApLfP']")).click();

        Thread.sleep(7000);

        //Search Customer
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn jDKUna jGqRAO'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn jDKUna jGqRAO'])[1]")).sendKeys("asher@hyperspacehub.com");

        Thread.sleep(7000);

        //
        driver.findElement(By.xpath("//div[@class='sc-isuzjp btnZLT']")).click();

        Thread.sleep(5000);

        //Search Order Item
        driver.findElement(By.id("productVariantInlineSearch")).clear();
        driver.findElement(By.id("productVariantInlineSearch")).sendKeys("2015 Reserve Pinot Noir");

        Thread.sleep(5000);

        //Add Items
        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn jDKUna kUdrlC']")).clear();
        driver.findElement(By.xpath("//input[@class='sc-kgflAQ sc-jdAMXn jDKUna kUdrlC']")).sendKeys("6");

        Thread.sleep(5000);

        //Add Price
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn jDKUna jGqRAO'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@class='sc-kgflAQ sc-jdAMXn jDKUna jGqRAO'])[2]")).sendKeys("30");

        Thread.sleep(5000);

        //Click on Select BUtton
        driver.findElement(By.xpath("//span[text()='Select']")).click();

        Thread.sleep(5000);

        //Click on Alternative Button
        driver.findElement(By.xpath("//span[text()='Add Alternate Tender']")).click();

        Thread.sleep(5000);

        //Select Tender Type
        {
            try {

                Thread.sleep(5000);
                Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='sc-kgflAQ sc-ZyCDH jDKUna gmXCmT']")));
                dropdown.selectByVisibleText("External");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        Thread.sleep(5000);

        //Click on Add Tender Button
        driver.findElement(By.xpath("//span[text()='Add Tender']")).click();

        Thread.sleep(5000);

        //Click on Charge Button
        driver.findElement(By.xpath("(//span[@class=\"sc-iqcoie cXrpHJ\"])[6]")).click();

        Thread.sleep(5000);

        //Click on Fulfill Button
        driver.findElement(By.xpath("(//span[@class=\"sc-iqcoie cXrpHJ\"])[1]")).click();

        Thread.sleep(5000);

        //Select Carrier
        {
            try {

                Thread.sleep(5000);
                Select dropdown = new Select(driver.findElement(By.xpath("//select[@id=\"shipped.carrier\"]")));
                dropdown.selectByVisibleText("Other");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        Thread.sleep(5000);

        //Enter Tracking Number
        driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']")).clear();
        driver.findElement(By.xpath("//input[@id='shipped.trackingNumbers[0]']")).sendKeys("36243000011170100");

        Thread.sleep(5000);

        //Click on Add Fulfillment Button
        driver.findElement(By.xpath("//span[text()='Add Fulfillment']")).click();

        Thread.sleep(5000);

        //Add Order Note
        driver.findElement(By.xpath("//textarea[@id='content']")).clear();
        driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("36243000011170100");

        Thread.sleep(5000);

        //Click on Add Note Button
        driver.findElement(By.xpath("(//span[text()='Add Note'])[1]")).click();

        Thread.sleep(5000);


        driver.quit();
    }
}
