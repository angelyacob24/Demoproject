package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a") WebElement cartbtn;
	@FindBy(xpath="//*[@id=\"checkout\"]") WebElement checkbtn;
	
	public Cartpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void cartclickmthd()
	{
		cartbtn.click();
	}
	
	public String textverify()
	{
		String title=driver.getTitle();
		return title;
	}
	public void checkbtnclick()
	{
		checkbtn.click();
	}
	
	

}
