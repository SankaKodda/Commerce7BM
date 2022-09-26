package CustomersAdding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    static WebDriver driver;
    public static void openBrowser() {
        // Open Browser
        /*System.setProperty("webdriver.chrome.driver","D:\\Commerce7BM\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public static void openURL() {
        // Open URL
        driver.get("https://borough-markets.admin.platform.commerce7.com/login");
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

        boolean login = true;
    }

    public static void clickLogin() throws InterruptedException {
        //Click on Login BUtton
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        System.out.println();

        Thread.sleep(5000);
    }
    public static void login() throws InterruptedException {
        openBrowser();
        openURL();
        validEmail();
        validPassword();
        clickLogin();
    }
}
