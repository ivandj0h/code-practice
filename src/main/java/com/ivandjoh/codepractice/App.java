package com.ivandjoh.codepractice;

import com.ivandjoh.codepractice.Algos.FizzBuzz;
import com.ivandjoh.codepractice.Array.*;
import com.ivandjoh.codepractice.Concurrency.StructuredConcurrency;
import com.ivandjoh.codepractice.Number.FancyNumber;
import com.ivandjoh.codepractice.Number.ValidMobileNumber;
import com.ivandjoh.codepractice.RecordPatterns.NestedRecordPatterns;
import com.ivandjoh.codepractice.RecordPatterns.NormalRecordPatterns;
import com.ivandjoh.codepractice.Search.BinarySearch;
import com.ivandjoh.codepractice.String.CountOccurrenceOfEachCharacterInString;
import com.ivandjoh.codepractice.String.DuplicateElementFromString;
import com.ivandjoh.codepractice.Threads.MyRegularTask;
import com.ivandjoh.codepractice.collections.JavaGenerics;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class App {

	public static void main(String[] args) throws ExecutionException, InterruptedException {

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

		// FizzBuzz
		FizzBuzz.executeFizzBuzz();

		// Java Generics
		JavaGenerics.executeGeneric();

		// Java Threads
		MyRegularTask.executeRegularTask(args);

		// Triplet Sum Closest To Target
		int a[] = {10, 2, 30, 49, 8};
		int target = 50;
		TripletSumClosestToTarget.executeTripleSumClosestToTarget(a, target); // 48

		// Remove Duplicates From Sorted Array v1
		RemoveDuplicatesFromSortedArrayVersionOne.executeRemoveDuplicates();

		// Remove Duplicates From Sorted Array v2
		RemoveDuplicatesFromSortedArrayVersionTwo.executeRemoveDuplicates();

		// Record Patterns - Normal
		NormalRecordPatterns.executeNormalRecordPatterns(args);

		// Record Patterns - Nested
		NestedRecordPatterns.executeNestedRecordPatterns(args);

		// Structured Concurrency
		StructuredConcurrency.executeStructuredConcurrency();

		// Java Array List
		JavaArrayList.executeJavaArrayList();

		// Count Occurrence Of Each Character In String
		CountOccurrenceOfEachCharacterInString.executeCountOccurrenceOfEachCharacterInString();

		// Duplicate Element From String
		DuplicateElementFromString.executeDuplicateElementFromString();
	}
}
