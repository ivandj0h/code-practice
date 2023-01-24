package com.ivandjoh.codepractice;

import com.ivandjoh.codepractice.Array.FindTheLargestThreeElements;
import com.ivandjoh.codepractice.Array.FindTheMissingNumber;
import com.ivandjoh.codepractice.Array.SortAnArrayOf0s1s2s;
import com.ivandjoh.codepractice.Array.SubarrayWithGivenSum;
import com.ivandjoh.codepractice.Number.FancyNumber;
import com.ivandjoh.codepractice.Number.ValidMobileNumber;
import com.ivandjoh.codepractice.Search.BinarySearch;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		// FancyNumber
		FancyNumber.executeFancyNumber();

		// ValidMobileNumber
		ValidMobileNumber.executeValidMobileNumber();

		// FindTheLargestThreeElements
		FindTheLargestThreeElements.executeFindTheLargestThreeElements();

		// FindMissingNumber
		FindTheMissingNumber.executeFindTheMissingNumber();

		// FindSubarrayWithGivenSum
		SubarrayWithGivenSum.executeSubarrayWithGivenSum();

		// Sort An Array Of 0s 1s 2s
		SortAnArrayOf0s1s2s.executeSortAnArrayOf0s1s2s();

		// Binary Search
		BinarySearch.executeBinarySearch();
	}
}
