package firstandSecondplaylist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_15_Calender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		
		
		WebElement datepicker=ob.findElement(By.id("datepicker"));
		datepicker.click();
		
		WebElement date=ob.findElement(By.linkText("14"));
		date.click();
		

	}

}
