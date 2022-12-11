package oryanstasyon;

import java.util.Scanner;

public class Soru1 {

	//Amstrong sayı bulma
	
		public static void main (String[] args ) {
			
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("sayı gir");
			int sayi = scanner.nextInt();
			System.out.println("basamak değeri giriniz");
			int basamaksayısı=scanner.nextInt();
			
			int geçicisayi = sayi;
			int toplam =0;
			
			do {
				int basamakdeğeri = geçicisayi%10; 
				 geçicisayi=geçicisayi/10;
				toplam +=   Math.pow(basamakdeğeri,basamaksayısı);
				
				
				
			}while(geçicisayi>0);
			
			if (sayi == toplam) {
				
				System.out.println("bu sayı amstrog sayısıdır");
			}
			else {
				System.out.println("bu sayı amstrog sayısı değildir");
			}
			
			
		}
		

}
