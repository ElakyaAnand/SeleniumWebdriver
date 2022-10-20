package firstandSecondplaylist;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_14_DynamicTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver_New\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/table.html");


		List<WebElement> columns=ob.findElements(By.xpath("//th"));
		int columnsize= columns.size();
		System.out.println(columnsize);

		List<WebElement> rows=ob.findElements(By.xpath("//tr"));
		int rowsize= rows.size();
		System.out.println(rowsize);


		WebElement getprogressvalue=ob.findElement(By.xpath("//tr[3]//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String progressvalue= getprogressvalue.getText();
		System.out.println(progressvalue);


		List<WebElement> allprogressvalues=ob.findElements(By.xpath("//td[2]"));

		List<Integer> smallvalue=new ArrayList<Integer>();

		for (WebElement webElement : allprogressvalues) {

			String singlevaluesofprogress= webElement.getText().replace("%", "");
			smallvalue.add(Integer.parseInt(singlevaluesofprogress));

		}
		System.out.println(smallvalue);


		String filepath="//tr[4]//td[ ' "+ smallvalue + " ' ]//following::td[1]//input";

				WebElement clickcheckbox=ob.findElement(By.xpath(filepath));
		clickcheckbox.click();




	}

}
