package com.ivandjoh.codepractice;

import com.ivandjoh.codepractice.Array.*;
import com.ivandjoh.codepractice.Number.FancyNumber;
import com.ivandjoh.codepractice.Number.ValidMobileNumber;
import com.ivandjoh.codepractice.Search.BinarySearch;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		// Fancy Number
		FancyNumber.executeFancyNumber();

		// Valid Mobile Number
		ValidMobileNumber.executeValidMobileNumber();

		// Find The Largest Three Elements
		FindTheLargestThreeElements.executeFindTheLargestThreeElements();

		// Find Missing Number
		FindTheMissingNumber.executeFindTheMissingNumber();

		// Find Sub-Array With Given Sum
		SubarrayWithGivenSum.executeSubarrayWithGivenSum();

		// Sort An Array Of 0s 1s 2s
		SortAnArrayOf0s1s2s.executeSortAnArrayOf0s1s2s();

		// Reverse Array In Groups
		ReverseArrayInGroups.executeReverseArrayInGroups();

		// Binary Search
		BinarySearch.executeBinarySearch();
	}
}
