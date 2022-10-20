package firstandSecondplaylist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_9_Iframes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		ob.switchTo().frame(0);
		WebElement frameone=ob.findElement(By.id("Click"));
		frameone.click();
		String frametext= frameone.getText();
		System.out.println(frametext);
		
		ob.switchTo().defaultContent();
		
		
		ob.switchTo().frame(1);
		ob.switchTo().frame("frame2");
		
		WebElement framesecond=ob.findElement(By.id("Click1"));
		framesecond.click();
		String framesecondtext= framesecond.getText();
		System.out.println(framesecondtext);
		
		ob.switchTo().defaultContent();
		
		List<WebElement> allframes=ob.findElements(By.tagName("iframe"));
		int framecount= allframes.size();
		System.out.println(framecount);
	}

}
