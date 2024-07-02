package Giris;

import java.util.Scanner;

public class OrtalamaHesapla {
	
	public static void main(String[] args) {
		
		double muzik,mat,fizik,kimya,turkce,tarih;
		
		double ort;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Sırasıyla müzik,matematik,fizik,kimya,turkce,tarih sınav notlarını giriniz:");
			muzik = input.nextInt();
			mat = input.nextInt();
			fizik = input.nextInt();
			kimya = input.nextInt();
			turkce = input.nextInt();
			tarih = input.nextInt();
		}
		
		ort = (muzik + mat + fizik + kimya + turkce + tarih) / 6;
		
		System.out.println("Ortalama:"+ ort);
		
		String isGecti = (ort >= 60) ? "Geçti" : "Kaldı";
		System.out.println(isGecti);
		
	}

}
