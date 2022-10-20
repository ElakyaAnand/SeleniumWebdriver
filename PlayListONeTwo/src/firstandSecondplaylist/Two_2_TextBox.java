package firstandSecondplaylist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_2_TextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		WebElement emailaddress=ob.findElement(By.id("email"));
		emailaddress.sendKeys("hello@abc.com");
		
		
		WebElement appending=ob.findElement(By.xpath("//input[@value='Append ']"));
		appending.sendKeys("Keep Learning");
		
		WebElement textvalue=ob.findElement(By.xpath("//input[@value='TestLeaf']"));
		String result= textvalue.getAttribute("value");
		System.out.println(result);
		
		WebElement clearme=ob.findElement(By.xpath("//input[@value='Clear me!!']"));
		clearme.clear();
		
		WebElement editable=ob.findElement(By.xpath("//input[@disabled='true']"));
		boolean booleanresult= editable.isEnabled();
		System.out.println(booleanresult);

	}

}

