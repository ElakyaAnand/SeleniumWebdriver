package firstandSecondplaylist;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_12_UploadFile {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/file.xhtml");
		
		
		try {
		Thread.sleep(3000);	
			WebElement choosebutton=ob.findElement(By.xpath("//span[@id='j_idt88:j_idt89']//span"));
			choosebutton.click();
			
			StringSelection filepath=new StringSelection("C:\\Users\\anand\\Downloads\\TestLeaf Logo.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
			
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
				

	}

}
