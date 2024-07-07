import java.util.Scanner;

public class AsalSayiMi {

    static boolean isPrime(int n, int m){

        if (n < 2)
            return false;
        if (m == 1)
            return true;
        if (n % m == 0)
            return false;

        return isPrime(n, m - 1);
    }




    public static void main(String[] args) {


        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        boolean result = isPrime(n, n-1);

        if (result)
            System.out.println("Asal Sayı");
        else
            System.out.println("Asal Sayı Değil");
    }
}
