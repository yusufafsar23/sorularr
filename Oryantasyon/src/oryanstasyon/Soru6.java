package oryanstasyon;

import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
		
		//basit hesap makinesi
		
		Scanner scanner=new Scanner(System.in) ;
			
		System.out.println("İşlem Seçiniz");
		System.out.println("1-Toplama");	
		System.out.println("2-Çıkarma");	
		System.out.println("3-Çarpma");	
		System.out.println("4-Bölme");	
			
		int islem=scanner.nextInt();
		
		if(islem==1) {
			System.out.println("İlk sayıyı girin");
			int a =scanner.nextInt();
			System.out.println("İkinci sayıyı giriniz ");
			int b=scanner.nextInt();
			
			double toplam=a+b;
			
			System.out.println("Toplam="+toplam);
			
		}
		else if (islem==2) {
			System.out.println("İlk sayıyı girin");
			int a =scanner.nextInt();
			System.out.println("İkinci sayıyı giriniz ");
			int b=scanner.nextInt();
			
			double toplam=a-b;
			
			System.out.println("Sonuç="+toplam);
			
		}
		else if (islem==3) {
			System.out.println("İlk sayıyı girin");
			int a =scanner.nextInt();
			System.out.println("İkinci sayıyı giriniz ");
			int b=scanner.nextInt();
			
			double toplam=a*b;
			
			System.out.println("Sonuç="+toplam);
		}
		
			else if (islem==4) {
				System.out.println("İlk sayıyı girin");
				int a =scanner.nextInt();
				System.out.println("İkinci sayıyı giriniz ");
				int b=scanner.nextInt();
				
				double toplam=a/b;
				
				System.out.println("Sonuç="+toplam);
		
			}
			else {
				System.out.println("Geçersiz işlem");
			}
	
		
		
		
		
		}
		


		
		
	}


