package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
	@Test
	  public void method1()
	  {
		  Reporter.log("method1", true);
		  
	  }
	  @Test
	  public void method2()
	  {
		  Reporter.log("method2", true);
		  
	  }
	  @Test
	  public void method3()
	  {
		  Reporter.log("method3", true);
		  
	  }
	  @Test
	  public void method4()
	  {
		  int i=0;
		  int res=8/i;
		  System.out.println(res);
		  Reporter.log("method4", true);
		  
	  }
	  @Test
	  public void method5()
	  {
		  Reporter.log("method5", true);
		  
	  }
}
