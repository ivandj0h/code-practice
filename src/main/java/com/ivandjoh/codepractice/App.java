package com.ivandjoh.codepractice;

import com.ivandjoh.codepractice.fancyNumber.FancyNumber;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		// FancyNumber
		FancyNumber.executeFancyNumber();
	}

}
