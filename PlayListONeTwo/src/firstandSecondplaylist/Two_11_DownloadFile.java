package firstandSecondplaylist;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_11_DownloadFile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/file.xhtml");

		
		WebElement downloadbutton=ob.findElement(By.xpath("//button[@id='j_idt93:j_idt95']//span[2]"));
		downloadbutton.click();
		
		File filepath=new File("C:\\Users\\anand\\Downloads");
		File[] allfiles= filepath.listFiles();
		for (File file : allfiles) {
			
			if(file.getName().equals("TestLeaf Logo.png"))
			{
				System.out.println("The file is downloaded");
			}
			
		}
		
	}

}

