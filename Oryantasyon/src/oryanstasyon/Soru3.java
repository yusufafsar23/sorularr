package oryanstasyon;

import java.util.Scanner;

public class Soru3 {
	
	//Faiz Hesaplama Sistemi

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("hoşgeldiniz faiz oranı =%6");
		
		double anapara,vade;
		System.out.println("ne kadar yatırcaksınız");
		 anapara=scanner.nextDouble();
		System.out.println("kaç sene boyunca yatırcaksınız");
		vade = scanner.nextDouble();
		
		
		double toplampara= anapara ;
		
		double faizoranı=0.06;
		
		
		for(int i=1; i<=vade;i++) {
		
		 toplampara=(faizoranı*anapara)+toplampara;
		 
		 System.out.println(i+"yılın sonunda para="+(int)toplampara+"TL");
		 
		 
		}		
	}
	}

	
