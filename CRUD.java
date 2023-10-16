import java.util.Scanner;

public class CRUD {
    public static void main(String argvs[]){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println("enter the value");
            arr[i]=sc.nextInt();     
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
     }
}
