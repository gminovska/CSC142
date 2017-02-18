package testing_junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchWordTest {

	@Test
	public void test() {
		String[] testArray = {"cat", "dog", "mouse", "cat"};
		int catSearch = WordArrayDynamic.SearchWord(testArray);
		assertEquals(2, catSearch);
	}

}
