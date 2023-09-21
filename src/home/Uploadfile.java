package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.Chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\user\\Downloads\\downloadsbriq");
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		

	}

}
