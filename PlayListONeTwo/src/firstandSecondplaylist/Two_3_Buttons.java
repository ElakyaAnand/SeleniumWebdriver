package firstandSecondplaylist;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_3_Buttons {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		WebElement homepage=ob.findElement(By.id("home"));
		homepage.click();
		ob.navigate().back();
		
		WebElement positionbutton=ob.findElement(By.id("position"));
		Point  positionvalues= positionbutton.getLocation();
		int xvalue=positionvalues.getX();
		int yvalue=positionvalues.getY();
		System.out.println(xvalue + "yvalue" + yvalue);

		
		WebElement colorbutton=ob.findElement(By.id("color"));
		String colorvalues= colorbutton.getCssValue("background-color");
		System.out.println(colorvalues);
		
		WebElement sizebutton=ob.findElement(By.id("size"));
		
		Dimension sizevalues= sizebutton.getSize();
		int heightvalue= sizevalues.getHeight();
		int widthvalue=sizevalues.getWidth();
		System.out.println(heightvalue + "widthvalue "+ widthvalue);
		
		
	}

}
