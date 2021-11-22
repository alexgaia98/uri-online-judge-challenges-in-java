package br.com.alexgaia98.uriproblems.verybasic;

import java.util.Scanner;

public class VeryBasic {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "X = ";
        int A, B, X;
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        
        X = A+B;
        
        System.out.println(message+X);
		

	}

}
