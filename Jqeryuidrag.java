package week3.day5aasign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jqeryuidrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//drag
			driver.switchTo().frame(0);//frame  alwaysstarts index is 0
			
			WebElement drag=driver.findElement(By.id("draggable"));
				
				Actions builder=new Actions(driver);
				builder.dragAndDropBy(drag,90,80).build().perform();
				driver.switchTo().defaultContent();

			
	}

}
