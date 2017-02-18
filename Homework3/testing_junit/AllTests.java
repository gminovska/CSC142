package testing_junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CreateWordArrayTest.class, DisplayResultTest.class, SearchWordTest.class })
public class AllTests {

}
