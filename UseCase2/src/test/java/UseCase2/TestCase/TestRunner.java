package UseCase2.TestCase;

import org.testng.annotations.Test;

public class TestRunner {
	
	 @Test
	    public void runTestCases() {
	        PositiveTestCase positiveTest = new PositiveTestCase();
	        NegativeTestCase negativeTest = new NegativeTestCase();

	        // Run positive test case
	        positiveTest.positiveTest();

	        // Run negative test case
	        negativeTest.negativeTest();
	    }


}
