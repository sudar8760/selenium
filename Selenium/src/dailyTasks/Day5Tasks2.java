package dailyTasks;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Day5Tasks2 {
	private static final CharSequence j = null;
	private static int WD;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etownpanchayat.com/PublicServices/Water/ConnectionSearch.aspx");
		driver.manage().window().maximize();
		WebElement SEL = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_dlstDistrict\"]"));
		Select sel = new Select(SEL);
		sel.selectByVisibleText("Tirupur");
		WebElement sel2 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_dlstPanchayat\"]"));
		Select sel1=new Select(sel2);
		sel1.selectByVisibleText("Kolathupalayam");
		
	
	for (int i = 1300
			; i < 1301; i++) {
		WebElement taxno = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtTaxNo\"]"));
		taxno.sendKeys(""+i);	
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lblDoorNo\"]"));
		String text = findElement.getText();
		System.out.println(text);
		
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lblWardNo\"]"));
		String text2 = findElement2.getText();
		System.out.println(text2);
		
		if (text=="57-2" && text2=="WD-14")
		{
			String taxno1 = taxno.getAttribute("Value");
				System.out.println(taxno1);
			}
		
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtTaxNo\"]")).clear();
		 Alert al= driver.switchTo().alert();
		 
			al.accept();
			Thread.sleep(1000);
	}
	

 }}
		
		
		
		


