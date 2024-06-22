package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    public static String getDataFromSheet(String pageName,int rowIndex,int columnIndex){

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("src/main/resources/TestData/Datas.xlsx"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet = workbook.getSheet(pageName);
        String value=  sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
        return value;
    }
}
