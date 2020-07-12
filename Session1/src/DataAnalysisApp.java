/*
 
 What is a PL ?
	is a language with which we solve a problem using computer as machine
	driver   -> who drives
	computer -> who computes

	For making analysis on the data humans may face 2 challenges
	1. TIME
	2. ACCURACY

Why we need it ?
	To solve the Real World Problems

Launching of a Smartphone !!
Samsung would like to sell a flag ship phone on eCommerce Platforms

Mobile X
Amazon		| 15,575
Flipkart	| 15,423

Day 		| Amazon	Flipkart
1  			| 120		150
2  			| 190		250
3  			| 320		450
4  			| 170		80
5  			| 210		55

Samsung Data Analysis:
1. How many Mobile Devices were sold on each platform
2. How many customers attempted for the purchase and failed to buy
3. How many customers switch from 1 platform to other to buy the phone
4. How much profit was made by samsung and eCommerce Platforms from the Sale
5. Which part of the country people purchased more phones


Cab Booking | OLA and Uber

MODEL | Data Structures (best possible way to store data)
data associated with the problem:
	source location
	destinition location
	type of cab

CONTROLLER | Algorithms (best possible way to logically process the data)
processing of data
	computing the shortest distance
	computing the driver who is nearest
	associating nearest driver to the customer
	handling cancellations

VIEW
interface
	visual interfaces where users can either input the data or our program displays the data	

MVC (MODEL VIEW CONTROLLER) Architecture
	to solve the real world problems using PL

For our Program: Java is the BEST FIT	



Oranges -> Source

Juicer	-> Processing Unit

Liquid Juice

Packed

\_/ -> Final Result, Glass containing Liquid Juice


MyApp.cpp -> Source Code in CPP

Compiler  -> Processing Unit

MyApp.obj -> Intermediate Code

Pack

MyApp.exe -> Executable Code -> Runs only on Windows
MyApp.sh
MyApp.dmg

MyApp.java

Compiler

MyApp.class	-> Highly Optomized for Execution

No Need to Pack It 


JDK Setup
	Java Development Kit
	It will have below things:
	1. Built In Code
		System.out.println("Hello");
	2. Compiler
		convert our java programs to the bytecodes
	.
	..
	....

After JDK Installation, Set up the Path in Windows
	Path must be copied and placed in Environment Variables
	Program Files > JDK > bin	

Eclipse : Integrated Development Environment (IDE)	
	Its a software in which we will create manage and run our java programs
	This will automatially detect JDK installed and use it for programs created by us


 
 */

// Single Line Comment -> Considered not part of program
// class means java program
// name is DataAnalysisApp
// public means visible to other programs in the same project Session1

public class DataAnalysisApp {

	// Inside the class Block, we have main and we call it either method or function
	// void means acknowledge nothing : See in Future
	// static -> property of class i.e. main belongs to DataAnalysisApp : See in Future
	// String[] args -> Command Line Arguments : See in Future
	
	public static void main(String[] args) {
		
		// What we wish to Code, goes in the main block here :)
		// Whatever we write in main is executed in a sequence i.e. line by line
		
		// Printing Statement in Java: To show some information by the Program
		System.out.println("Search the Candle, rather than cursing the Darkness");
		System.out.println("Be Exceptional !!");

	}

}
