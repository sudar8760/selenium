package dailyTasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]"));
		findElement.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		//WebElement findElement = driver.findElement(By.id("email"));
		//findElement.sendKeys("sudar");
	//	JavascriptExecutor executor=(JavascriptExecutor)driver;
    //    WebElement findElement2 = driver.findElement(By.id("pass"));
      //executor.executeScript("arguments[0].SetAttribute('value','hello')", findElement2);
   //     WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"u_0_2_3E\"]"));
      //  findElement2.click();
	}}
