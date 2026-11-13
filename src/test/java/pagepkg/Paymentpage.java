package pagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"finish\"]")WebElement finishbtn;
	public Paymentpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void scrnshotmthd() throws Exception
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s,new File("C:\\Users\\USER\\OneDrive\\Pictures\\Screenshots\\chkoutinformation.png"));
	}
	
	public void finishbutonclickmthd()
	{
		finishbtn.click();
	}
	
	

}
