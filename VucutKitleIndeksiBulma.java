package Giris;
import java.util.Scanner;

public class VucutKitleIndeksiBulma {

	public static void main(String[] args) {
		
		int kilo;
		double boy;
		double vki;
		
		System.out.print("Kilonuzu giriniz:");
		Scanner inp = new Scanner(System.in);
		kilo = inp.nextInt();
		
		System.out.print("Boyunuzu giriniz(m):");
		boy = inp.nextDouble();
		
		vki = kilo / Math.pow(boy, 2);
		System.out.println("Vücut Kitle İndeksi: "+ vki);
		
		
		
	}
}
