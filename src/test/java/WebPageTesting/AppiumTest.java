//As this does not have suffix test, it will not run if we eecute it directly using maven. But if executed via xml which is triggered bymaven, it will run
package WebPageTesting;

import org.testng.annotations.Test;


public class AppiumTest {

	@Test
	public void Apptest()
	{
		
		System.out.println("Tested with appium");
	}
}
