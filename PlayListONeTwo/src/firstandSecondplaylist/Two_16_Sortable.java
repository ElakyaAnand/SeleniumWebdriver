package firstandSecondplaylist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Two_16_Sortable {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/drag.xhtml");
		
		WebElement bamboowatch=ob.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[1]//td[1]"));
		WebElement  Bracelet=ob.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[5]//td[1]"));
		
		
	Actions action=new Actions(ob);
	action.clickAndHold(Bracelet).moveToElement(bamboowatch).release(bamboowatch).build().perform();
	
		
	}

}
