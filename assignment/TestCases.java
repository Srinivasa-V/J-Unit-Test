package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCases {
	calculatorPgm pgm = new calculatorPgm();

	@Test
	void addtest() {
		double result=pgm.add(100,'+',200);
		assertEquals(300,result);
	}
	@Test
	void addtest1() {
		double result=pgm.add(100,'+',200);
		assertEquals(310,result);
	}
	@Test
	void addtest2() {
		double result=pgm.add(-100,'+',200);
		assertEquals(100,result);
	}
	@Test
	void addtest3() {
		double result=pgm.add(-100,'+',-200);
		assertEquals(-300,result);
	}
	@Test
	void addtest4() {
		double result=pgm.add(-100,'+',200);
		assertEquals(300,result);
	}
	@Test
	void addtest5() {
		double result=pgm.add(-100,'+',-200);
		assertEquals(300,result);
	}
}
