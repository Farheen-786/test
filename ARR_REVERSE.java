public class ARR_REVERSE {
    public static void main(String[] args) {
        int[] arr = {3,4,4,4,4,3,5,1};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("Reversed array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"");
        }
  }
}


