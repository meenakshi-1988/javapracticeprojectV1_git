package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	// driver = new FirefoxDriver();
	//comment the above 2 lines and uncomment below 2 lines to use Chrome
	public void main(String args[]){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenakshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver dv = new ChromeDriver();
	dv.get("http://demo.guru99.com/test/newtours/");
}
}