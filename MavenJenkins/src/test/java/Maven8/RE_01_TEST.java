package Maven8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RE_01_TEST {
	@Test
	public void demo() {
		System.setProperty("webdriver.chrome.driver","./drivers2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
