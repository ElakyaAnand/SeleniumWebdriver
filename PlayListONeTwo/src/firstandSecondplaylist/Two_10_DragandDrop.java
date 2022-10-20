package firstandSecondplaylist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Two_10_DragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/drag.xhtml;jsessionid=node010c1xkx9whz8hlboils9b7ul4372854.node0");
		
		WebElement droppable=ob.findElement(By.xpath("//div[@id='form:drop_content']//p"));
		WebElement draggable=ob.findElement(By.xpath("//div[@id='form:drag_content']//p"));
		
		
		Actions action=new Actions(ob);
		
		//action.clickAndHold(draggable).moveToElement(droppable).release(droppable).build().perform();
		
		action.dragAndDrop(draggable, droppable).release(droppable).build().perform();

	}

}
