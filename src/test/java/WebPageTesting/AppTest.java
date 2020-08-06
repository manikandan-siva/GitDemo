//its not running when ran from xml..not sure why
package WebPageTesting;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    
    {
    	
        assertTrue( true );
        System.out.println("Defualt - I came when maven was created. Mani did not create it");
    }
    @Test
	public void Apptest1()
	{
		
		System.out.println("Tested with appium");
	}
    
    
}
