package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Cartest extends Baseclass{
	@Test(priority=1)
	
	public void cartverify() {
		loginobj.loginmthd("standard_user","secret_sauce");
		homeobj.txtmthd();
		homeobj.cartmthd();
		cartobj.cartclickmthd();
		
	}
	@Test(priority=2)
	public void textverification()
	{
		String actualtitle=cartobj.textverify();
		Assert.assertEquals(actualtitle,"cart");
	}
	public void checkoutverification()
	{
		cartobj.checkbtnclick();
	}
	
	

}
