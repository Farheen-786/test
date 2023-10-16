import java.util.Scanner;

public class PAIRSUM {
    public static void main(String argvs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target value: ");
        int target = sc.nextInt();
        //int[] arr = new int[5];
        int arr[]={1,2,3,1,3,5,2,5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (target == (arr[i] + arr[j])) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
        sc.close();
    }
}
