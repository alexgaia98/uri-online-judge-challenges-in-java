package br.com.alexgaia98.uriproblems.matematic.functions;

import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x, y, n; 

		int fRafael;
		int fBeto;
		int fCarlos;
        
		n = scanner.nextInt();

		for(int i=0;i<n;i++){
		    x = scanner.nextInt();
		    y = scanner.nextInt();

		    fRafael = ((3*x)*(3*x))+(y*y);
		    fBeto = 2*(x*x)+((5*y)*(5*y));
		    fCarlos = (-100*x)+(y*y*y);

		    if ((fRafael>fBeto)&&(fRafael>fCarlos)){               
			    System.out.println("Rafael ganhou");               
		    } else if (fBeto>fCarlos){
			System.out.println("Beto ganhou");
		    } else {
			System.out.println("Carlos ganhou");
		    }
		}
		
	}
}
