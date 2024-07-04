
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int a;
        int b;
        char c;
        int result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz:");
        a = input.nextByte();
        System.out.print("İkinci sayıyı giriniz:");
        b = input.nextInt();

        System.out.println("İşlemi yazın:");
        c = input.next().charAt(0);


        switch (c) {

            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;

            default:
                System.out.println("Geçerli bir işlem giriniz.");
                break;



        }

        System.out.println("Sonuc:" + result);








    }


}
