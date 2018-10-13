import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Assignment4UnitTest {
	Assignment4 assignment4 = new Assignment4();
	@Test
	void testFirstUniqChar() {
		int test_result = assignment4.firstUniqChar(null);
		assertEquals(test_result, -1);
		
		test_result = assignment4.firstUniqChar("");
		assertEquals(test_result, -1);
		
		test_result = assignment4.firstUniqChar("bbacdde");
		assertEquals(test_result, 2);
		
		test_result = assignment4.firstUniqChar("aabbccdd");
		assertEquals(test_result, -1);
	}

	@Test
	void testAddDigits() {
		int test_result = assignment4.addDigits(0);
		assertEquals(test_result, 0);
		
		test_result = assignment4.addDigits(38);
		assertEquals(test_result, 2);
	}

	@Test
	void testMoveZeroes() {
		int[] test = {};
		assignment4.moveZeroes(test);
		assertEquals(test.length, 0);
		
		int[] test_2 = {0,1,0,3,12};
		assignment4.moveZeroes(test_2);
		assertEquals(test_2[0], 1);
		assertEquals(test_2[1], 3);
		assertEquals(test_2[2], 12);
		assertEquals(test_2[3], 0);
		assertEquals(test_2[4], 0);
		
		
	}

	@Test
	void testLongestPalindrome() {
		String result = assignment4.longestPalindrome("");
		assertEquals(result, "");
		result = assignment4.longestPalindrome(null);
		assertEquals(result, null);
		result = assignment4.longestPalindrome("aba");
		assertEquals(result, "aba");
		result = assignment4.longestPalindrome("babad");
		assertEquals(result.length(), 3);
	}

	@Test
	void testRotate() {
		assertEquals(assignment4.rotate(null), null);
		assertEquals(assignment4.rotate(new int[0][0]).length, 0);
		int[][] matrix = new int[3][3];
		int num = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = num++;
			}
		}
		matrix = assignment4.rotate(matrix);
		assertEquals(matrix[0][0], 6);
		assertEquals(matrix[0][1], 3);
		assertEquals(matrix[0][2], 0);
		assertEquals(matrix[1][0], 7);
		assertEquals(matrix[1][1], 4);
		assertEquals(matrix[1][2], 1);
		assertEquals(matrix[2][0], 8);
		assertEquals(matrix[2][1], 5);
		assertEquals(matrix[2][2], 2);
	}

}
