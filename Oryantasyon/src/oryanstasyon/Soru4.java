package oryanstasyon;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {

		//basit atm programı
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İşlem Seçiniz");
		System.out.println("1-Bakiye Sorgulama");
		System.out.println("2-Para yatırma");
		System.out.println("3-Para çekme");
		System.out.println("Çıkış İçin '0' Tuşuna Basınız");
		
		while(true) {
		
		int işlem = scanner.nextInt();
		int bakiye = 1000;
		if (işlem==0) {
			System.out.println("Programdan Çıkılıyor...");
			break;
			}
		else if (işlem==1) {
		System.out.println("Bakiyeniz="+bakiye);
		}
		
		else if (işlem ==2) {
			System.out.println("Yatırmak istediğiniz tutaru giriniz");
			int tutar = scanner.nextInt();
			bakiye=bakiye+tutar;
			System.out.println("Yeni Bakiye="+ bakiye);
		}
		else if (işlem ==3) {
			System.out.println("Çekmek istediğiniz tutarı giriniz");
			int tutar= scanner.nextInt();
			scanner.nextLine();
			
			if (bakiye-tutar<0) {
				System.out.println("Yeterli Bakiye yok"+ bakiye);
			}
				else { 
					bakiye=bakiye-tutar ;
				System.out.println("Yeni bakiye = "+bakiye);
			}
			
		}
			
				
			
			}
		
		
		
		
	}

}
