import java.util.Scanner;

public class RecursivePatternProgram {

    static void f(int n, int m) {


        if(n > 0){
        System.out.print(n + " ");
        f(n - 5 ,m);


        }else{

            topla(n,m);

        }


    }

    static void topla(int n,int m){


        if(n != m){
            System.out.print(n + " ");
            topla(n + 5, m);

        }else{
            System.out.print(n);
        }

    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f(n,n);


    }
}
