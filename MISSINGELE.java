import java.util.*;
public class MISSINGELE{
    public static void main(String args[]) {
        System.out.println("Enter the size of array ");
        int sum1 = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <=n; i++) {
            sum1 = sum1 + i;
        }
        int arr[] = new int[n];
        System.out.println(sum1);

        System.out.println("Enter the Element of array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.println("the missing number is--> "+(sum1-sum));
        sc.close();}
    }

