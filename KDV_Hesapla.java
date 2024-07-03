package Giris;
import java.util.Scanner;

public class KDV_Hesapla {
	
	public static void main(String[] args) {
		
		try (Scanner inp = new Scanner(System.in)) {
			double para;
			System.out.println("Para miktarı:");
			para = inp.nextDouble();
			
			double kdv_rate = 0.18;
			double kdvli_fiyat = para + (para*kdv_rate);
			double kdv_tutari = para * kdv_rate;
			
			
			
			System.out.println("KDV'li Fiyat:"+  String.format("%.2f", kdvli_fiyat));
			System.out.print("KDV Tutarı:"+ String.format("%.2f", kdv_tutari));
		}
		
		
		
		
	}

}
