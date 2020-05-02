package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Testcaseforsub {
	calculatorPgm pgm = new calculatorPgm();
	@Test
	void subtest() {
		double result=pgm.sub(100,'-',200);
		assertEquals(-100,result);
	}
	@Test
	void subtest1() {
		double result=pgm.sub(100,'-',200);
		assertEquals(-300,result);
	}
	@Test
	void subtest2() {
		double result=pgm.sub(400,'-',200);
		assertEquals(200,result);
	}
	@Test
	void addtest3() {
		double result=pgm.add(0,'-',0);
		assertEquals(0,result);
	}
	@Test
	void addtest6() {
		double result=pgm.add(-100,'-',-200);
		assertEquals(100,result);
	}
	@Test
	void addtest4() {
		double result=pgm.add(-100,'-',200);
		assertEquals(300,result);
	}
	@Test
	void addtest5() {
		double result=pgm.add(-100,'+',-200);
		assertEquals(300,result);
	}
}
