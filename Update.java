import java.lang.*;
import java.util.*;

public class Update {
    public static void main(String argvs[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        int a,b;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value at position "+(i+1));
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the index value you want to update");
        a=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(i==a){
                System.out.println("Enter the value that you want to enter at this index ");
                b=sc.nextInt();
                arr[i]=b;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



            
        }
    }
    

