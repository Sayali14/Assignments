package com.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:/WS_Mission_Selenium/Selenium_Programs/AllDrivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//1.Open browser and get URL
		driver.get("https://virgoinnovations.com/Virgo/#/app/login");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		//2.Click on Signup link
		WebElement signUp=driver.findElement(By.xpath(".//*[@id='frmCaptcha']/div[6]/div/div/a[1]"));
		signUp.click();
		
		//3. Enter Email
		WebElement Email=driver.findElement(By.xpath("html/body/div/div/section[2]/div/div/div/div/div[3]/div[2]/form/div[2]/input"));	
		Email.sendKeys("sayali.inamdar20@gmail.com");
		
		//4.Enter Password
		WebElement Password=driver.findElement(By.xpath("html/body/div/div/section[2]/div/div/div/div/div[3]/div[2]/form/div[3]/div[2]/input"));
		Password.sendKeys("shravya1234");
		
		//5.Re-enter Password
		WebElement Confirm=driver.findElement(By.xpath("html/body/div/div/section[2]/div/div/div/div/div[3]/div[2]/form/div[4]/div[2]/input"));
		Confirm.sendKeys("shravya1234");
		
		//6.Click register button
		WebElement Register=driver.findElement(By.xpath("html/body/div/div/section[2]/div/div/div/div/div[3]/div[2]/form/div[5]/button[1]"));
		Register.click();
		
		//7.Click OK button after the message
		WebElement OK=driver.findElement(By.xpath("html/body/div/div/section/div/div/div/div/div/div/button/b"));
		OK.click();
		
		//8.After redirecting to Login page, enter registered Email Id
		WebElement UserName=driver.findElement(By.xpath("//*[@id='LoginID']"));
		UserName.sendKeys("sayali.inamdar20@gmail.com");
		
		//9.Enter Password
		WebElement UserPassword=driver.findElement(By.xpath("//*[@id='login-password']"));
		UserPassword.sendKeys("shravya1234");
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );
		//10.Click on Login button
		WebElement LoginButton=driver.findElement(By.xpath(".//*[@id='frmCaptcha']/div[5]/div/div/button"));
		LoginButton.click();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );
		
		//11.Enter received activation code
		WebElement ActCode=driver.findElement(By.xpath("html/body/div/div/section/div/div/div/div/div/form/div/input"));
		ActCode.sendKeys("435273");
		
		//12.Click on Activate Button
		WebElement ActivateBtn=driver.findElement(By.id("loginhide"));
		ActivateBtn.click();
		
		
		
		
		

	}

}
