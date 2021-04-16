package unittestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class unittestaddstring {

	@Test
	void test() {
		unitFunction junitString = new unitFunction();
		String result = junitString.addString("i am ","batman");
		assertEquals("i am batman",result);
	}

}
