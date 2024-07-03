package Giris;
import java.util.Scanner;

public class ManavKasaProgrami {
	public static void main(String[] args) {
		
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz =  0.95;
		double patlican = 5.00;
		Scanner inp = new Scanner(System.in);
		double sum = 0;
		
		
		
		System.out.println("Armut kaç kilo?");
		double armutK = inp.nextInt();
		sum += armutK*armut;
		
		System.out.println("Elma kaç kilo?");
		double elmaK = inp.nextInt();
		sum += elmaK*elma;
		System.out.println("Domates kaç kilo?");
		double domK = inp.nextInt();
		sum += domK*domates;
		System.out.println("Muz kaç kilo?");
		double muzK = inp.nextInt();
		sum += muzK*muz;
		System.out.println("Patlıcan kaç kilo?");
		double patK = inp.nextInt();
		sum += patK*patlican;
		
		
		System.out.println("Tutar: "+ sum +" TL");
		
		
		
	}

}
