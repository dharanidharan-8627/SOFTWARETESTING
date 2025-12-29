package world;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.Driver", "C:\\Users\\ddhar\\eclipse-workspace\\Hello\\src\\world\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

	}

}
