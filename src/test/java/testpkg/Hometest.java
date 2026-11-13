package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Hometest extends Baseclass{
	@Test(priority=1)
	
	public void texttoverify()
	{
		//loginobj.loginmthd("standard_user","secret_sauce");
		String productext=homeobj.txtmthd();
		Assert.assertEquals(productext,"Products");
	}
	
	@Test(priority=2)
	public void linkverify()
	{
		int linkcount=homeobj.linkcountmthd();
		System.out.println("no of links: "+linkcount);
	}
	
	@Test(priority=3)
	public void cartmethod()
	{
		homeobj.cartmthd();
	}
	
	
	

}
