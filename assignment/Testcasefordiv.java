package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Testcasefordiv {
	calculatorPgm pgm = new calculatorPgm();
	@Test
	void divtest() {
		double result=pgm.mul(200,'/',100);
		assertEquals(2.0,result);
	}
	@Test
	void divtest1() {
		double result=pgm.sub(200,'/',100);
		assertEquals(0.5,result);
	}
	
}
