import java.util.HashMap;
import java.util.Map;

public class Assignment4 {
	
	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public int firstUniqChar(String s) {
    		//TODO
    	if(s == null ||s.length() == 0) return -1;
    	Map<Character, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i < s.length(); i++) {
    		map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
    	}
    	for(int i = 0 ; i < s.length(); i++) {
    		if(map.get(s.charAt(i)) == 1) {
    			return i;
    		}
    	}
    	return -1;
     }
    
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
    		//TODO
    	if(n >= 0 && n <= 9) return n;
    	
    	while(n >= 10) {
    		int sum = 0;
    		while(n != 0) {
    			sum += n%10;
    			n = n/10;
    		}
    		n = sum;
    	}
    	return n;
    	
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
    		//TODO
    	int i = 0;
        for(int n : nums) {
            if(n != 0) {
                nums[i++] = n;
            }
        }
        while(i < nums.length) {
            nums[i++] = 0;
        }
     }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public String longestPalindrome(String s) {
		//TODO
		if(s == null || s.length() == 0) return s;
		int len = s.length();
		int max = 0;
		int max_l = 0;
		int max_r = 0;
		int[][] dp = new int[len][len];
		
		for(int i = 0; i < len; i++) {
			dp[i][i] = 1;
		}
		
		for(int i = len-1; i >= 0; i--) {
			for(int j = i; j <= len-1; j++) {
				if(j == i) dp[i][j] = 1;
				else if(j == i+1) {
					if(s.charAt(i) == s.charAt(j)) {
						dp[i][j] = 2;
					} else {
						dp[i][j] = 0;
					}
				} else {
					if(s.charAt(i) == s.charAt(j)) {
						dp[i][j] = dp[i+1][j-1]+2;
					}
				}
				if(dp[i][j] > max) {
					max = dp[i][j];
					max_l = i;
					max_r = j;
				}
			}
		}
		return s.substring(max_l, max_r+1);
	
    }
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
    		//TODO
    	if(matrix == null || matrix.length == 0) 
    		return matrix;
        int n = matrix.length;
        
        for(int i = 0; i <= n/2-1; i++) {
            for(int j = 0; j <= n-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-i][j];
                matrix[matrix.length-1-i][j] = temp;
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    	
   }
    
}