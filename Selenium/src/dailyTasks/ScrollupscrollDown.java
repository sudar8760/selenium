package dailyTasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupscrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
	//	js.executeScript("document.getElementsByClassName('hm-icon-label').click()");
		WebElement link = driver.findElement(By.className("hm-icon-label"));
		WebElement link2=driver.findElement(By.id("twotabsearchtextbox"));
				js.executeScript("argument[0].setAttribute('value','greens')", link2);
		
		
	
		js.executeScript("arguments[0].click()",link);
		
		
		
	}

}
