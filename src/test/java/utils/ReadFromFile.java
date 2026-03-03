package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class ReadFromFile {
   /* @Test
    public void loginWithExcelData() throws Exception {

        String filePath = "src/test/resources/Testdata.xlsx";

        String username = ExcelUtils.getCellData(filePath, "Sheet1", 1, 0);
        String password = ExcelUtils.getCellData(filePath, "Sheet1", 1, 1);

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("login")).click();

        driver.quit();}*/
    private static String testData = System.getProperty("user.dir")+"/src/test/resources/testData.xlsx";
    public static DataFormatter dataFormatter = new DataFormatter();

    static FileInputStream fs;

    static {
        try {
            fs = new FileInputStream(testData);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFWorkbook workbook;
    static {
        try {
            workbook = new XSSFWorkbook(fs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    static XSSFSheet sheet = workbook.getSheet("Sheet1");
    public static String firstname = sheet.getRow(1).getCell(0).getStringCellValue();
    public static String lastname = sheet.getRow(2).getCell(1).getStringCellValue();
    public static String email = dataFormatter.formatCellValue(sheet.getRow(3).getCell(2));
    public static String password = dataFormatter.formatCellValue(sheet.getRow(4).getCell(3));
    public static String confirmPassword = dataFormatter.formatCellValue(sheet.getRow(5).getCell(4));
}
