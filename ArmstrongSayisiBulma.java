import java.util.Scanner;

public class ArmstrongSayisiBulma {

    public static void main(String[] args) {
        // 1352 = 1^4 + 3^4 + 5^4 + 2^4 == 1352 mi

        int num;
        int basamak = 0;
        int result = 0;
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Denemek istediğiniz sayıyı giriniz: ");
        num = input.nextInt();
        int temp = num;

        while(temp != 0){
            temp /= 10;
            basamak++;

        }
        int temp2 = num;
        while(temp2 != 0) {

            x = temp2 % 10;
            result += (int) Math.pow(x, basamak);
            temp2 /= 10;

        }

        if (result == num) {
            System.out.print(num);
            System.out.print(" bir Armstrong sayısıdır.");
        }else {
            System.out.print(num);
            System.out.print(" bir Armstrong sayısı değildir.");
        }


    }
}
