package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer yr = 2026;
		String month = "January";
		System.out.println("Welcome to Git and Github...");
		System.out.println("Date Picker Example...");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		//mm/dd/yyyy
		//01/24/2024
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		while(true)
		{
			String month1=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			System.out.println("Actual month="+month1+":"+"Actual year="+year);
			if(year.equals(String.valueOf(yr)) && month1.equals(month))
			{
				driver.findElement(By.xpath("//a[@data-date='24']")).click();
				break;
			}
			if(yr<2024)  //2024<2024
			{
				//Previous button
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}

	driver.quit();	
		
	}

}
