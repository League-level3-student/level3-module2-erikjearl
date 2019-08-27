package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String[] words = {"a","b","c","d"};
	String[] words2 = {"cat", "dog", "bird"};
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(0, _00_LinearSearch.linearSearch(words, "a"));
		assertEquals(1, _00_LinearSearch.linearSearch(words2, "dog"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words2, "orange"));
	}
	
	int[] nums = {1,2,3,4,5,6,7};
	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(1, _01_BinarySearch.binarySearch(nums, 1, 6, 2));
		assertEquals(6, _01_BinarySearch.binarySearch(nums, 1, 6, 7));
		assertEquals(-1, _01_BinarySearch.binarySearch(nums, 1, 6, 8));
	}
	
	int[] nums2 = {2, 4, 6, 8, 10, 12};
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(nums, 1));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(nums, 8));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(nums2, 10));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(nums, 1));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(nums, 8));
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(nums2, 10));
	}
}
