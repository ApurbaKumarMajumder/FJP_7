import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        // array input
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // displayArr(arr, 0);
        displayArrReverse(arr, 0);
    }

    public static void displayArr(int arr[], int idx) {
        if(idx == arr.length) return;

        System.out.println(arr[idx]);
        displayArr(arr, idx+1);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == arr.length) return;

        displayArrReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }
}
