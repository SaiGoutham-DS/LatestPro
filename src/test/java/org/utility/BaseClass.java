package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebElement ele;
	
	
	public static void launchthebrowser() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

	
	}
	

	public static void maxWindow() {
		
		driver.manage().window().maximize();
		
		
	}
	
	public static void title() {
		driver.getTitle();

	}
	
	public static void implicitWait(int milsec) {
		
		driver.manage().timeouts().implicitlyWait(milsec, TimeUnit.SECONDS);

	}
	
	
	public static void currentURL() {
	
		driver.getCurrentUrl();
	}
	
	
	public static void loadtheURL(String URL) {
	
		driver.get(URL);
		

	}
	

	public static void findElemnetID(String locator) {
		WebElement ele = driver.findElement(By.xpath(locator));

	}
	
	
	
	
	public static void passtxt(WebElement ele,String value) {
		ele.sendKeys(value);

	}
	
	
	public static void clickbutton(WebElement ele) {
		ele.click();

	}
	
	
	public static void close_the_Browser() {
		driver.close();
	}
	
	public static String excelReadDateNumericalDatas(String SheetName, int RowNo, int CellNo) throws IOException {

		File f = new File("C:\\Users\\SAI GOUTHAM\\Cucumber_Projects\\Excel\\Java.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet Particularsheet = w.getSheet(SheetName);

		Row R = Particularsheet.getRow(RowNo);

		Cell c = R.getCell(CellNo);

		int cellType = c.getCellType();

		String Value = "";

		if (cellType == 1) {

			Value = c.getStringCellValue();

		}

		else if (DateUtil.isCellDateFormatted(c)) {

			Date dd = c.getDateCellValue();

			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
			Value = s.format(dd);

		}

		else {

			double n = c.getNumericCellValue();
			long l = (long) n;
			Value = String.valueOf(l);

		}

		return Value;

	}

	
	public static void toCreateExcelSheet(String sheetName,int rowNo,int cellNo,String newValue) throws IOException {
		File f = new File("C:\\Users\\SAI GOUTHAM\\Demo_Project_For_Instalation_FrameWork\\Excel\\NewFile.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newsheet = w.createSheet(sheetName);
		Row newrow = newsheet.createRow(rowNo);
		Cell newcell = newrow.createCell(cellNo);
		newcell.setCellValue(newValue);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		
		System.out.println("Created New Excel Sheet Codes Are Executed");
		
		}
	
	public static void createNewRow(String sheetName,int rowNo,int cellNo,String newValue) throws IOException {
		File f = new File("C:\\Users\\SAI GOUTHAM\\Demo_Project_For_Instalation_FrameWork\\Excel\\NewFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet particularsheet = w.getSheet(sheetName);
		Row newrow = particularsheet.createRow(rowNo);
		Cell newcell = newrow.createCell(cellNo);
		newcell.setCellValue(newValue);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		
		System.out.println("Created New Row in Same Sheet codes are Executed");
	}
	
	public static void createNewCell(String sheetName,int rowNo,int cellNo,String newValue) throws IOException {
		File f = new File("C:\\Users\\SAI GOUTHAM\\Demo_Project_For_Instalation_FrameWork\\Excel\\NewFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet particularsheet = w.getSheet(sheetName);
		Row row = particularsheet.getRow(rowNo);
		Cell newcell = row.createCell(cellNo);
		newcell.setCellValue(newValue);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		
		System.out.println("Created New cell in Same Sheet codes are Executed");
	}
	
	
	public static void updateCell(String sheetName,int rowNo, int cellNo , String oldValue, String updatedValue) throws IOException {
		File f = new File("C:\\Users\\SAI GOUTHAM\\Demo_Project_For_Instalation_FrameWork\\Excel\\NewFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet particularsheet = w.getSheet(sheetName);
		Row row = particularsheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String Value = cell.getStringCellValue();
		if (Value.equals(oldValue)) {
			cell.setCellValue(updatedValue);
		}
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		
		System.out.println("Updated cell value codes are Executed");
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
