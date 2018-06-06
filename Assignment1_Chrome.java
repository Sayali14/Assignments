package com.Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_Chrome {

	public static void main(String[] args) throws IOException {
		
		//1.	Go to http://toolsqa.com/automation-practice-form/
		//Hello from sourabh
		System.setProperty("webdriver.chrome.driver","E:/WS_Mission_Selenium/Selenium_Programs/AllDrivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		
		//2.	Select “Navigation Commands” in Selenium Commands
		Select sObj=new Select(driver.findElement(By.id("continents")));
		
		//3.	Select “Australia” in Continents
		sObj.selectByIndex(3);
		
		//4.	Click on “Selenium IDE” and “Selenium WebDriver”
		WebElement checkBox1=driver.findElement(By.xpath("//input[contains(@value,'Selenium IDE')]"));
		checkBox1.click();
		WebElement checkBox2=driver.findElement(By.id("tool-2"));
		checkBox2.click();
		
		
        //5.	Click on link “Selenium Automation Hybrid Framework” and “Test File to Download” and wait for files to download
				WebElement Link1=driver.findElement(By.linkText("Selenium Automation Hybrid Framework"));
				Link1.click();
				
				WebElement Link2=driver.findElement(By.linkText("Test File to Download"));
				Link2.click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		
		//6.	Upload a file from your local machine using Profile Picture
		WebElement browser=driver.findElement(By.id("photo"));
		browser.click();
		Runtime.getRuntime().exec("C:/Users/Sayali/Desktop/ProfilePic.au3");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		

		//7.	Click and Select “Manual Testing” and “Automation Tester” checkboxes
		WebElement checkBox3=driver.findElement(By.id("profession-0"));
	    checkBox3.click();
		
		WebElement checkBox4=driver.findElement(By.xpath("//input[contains(@value,'Automation Tester')]"));
		checkBox4.click();
		
		//8.	Enter your Date of Birth in Textbox
		WebElement DOB=driver.findElement(By.id("datepicker"));
		DOB.sendKeys("20/11/1988");
		
		//9.	Select your years of experience in Testing Field
		WebElement YOE=driver.findElement(By.id("exp-2"));
		YOE.click();
		
		//10.	Select your Gender
		WebElement Gender=driver.findElement(By.id("sex-1"));
		Gender.click();
		
		//11.	Enter Your Name and Surname in First Name and Last Name field
		WebElement FirstName=driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
		FirstName.sendKeys("Sayali");
		WebElement LastName=driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input"));
		LastName.sendKeys("Inamdar");

		
		
	}

}
