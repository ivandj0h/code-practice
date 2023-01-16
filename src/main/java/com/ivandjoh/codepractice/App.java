package com.ivandjoh.codepractice;

import com.ivandjoh.codepractice.Array.FindTheLargestThreeElements;
import com.ivandjoh.codepractice.Number.FancyNumber;
import com.ivandjoh.codepractice.Number.ValidMobileNumber;
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
	}

}
