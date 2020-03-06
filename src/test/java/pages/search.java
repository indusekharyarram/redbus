package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.inject.Key;

public class search {
	WebDriver driver;
	By From=By.xpath("//*[@id=\"src\"]");
	By To=By.xpath("//*[@id=\"dest\"]");
	By OnwordDate1=By.xpath("//*[@id=\"search\"]/div/div[3]/div/label");
	By OnwordDate=By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[5]");
	By ReturnDate1=By.xpath("//*[@id=\"search\"]/div/div[4]/span");
	By ReturnDate=By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[6]/td[4]");
	By Search=By.xpath("//*[@id=\"search_btn\"]");
	public search(WebDriver driver)
	{
		this.driver=driver;
	}
	public void From(String abc)
	{
		driver.findElement(From).sendKeys(abc);
		Actions at=new Actions(driver);
		at.sendKeys(Keys.ENTER);
	}
	public void To(String bcd)
	{
		driver.findElement(To).sendKeys(bcd);
		Actions at=new Actions(driver);
		at.sendKeys(Keys.ENTER);
	}
	public void OnwordDate1()
	{
		driver.findElement(OnwordDate1).click();
	}
	public void OnwordDate()
	{
		driver.findElement(OnwordDate).click();
	}
	public void ReturnDate1()
	{
		driver.findElement(ReturnDate1).click();
	}
	public void ReturnDate()
	{
		driver.findElement(ReturnDate).click();
	}
	public void Search()
	{
		driver.findElement(Search).click();
	}
}
