import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	
	public void arrayTestcase()
	{
		ArrayDemo a=new ArrayDemo();
		
		assertArrayEquals("Incorrect",
				new int[] {11,22,33},
	a.removeDuplicates(new int[] {11,11,11,22,22,33,22,22}));
		
		
	}

	
	@Test
	public void sumofArrayTest()
	{
		
		ArrayDemo a=new ArrayDemo();
		assertEquals("Invalid data",5,
				a.summofArray(new int[] {1,2,2}));
		
		assertEquals("Invalid data",12,
				a.summofArray(new int[] {7,0,0,2,2,1}));
	
		assertEquals("Invalid data",1,
				a.summofArray(new int[] {0,0,0,1}));
	
	
	}
}
