package firstandSecondplaylist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One_Links_Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		
		WebElement homepage= ob.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		ob.navigate().back();
		
		
		WebElement wheretogo=ob.findElement(By.partialLinkText("Find where am supposed to go"));
		wheretogo.click();
		ob.navigate().back();
		
		
		WebElement brokenlink=ob.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();
		WebElement tagging= ob.findElement(By.tagName("H1"));
		String tagtext= tagging.getText();
		if(tagtext.equals("Not Found"))
		{
			System.out.println("The link is broken");
		}
		else
		{
			System.out.println("The link is not broken");
		}
		System.out.println(tagtext);
		ob.navigate().back();
		
		
		List<WebElement> linkscount=ob.findElements(By.tagName("a"));
		int countresult= linkscount.size();
		System.out.println(countresult);
		
		
	}

}
