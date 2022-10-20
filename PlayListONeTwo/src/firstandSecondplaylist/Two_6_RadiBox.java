package firstandSecondplaylist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_6_RadiBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/radio.html");
		
		
		WebElement yesradio=ob.findElement(By.id("yes"));
		yesradio.click();
		
		
		WebElement unchecked=ob.findElement(By.xpath("//div[2]//input[1]"));
		WebElement checked=ob.findElement(By.xpath("//div[2]//input[2]"));
		
		if(unchecked.isSelected())
		{
			System.out.println("The unchecked is selected");
		}

		else if(checked.isSelected())
		{
			System.out.println("checked is selected");
		}
		else
		{
			System.out.println("Nothing is selected");
		}
		
		
	}

}
