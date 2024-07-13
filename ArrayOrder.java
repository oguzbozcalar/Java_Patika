import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını giriniz :");
        System.out.print("1. elemanı : ");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
            System.out.print(i+2 +". elemanı : ");
        }
        sc.close();


        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }

        }

        System.out.print("Sıralama : " +Arrays.toString(arr));

    }
}
