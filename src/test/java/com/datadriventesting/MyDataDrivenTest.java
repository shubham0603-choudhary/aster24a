package com.datadriventesting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.skillio.DataProviderClass;
import com.skillio.exceptions.InvalidBrowserNameException;
public class MyDataDrivenTest {
	RemoteWebDriver driver;
	
	@Ignore
		@Test(dataProvider="pincodes",dataProviderClass = DataProviderClass.class)
		public void verifyIfProductIsDeliverableInArea(int pincode,String cityname){
			System.out.println("Pincode: "+pincode);		
		}
		
		
		@Parameters("browser-name")
		@Test
		public void verifyIfProductIsNoteDeliverableInArea(String browserName){
				if(browserName.equalsIgnoreCase("chrome")) {
					driver=new ChromeDriver();
				}
				else if(browserName.equalsIgnoreCase("firefox")) {
					driver=new FirefoxDriver();
				}
				else if(browserName.equalsIgnoreCase("edge")){
					driver=new EdgeDriver();
				}
				else {
					throw new InvalidBrowserNameException();
				}
				driver.get("https://www.helloskillio.com");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
			
}
