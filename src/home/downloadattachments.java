package home;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class downloadattachments {

	public static void main(String[] args) throws Throwable {
		String filetype = "jpg";
		
	WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		
		
		HashMap<String, Object> Prefs = new HashMap<>();
		Prefs.put("plugins.always_open_jpg_ extrenally", true);
		Prefs.put("download.default_directory","C:\\Users\\user\\Downloads\\downloadsbriq");
		
		options.setExperimentalOption(filetype, Prefs);
		
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/download");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='download/image4.jpg']")).click();
		driver.findElement(By.xpath("//a[@href=\"download/megadyneBladeHero.jpg\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"download/logo.jpeg\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"download/2e18yn-1884509727.jpg\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"download/RBC_0082.JPG\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"download/plane.jpg\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"download/image3.jpg\"]")).click();
		
	}

}
