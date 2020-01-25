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
        System.out.println("Hello World");
    }
}
