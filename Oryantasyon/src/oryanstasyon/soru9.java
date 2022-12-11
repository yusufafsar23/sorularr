package oryanstasyon;

import java.util.Scanner;

public class soru9 {
	public static void main(String[]args) {
	
		//faktöriyel hesaplama
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz");
		int sayi=scanner.nextInt();
		
		int toplam=1;
		
		for(int i =1;i<=sayi;i++) {
			
			toplam*=i;
			
			System.out.println(toplam);
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
