package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class updateExcelFile {

    public static String getCellData(String filePath, String sheetName, int rowNum, int colNum)
            throws IOException {

        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(colNum);

        String value = cell.toString();

        workbook.close();
        fis.close();

        return value;
    }
}
