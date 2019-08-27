package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	static String multiply(int num1, int num2) {
		int answer = num1 * num2;
		return "" + num1 + " x " + num2 + " = " + answer;
	}
	
	static boolean isPrime(int num) {
		for(int i = 2; i <= (num /2); i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	static boolean isSquare(int num) {
		double sqrt = Math.sqrt(num);
		if(sqrt % 1 == 0)
			return true;
		return false;
	}
	
	static boolean isCube(int num) {
		double sqrt = Math.cbrt(num);
		if(sqrt % 1 == 0)
			return true;
		return false;
	}
	
	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }

	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }

	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

	@Test
	  public void CubeTest() {
	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }



}
