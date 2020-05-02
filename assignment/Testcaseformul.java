package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Testcaseformul {
	calculatorPgm pgm = new calculatorPgm();
	@Test
	void multest() {
		double result=pgm.mul(100,'*',200);
		assertEquals(20000,result);
	}
	@Test
	void multest1() {
		double result=pgm.sub(100,'*',200);
		assertEquals(100200,result);
	}
	@Test
	void multest2() {
		double result=pgm.mul(-100,'*',200);
		assertEquals(-20000,result);
	}
	@Test
	void multest3() {
		double result=pgm.sub(-100,'*',200);
		assertEquals(-100200,result);
	}
	@Test
	void multest4() {
		double result=pgm.mul(-100,'*',-200);
		assertEquals(20000,result);
	}
	@Test
	void multest5() {
		double result=pgm.sub(-100,'*',-200);
		assertEquals(-20000,result);
	}
}
