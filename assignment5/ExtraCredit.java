package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Assignment5 {

	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matrix[i][j] = i+j;
			}
		}
		System.out.println(spiralOrder(matrix));
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> rs = new ArrayList<>();
		if(matrix == null || matrix.length == 0 ) return rs;
		
		for(int i = 0 ; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				rs.add(matrix[i][j]);
			}
		}
		return rs;
	}
}
