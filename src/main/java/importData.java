import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class importData {
    static String FirstName;
    static String LastName;
    static String Phone;
    static String Email;
    static String Address1;
    static String Address2;
    static String City;
    static String State;
    static String Postcode;
    static String Country;
    static String UserName;
    static String Password;
    static String ConfirmPassword;

    public void data() {
        FileInputStream file = null;
        try {
            file = new FileInputStream(constant.Path_TestData + constant.File_TestData);
        } catch (FileNotFoundException e) {
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
        }
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFCell cellFirstName = sheet.getRow(1).getCell(0);
        XSSFCell cellLastName = sheet.getRow(1).getCell(1);
        XSSFCell cellPhone = sheet.getRow(1).getCell(2);
        XSSFCell cellEmail = sheet.getRow(1).getCell(3);
        XSSFCell cellAddress1 = sheet.getRow(1).getCell(4);
        XSSFCell cellAddress2 = sheet.getRow(1).getCell(5);
        XSSFCell cellCity = sheet.getRow(1).getCell(6);
        XSSFCell cellState = sheet.getRow(1).getCell(7);
        XSSFCell cellPostcode = sheet.getRow(1).getCell(8);
        XSSFCell cellCountry = sheet.getRow(1).getCell(9);
        XSSFCell cellUserName = sheet.getRow(1).getCell(10);
        XSSFCell cellPassword = sheet.getRow(1).getCell(11);
        XSSFCell cellConfirmPassword = sheet.getRow(1).getCell(12);

        FirstName = cellFirstName.getStringCellValue();
        LastName = cellLastName.getStringCellValue();
        Phone = cellPhone.getStringCellValue();
        Email = cellEmail.getStringCellValue();
        Address1 = cellAddress1.getStringCellValue();
        Address2 = cellAddress2.getStringCellValue();
        City = cellCity.getStringCellValue();
        State = cellState.getStringCellValue();
        Postcode = cellPostcode.getStringCellValue();
        Country = cellCountry.getStringCellValue();
        UserName = cellUserName.getStringCellValue();
        Password = cellPassword.getStringCellValue();
        ConfirmPassword = cellConfirmPassword.getStringCellValue();
    }
}
