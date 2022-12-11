package oryanstasyon;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {

//aracın km de kaç krş yaktığını ve KM ye göre ücret hesaplama
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hesaplama Sistemine Hoşgeldiniz");
		System.out.println("Güncel benzin lt fiyatını giriniz");
		double benzinfiyat=scanner.nextDouble();
		System.out.println("Aracınız 100km de kaç LT benzin tüketiyor (Örn:8.5 lt)");
		double lt=scanner.nextDouble();
		System.out.println("Kaç km yol gideceksiniz");
		int yol=scanner.nextInt();
		
		
		double kmbasıyakılantutar= (lt/100)*benzinfiyat;
		
		double toplamtutar = (kmbasıyakılantutar*yol);
		System.out.println("Toplam yakılan benzin tutarı= "+toplamtutar+" TL");
		
		
		
		
		
		
		
		
		
	}

}
