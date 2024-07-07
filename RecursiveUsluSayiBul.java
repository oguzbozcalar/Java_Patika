import java.util.Scanner;

public class RecursiveUsluSayiBul {

    static int power(int x, int y){
        if(y == 0){
            return 1;
        }

        return power(x,y-1) * x;
    }






    public static void main(String[] args) {

        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değerini giriniz:");
        x = input.nextInt();
        System.out.println("Üs değerini giriniz:");
        y = input.nextInt();

        int result = power(x,y);
        System.out.println("Sonuç:" + result);









    }
}
