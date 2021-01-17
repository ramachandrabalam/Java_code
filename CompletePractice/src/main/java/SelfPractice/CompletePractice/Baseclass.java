package SelfPractice.CompletePractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass {
	static WebDriver driver;
	static FileInputStream fis;
	static Properties prop;
	
	public void base() throws IOException {
		fis=new FileInputStream("F:\\Selenium\\CompletePractice\\base.properties");
		prop = new Properties();
		prop.load(fis);
		if(prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asd\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(prop.getProperty("browser").contains("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asd\\Desktop\\chromedriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asd\\Desktop\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	public static void main(String args[]) throws IOException {
		Baseclass b = new Baseclass();
		b.base();
	}

}
