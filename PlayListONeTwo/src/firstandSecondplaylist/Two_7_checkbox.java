package firstandSecondplaylist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_7_checkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/checkbox.html");

		WebElement java=ob.findElement(By.xpath("//section//div[1]//label//following::input[1]"));
		java.click();

		WebElement confirmation=ob.findElement(By.xpath("//div[2]//input"));
		if( confirmation.isSelected())
		{
			System.out.println("Selenium is selected");
		}
		else
		{
			System.out.println("Selenium is not selected");
		}
		
		WebElement notselected=ob.findElement(By.xpath("//section//div[3]//input[1]"));
		WebElement iamselected=ob.findElement(By.xpath("//section//div[3]//input[2]"));
		
		if(notselected.isSelected())
		{
			notselected.click();
		}
		else if(iamselected.isSelected())
		{
			iamselected.click();
		}
		
		

	}

}
