package week3.day5aasign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jqeryuiresize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			
			//resizeable
			driver.switchTo().frame(0);//frame  alwaysstarts index is 0
			
		WebElement ele1=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
			//WebElement ele3=driver.findElement(By.xpath("//li[text()='Item 3']"));
			Actions builder=new Actions(driver);
			builder.dragAndDropBy(ele1,70,30).build().perform();
			driver.switchTo().defaultContent();

	}

}
