import java.util.Scanner;

public class EnKücükSayiyiBul {

    public static void main(String[] args) {

        int n,num,min = 0,max = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            num = input.nextInt();

            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }


        }

        System.out.println("En kücük: "+ min);
        System.out.println("En büyük: "+ max);

    }
}
