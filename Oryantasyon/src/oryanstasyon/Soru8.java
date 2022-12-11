package oryanstasyon;

import java.util.Scanner;

public class Soru8 {

//  Cinsiyete göre bki hesaplama  
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Kilo giriniz (kg)");
		double kilo =scanner.nextDouble();
		System.out.println("Boy giriniz(cm)");
		double boy=scanner.nextDouble();
		System.out.println("Cinsiyet girniz 1-erkek , 2-kadın");
		int cinsiyet=scanner.nextInt();
		
		
		double bki=kilo/(boy*boy);
		
	
		if(bki>=25 && cinsiyet==1) {
			System.out.println("BKİ= "+bki+"- Kilolu");
		}
		else if (bki<25 && cinsiyet==1) {
			System.out.println("BKİ= "+bki +" Normal");
		
		}
		
		else if(bki>=23 && cinsiyet==2) {
			System.out.println("BKİ= "+bki+"- Kilolu");
		}
		else {
			System.out.println("BKİ= "+bki +" Normal");
		}
		

	}

}
