package Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.File;
import java.time.LocalDateTime;

public class Report {

    public static ExtentTest test;
    public static ExtentReports report;

    public void createReport() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
//        StackTraceElement main = stack[stack.length - 1];
//        String mainClass = main.getClassName().split("\\.")[1];
//        String timeStamp = LocalDateTime.now().toString().split("\\.")[0];
//        String folderName = timeStamp.replaceAll(":","_");
        String filePath = System.getProperty("user.dir") + File.separator + "Reports";
        File dir = new File(filePath);
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Folder created succesfully.");
            } else {
                System.out.println("Folder could not be created.");
            }
        } else {
            System.out.println("Folder alreadyExists.");
        }

        report = new ExtentReports(System.getProperty("user.dir") + File.separator + "Reports" + File.separator + "report.html");
        test = report.startTest("tc_AddNewCartDetails");
    }

    public void endReporting() {
        report.endTest(test);
        report.flush();
    }
}
