package oryanstasyon;

import java.util.Scanner;

public class Soru5 {
	
	//Harfli Not Hesaplama

	public static void main(String[] args) {


      Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vize-1 Notunuzu Giriniz");
		int a = scanner.nextInt();
		System.out.println("Vize-2 Notunuzu Giriniz");
		int b = scanner.nextInt();
		System.out.println("Final Notunuzu Giriniz");
		int c = scanner.nextInt();
		double ort = (a*0.3)+(b*0.3)+(c*0.4);
		
		if (ort>=90) {
			System.out.println("AA");
		}
			else if (ort >=85) {
				System.out.println("BA");
			}
			
			
			else if (ort >=80) {
				System.out.println("BB");
			}
			else if (ort >=75) {
				System.out.println("CB");
			}
			else if (ort >=70) {
				System.out.println("CC");
			}
			else if (ort >=65) {
				System.out.println("DC");
			}
			else if (ort >=60) {
				System.out.println("DD");
			}
			else if (ort >=55) {
				System.out.println("FD");
			}else if (ort >=50) {
				System.out.println("FF");
			}
			else {
				System.out.println("Geçersiz İşlem");
			}
		
		
		}
	 			
	}


		
		
	
