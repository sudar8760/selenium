package com.locator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public static final String FileUtils = null;
	WebDriver driver;
	
  public void getDriver() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	
}
  public void launchUrl(String data) {
	  driver.get(data);
          }
  public void enterText(WebElement element , String data) {
element.sendKeys(data);
}
  public void Click(WebElement element) {
element.click();
}
  public void Clear(WebElement element) {
	  element.clear();

}
  public void moveToElement(WebElement element) {
Actions ac = new Actions(driver);
ac.moveToElement(element).perform();
}
  public void enterTextByJS(String data,WebElement element) {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  js.executeScript("arguments[0].setAttribute('value','+data')","element");

}
  public void AcceptAlertandGetText(String name  ) {
	  
Alert AS = driver.switchTo().alert();
AS.accept();
 AS.getText();
System.out.println(name);

}
  public void robotEnterPressAndRelease() throws AWTException {
Robot R = new Robot();
R.keyPress(KeyEvent.VK_ENTER);
R.keyRelease(KeyEvent.VK_ENTER);

}
  public Select Selectvalue(WebElement element) {

Select drop = new Select(element);
return drop;
}
  public void SelectbyIndex(WebElement element,int Index) {
Select drop =Selectvalue(element);
drop.selectByIndex(Index);
}
  public void SelectByValue(WebElement element,String Value) {
Select drop = Selectvalue(element);
drop.selectByValue(Value);
}
  public void SelectByVisileText(WebElement element,String Text) {
Select drop = Selectvalue(element);
drop.selectByVisibleText(Text);
}
  public void deSelectAll(WebElement element) {
Select drop = Selectvalue(element);
drop.deselectAll();
}
  public void Screenshot(WebDriver driver ,String data) throws IOException {
TakesScreenshot Ts = (TakesScreenshot)driver;
File f = Ts.getScreenshotAs(OutputType.FILE);
File des = new File("data");

FileHandler.copy(f,des);

}
  public  void getCellValueandRowCountandcoloumnCount(String ExcelPath,String SheetName,int rowindex,int columnindex) throws IOException {
	  File file = new File(ExcelPath);
		
	FileInputStream Stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(Stream);
		Sheet S = w.getSheet(SheetName);
		Row r = S.getRow(rowindex);
		Cell c = r.getCell(columnindex);
		System.out.println(c);
		int count = r.getPhysicalNumberOfCells();
		System.out.println("no of coloumn "+count);
	    System.out.println("number of rows "+S.getPhysicalNumberOfRows());
	    
}
  public void StringType(String ExcelPath,String SheetName,int rowindex,int columnindex) throws IOException {
	  File file = new File(ExcelPath);
		
		FileInputStream Stream = new FileInputStream(file);
			Workbook w = new XSSFWorkbook(Stream);
			Sheet S = w.getSheet(SheetName);
			Row r = S.getRow(rowindex);
			Cell c = r.getCell(columnindex);
			int cellType = c.getCellType();
			if(cellType==1)
			{
				System.out.println("cellType is string");
				String name = c.getStringCellValue();
				System.out.println(name);}
				if(cellType==0)
				{
					if (DateUtil.isCellDateFormatted(c)) {
						Date date = c.getDateCellValue();
						SimpleDateFormat datfrmat =new SimpleDateFormat("dd-mm-yy");
						String name = datfrmat.format(date);
						System.out.println(name);
					} else{
						String name = String.valueOf((long)c.getNumericCellValue());
						
						System.out.println(name);
					}
						
						
					}
				}
	  
 
	  
}
  
  

