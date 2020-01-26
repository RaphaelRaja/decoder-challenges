import java.util.Scanner;

public class swapArrayPosition {

    public static void swapArray(int arr[]){
        int len = arr.length;
        int hlen = len / 2;

        for (int i=0; i<hlen; i++){
            arr[i] = arr[i] + arr[len-i-1];
            arr[len-i-1] = arr[i] - arr[len-i-1];
            arr[i] = arr[i] - arr[len-i-1];
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrLen = in.nextInt();
        int arr[] = new int[arrLen];

        for(int i=0; i<arrLen; i++){
            arr[i] = in.nextInt();
        }

        swapArray(arr);

        for (int i=0; i<arrLen; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
