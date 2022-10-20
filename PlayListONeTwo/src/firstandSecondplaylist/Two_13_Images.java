package firstandSecondplaylist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Two_13_Images {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Image.html");
		
		
		WebElement imageicon=ob.findElement(By.xpath("//img[@src='../images/home.png']"));
		imageicon.click();
		
		ob.navigate().back();
		
		
		WebElement brokenimage=ob.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		if(brokenimage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("The image is broken");
		}
		
		else
		{
			System.out.println("The image is not broken");
		}

	}

}
