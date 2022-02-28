package week3.day5aasign;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqeryulSelectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable");
		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
			
//selectable
			driver.switchTo().frame(0);//frame  alwaysstarts index is 0
			
			WebElement ele1=driver.findElement(By.xpath("//li[text()='Item 1']"));
			WebElement ele5=driver.findElement(By.xpath("//li[text()='Item 5']"));
			Actions builder=new Actions(driver);
builder.clickAndHold(ele1).moveToElement(ele5).build().perform();
driver.switchTo().defaultContent();
	}

}
