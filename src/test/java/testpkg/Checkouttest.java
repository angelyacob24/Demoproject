package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Checkouttest extends Baseclass{
	@Test(priority=1)
	public void checkoutverificationmthd()
	{
		loginobj.loginmthd("standard_user","secret_sauce");
		homeobj.txtmthd();
		homeobj.cartmthd();
		cartobj.cartclickmthd();
		cartobj.checkbtnclick();
		checkoutobj.checkoutmthd("angel","yacob","tffdd");
		
		
	}
	

}
