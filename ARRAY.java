// import java.util.Scanner;
// public class ARRAY {
//     public static void main(String argvs[]){
//         Scanner sc=new Scanner(System.in);
//        /*/ int arr[]={1,2,3,4,5};
//         int[]arr2={1,2,3};*/
//         int dy[]=new int[6];
//         for(int i=0;i<dy.length;i++){
//             System.out.print("enter the value");
//             dy[i]=sc.nextInt();
//         }
//         for(int i=0;i<dy.length;i++){
//             System.out.print(dy[i]+" ");

//     }
// }
// }
import java.util.*;
public class ARRAY{   //linear search 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int arr[]=new int[10];
         int num=5;
         System.out.println("enter the target");
         int target=sc.nextInt();
         for(int i=0;i<num;i++){
             System.out.println("enter the array value "+i+":");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            if(target==arr[i]){
                System.out.println("found at"+i);
                break;
            }
            else{
                System.out.println("not found");
                
            }
        }

    }
}
