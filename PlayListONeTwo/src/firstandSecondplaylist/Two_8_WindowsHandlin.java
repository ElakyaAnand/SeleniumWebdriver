package firstandSecondplaylist;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_8_WindowsHandlin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		String parentwindow= ob.getWindowHandle();
		WebElement homepage=ob.findElement(By.id("home"));
		homepage.click();
	Set<String> childwindow=	ob.getWindowHandles();
	for (String string : childwindow) {
		
		ob.switchTo().window(string);
		
	}
	
	WebElement editbutton=ob.findElement(By.xpath("//img[@src='images/edit.png']"));
	editbutton.click();
	ob.close();
	
	ob.switchTo().window(parentwindow);
	
	
	WebElement multiplewindows=ob.findElement(By.xpath("//button[@onclick='openWindows()']"));
	multiplewindows.click();
	Set<String> openedwindows=	ob.getWindowHandles();
	int openedwindowscount= openedwindows.size();
	System.out.println(openedwindowscount);
	
	
	WebElement colorbutton=ob.findElement(By.id("color"));
	colorbutton.click();
	Set<String> openedchildwindows= ob.getWindowHandles();
	for (String string : openedchildwindows) {
		
		if(!string.equals(parentwindow))
		{
			ob.switchTo().window(string);
		}
		ob.close();
	}
	
	
	
	

	}

}
