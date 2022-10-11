package Report;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.File;

public class Report {
    public static ExtentTest test;
    public static ExtentReports report;

    public void createReport(String tcName) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String filePath = System.getProperty("user.dir") + File.separator + "Reports";
        File dir = new File(filePath);
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Folder created Successfully.");
            } else {
                System.out.println("Folder could not be created.");
            }
        } else {
            System.out.println("Folder alreadyExists.");
            report = new ExtentReports(System.getProperty("user.dir") + File.separator + "Reports" + File.separator + tcName+"report.html");
            test = report.startTest(tcName);
        }


    }

    public static void endReporting() {
        report.endTest(test);
        report.flush();
    }
}
