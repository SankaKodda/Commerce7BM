package CustomersAdding;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.stream.IntStream;

import static CustomersAdding.Login.driver;

public class CustomerDetailExcelRead  {

    public static void readExcel() throws IOException {
        int rowCount = 0;

        // Read Excel file path
        String excelPath = "./data/TestData1.xlsx";
        // Excel Sheet Name
        String sheetName = "CustomerDetails";
        // Create object from AddNewCartDetails Class
        CustomerDetail customerDetails = new CustomerDetail();
        AddNewCustomerDetails addNewCustomerDetails = new AddNewCustomerDetails();

        // Read Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
        // Select the related sheet
        XSSFSheet sheet = workbook.getSheet(sheetName);
        // get the count of rows in the sheet
        rowCount = sheet.getPhysicalNumberOfRows();

        // loop all rows using rowCount
        // rowCount --> count of the rows
        // x --> index of the iteration
        IntStream.range(0, rowCount).forEach(
                rowNum -> {
                    try {
                        // Excel sheet formatter
                        DataFormatter formatter = new DataFormatter();
                        String firstName = formatter.formatCellValue(sheet.getRow(rowNum).getCell(0)).toString();
                        String lastName = formatter.formatCellValue(sheet.getRow(rowNum).getCell(1)).toString();
                        String userEmail = formatter.formatCellValue(sheet.getRow(rowNum).getCell(2)).toString();
                        System.out.println(firstName+" "+lastName+" "+userEmail);
                        AddNewCustomerDetails.addCustomerFirstName(driver,firstName);
                        AddNewCustomerDetails.addCustomerLastName(driver,lastName);
                        AddNewCustomerDetails.addCustomerEmailName(driver,userEmail);
                        addNewCustomerDetails.addCustomer(driver,firstName,lastName,userEmail);
                        String previousUserEmail = "";
                        String previousOrderNumber = "";
                        if (rowNum > 0) {
                            previousUserEmail = formatter.formatCellValue(sheet.getRow(rowNum - 1).getCell(0)).toString();
                            previousOrderNumber = formatter.formatCellValue(sheet.getRow(rowNum - 1).getCell(4)).toString();
                        }

//                        new String(email).equals(previousEmail);
                        /*if (rowNum > 0 && userEmail.equals(previousUserEmail) && oderNumber.equals(previousOrderNumber)) {
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

                        }*/

                        Thread.sleep(4000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
