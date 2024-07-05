import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        int mesafe;
        int age;
        int yolculukTipi;
        double cost = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyinizi giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipi giriniz (1 -> Tek Yön , 2 -> Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();

        if (yolculukTipi == 1){

            if(age < 12){
                cost = mesafe * 0.10;
                cost -= cost * 0.5;

            }else if(age < 24){
                cost = mesafe * 0.10;
                cost -= cost * 0.10;

            }else if(age > 65){
                cost = mesafe * 0.10;
                cost -= cost * 0.3;
            }else{
                cost = mesafe * 0.10;
            }


        }else if (yolculukTipi == 2){

            if(age < 12){
                cost = mesafe * 0.10;
                cost -= cost * 0.5;
                cost -= cost * 0.2;
                cost *= 2;

            }else if(age < 24){
                cost = mesafe * 0.10;
                cost -= cost * 0.10;
                cost -= cost * 0.2;
                cost *= 2;

            }else if(age > 65){
                cost = mesafe * 0.10;
                cost -= cost * 0.3;
                cost -= cost * 0.2;
                cost *= 2;
            }else{
                cost = mesafe * 0.10;
                cost -= cost * 0.2;
                cost *= 2;

            }

        }else{
            System.out.println("Hatalı veri girdiniz !");
        }


        System.out.println("Tutar: " + cost + " TL");


    }
}
