package oryanstasyon;

import java.util.Scanner;

public class Soru7 {

	public static void main(String[] args) {
		
		//maks sayı bulma

		Scanner scanner = new Scanner(System.in);
		 
			System.out.println("1. Sayıyı Giriniz");
			int a = scanner.nextInt() ;
			System.out.println("2. Sayıyı Giriniz");
			int b = scanner.nextInt();
			System.out.println("3. Sayıyı Giriniz");
			int c = scanner.nextInt();
			
			int maks ; 
			
			if (a>=b && a>=c ) {
				maks = a;
			}
				else if (b>=a  && b>=c) {
					maks = b;
				}
			    else {
			    	maks = c ; 
			    	}
			    
			
		     System.out.println("Maksimum Sayı ="+maks) ;
		}
		
	}

