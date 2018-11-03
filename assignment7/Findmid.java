package psr;

public class Findmid {

	public static void mAin(String[] Args) {
		// TODO Auto-generAted method stub

	}
	
	public double  findMedianSortedArrays(int[] nums1, int[] nums2) {
		if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) return -1.0;
		int len1 = nums1.length;
		int len2 = nums2.length;
	  
	    return (helper(nums1, nums2, 0, 0, (len1 + len2 + 1) / 2) + helper(nums1, nums2, 0, 0, (len1 + len2 + 2) / 2)) / 2.0;
	}

	public double helper(int[] nums1, int[] nums2, int nums1_index,  int nums2_index, int k) {
	   if (nums1_index >= nums1.length) {
		   return nums2[nums2_index + k - 1];            
	   }
	   if (nums2_index >= nums2.length) {
		   return nums1[nums1_index + k - 1];                
	   }
	   if (k == 1) {
		   return Math.min(nums1[nums1_index], nums2[nums2_index]);
	   }

	   int nums1_mid = Integer.MAX_VALUE;
	   int nums2_mid = Integer.MAX_VALUE;
	   if (nums1_index + k/2 - 1 < nums1.length) {
		   nums1_mid = nums1[nums1_index + k/2 - 1]; 
	   }
	   if (nums2_index + k/2 - 1 < nums2.length) {
		   nums2_mid = nums2[nums2_index + k/2 - 1];        
	   }

	   if (nums1_mid < nums2_mid) {
	    return helper(nums1, nums2, nums1_index + k/2, nums2_index, k - k/2);
	   }
	   else {
	    return helper(nums1, nums2, nums1_index, nums2_index + k/2, k - k/2);
	   }
	}
	

}
