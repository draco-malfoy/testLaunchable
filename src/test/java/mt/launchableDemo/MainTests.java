package mt.launchableDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTests {

	@Test
	void testSum() {
		int a = 10, b = 5;
		Assertions.assertEquals(15, DemoApp.sum(a, b));
	}
	
	@Test
	void testSubtraction() {
		int a = 10, b = 5;
		Assertions.assertEquals(5, DemoApp.substract(a, b));
	}
	
	@Test
	void testMultiplication() {
		int a = 10, b = 5;
		Assertions.assertEquals(50, DemoApp.multiplication(a, b));
	}
	
	@Test
	void testDivision() {
		int a = 10, b = 5;
		Assertions.assertEquals(2, DemoApp.division(a, b));
	}
	
	@Test
	void testPower() {
		int a = 10, b = 5;
		Assertions.assertEquals(100000, DemoApp.power(a, b));
	}
}
