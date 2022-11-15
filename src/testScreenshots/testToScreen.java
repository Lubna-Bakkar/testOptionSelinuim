package testScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class testToScreen {

	public static void main(String[] args) throws IOException {
		
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-laptop\\Desktop\\myNewDriver\\chromedriver.exe");
		
		//System.setProperty("webdriver.Edge.driver", "D:\\edgeDriver\\msedgedriver.exe");
		
		//WebDriver driver = new EdgeDriver();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
driver.get("http://127.0.0.1:5500/index.html");

List <WebElement> myOptions=driver.findElements(By.tagName("option"));
for (int i = 0; i < myOptions.size(); i++) {

	if (i % 2 == 0) {

		myOptions.get(i).click();

		System.err.println("sorry i will remove " + myOptions.get(i).getText());
		driver.findElement(By.id("remove")).click();

	} else {

		System.out.println(" i will keep " + myOptions.get(i).getText());
	}

}

}
	
	

///-----------screenshot-------
//Date currenTime = new Date (); 

//String screenshotFileName = currenTime.toString().replace(":", "-");
	//TakesScreenshot scrShot =((TakesScreenshot)driver);
	//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	//File DestFile=new File("./screenshot/"+screenshotFileName+".png");
	//FileUtils.copyFile(SrcFile,  DestFile);


}
