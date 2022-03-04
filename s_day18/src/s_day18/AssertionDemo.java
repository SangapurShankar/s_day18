package s_day18;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssertionDemo {
	@Test
	public void simple(){
		int A = 1;
		int B = 1;
		assertEquals(A, B);
	}
		@Test
	public void simple1(){
		int A = 1;
		int B = 2;
		assertEquals(A, B);
	}
		@Test
	public void simple3(){
		int A = 1;
		int B = 3;
		assertEquals(A, B);
	}

}
