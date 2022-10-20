package firstandSecondplaylist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Two_4_DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		
		WebElement 	index=ob.findElement(By.id("dropdown1"));
		Select indexselect=new Select(index);
		indexselect.selectByIndex(3);
		
		
		WebElement name=ob.findElement(By.name("dropdown2"));
		Select nameselect=new Select(name);
		nameselect.selectByVisibleText("Selenium");
		
		WebElement value=ob.findElement(By.id("dropdown3"));
		Select vlaueselect=new Select(value);
		vlaueselect.selectByValue("2");
		
		
		WebElement dropdownvalue=ob.findElement(By.xpath("//select[@class='dropdown']"));
		Select dropdownvalueselect=new Select(dropdownvalue);
		List<WebElement> listvalue= dropdownvalueselect.getOptions();
		int count= listvalue.size();
		System.out.println(count);
		
		WebElement sendkey=ob.findElement(By.xpath("//div[5]//select"));
		sendkey.sendKeys("Selenium");
		
		
		WebElement selectall=ob.findElement(By.xpath("//div[6]//select"));
		Select selectallvalues=new Select(selectall);
		selectallvalues.selectByIndex(0);
		selectallvalues.selectByIndex(1);
		selectallvalues.selectByIndex(2);

	}

}
