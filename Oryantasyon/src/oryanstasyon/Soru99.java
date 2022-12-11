package oryanstasyon;

import java.util.Scanner;

public class Soru99 {
	public static void main (String[]args) {
	
		//Hipotenüs hesaplama
		
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Uzun Kenarı Giriniz (Örnek:5m) = ");
	double uzunk = scanner.nextDouble();
	
    System.out.print("Kısa Kenarı Giriniz =(Örnek :15m) = ");
    double kısak = scanner.nextDouble();
    
    double hip = Math.sqrt(kısak*kısak + uzunk*uzunk); //math.sqrt= karekök alır
    
    System.out.println("Hipotenüs ="+ hip);

}
}