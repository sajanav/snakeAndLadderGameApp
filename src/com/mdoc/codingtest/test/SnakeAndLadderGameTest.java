package com.mdoc.codingtest.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.mdoc.codingtest.businesslogicImpl.SnakeAndLadderServiceImpl;

public class SnakeAndLadderGameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("You are at Position 1 with Euro 500:Please enter the die roll as an integer:");
	    int dierollNumber =sc.nextInt();
		if(dierollNumber <=0 ||dierollNumber >6 ) {
			System.out.println("Please enter an integer greater than 0 and less than 6");
		}
	
		int previousPosition = 1;
		int previouscredit =500;
		SnakeAndLadderServiceImpl impl = new SnakeAndLadderServiceImpl();
		Map resultMap =impl.processGame(dierollNumber,previousPosition,previouscredit);
		System.out.println("Current credit is  ");
		
	}
}
