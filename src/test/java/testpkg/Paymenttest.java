package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Paymenttest extends Baseclass {
	@Test(priority=1)
	public void screenshotverification() throws Exception
	{
		loginobj.loginmthd("standard_user","secret_sauce");
		homeobj.txtmthd();
		homeobj.cartmthd();
		cartobj.cartclickmthd();
		cartobj.checkbtnclick();
		checkoutobj.checkoutmthd("angel","yacob","tffdd");
		paymentobj.scrnshotmthd();
	}
	@Test(priority=2)
	public void finishbuttonvalidation()
	{
		paymentobj.finishbutonclickmthd();
	}

}
