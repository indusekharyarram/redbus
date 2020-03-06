package Testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import libraries.wrapper_ex;
import pages.search;

public class testcase extends wrapper_ex {
	@BeforeClass
	public void startUp() 
	{
		launch("chrome", "https://www.redbus.in/");
		}
	@Test
	public void launch() throws InterruptedException
	{
		search lpage=new search(driver);
		lpage.From("Chennai");
		Thread.sleep(3000);
		lpage.To("Ongole");
		Thread.sleep(3000);
		lpage.OnwordDate1();
		Thread.sleep(3000);
		lpage.OnwordDate();
		Thread.sleep(3000);
		lpage.ReturnDate1();
		Thread.sleep(3000);
		lpage.ReturnDate();
		Thread.sleep(3000);
		lpage.Search();
		Thread.sleep(3000);
	}
	@AfterClass
	public void quit() throws InterruptedException
	{
	driver.close();
	Thread.sleep(10000);
	}
	}
