package testing_junit;

import org.junit.Assert;
import org.junit.Test;

public class CreateWordArrayTest {

	@Test
	public void test() {
		String[] myWords = WordArrayDynamic.CreateWordArray();
		String[] testWords = {"cat", "dog", "mouse", "horse"};
		Assert.assertArrayEquals(testWords, myWords);
		
	}

}

