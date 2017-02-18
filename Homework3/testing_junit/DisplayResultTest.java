package testing_junit;

import org.junit.Assert;
import org.junit.Test;

public class DisplayResultTest {

	@Test
	public void test() {
		
		String wordFound = WordArrayDynamic.DisplayResult(2);
		Assert.assertEquals("Word was found 2 times", wordFound);
		
		String wordNotFound = WordArrayDynamic.DisplayResult(0);
		Assert.assertEquals("The word was not found", wordNotFound);
		
	}

	
	
}
