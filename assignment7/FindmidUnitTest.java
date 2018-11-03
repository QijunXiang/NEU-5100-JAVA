package psr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindmidUnitTest {

	Findmid fm = new Findmid();
	@Test
	void test() {
		int[] A = {1,2};
		int[] B = {3,4};
		double test_rs = fm.findMedianSortedArrays(A, B);
		assertEquals(test_rs, 2.5);
	}

}
