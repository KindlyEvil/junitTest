package unittestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class unittestaddnumbers {

	@Test
	void test() {
			unitFunction junit = new unitFunction();
			int result = junit.addNumbers(20, 20);
			assertEquals(40,result);


	}

}
