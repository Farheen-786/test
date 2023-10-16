import java.util.*;
import java.lang.*;
public class MAX2D {
    public static void main(String[] argvs[]){
            Scanner sc=new Scanner(System.in);
            int a[][]=new int[3][3];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                    System.out.println("enter the value at position");
                    a[i][j]=sc.nextInt();
                }
            } 
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    System.out.print(a[i][j]+" ");
                    if(max<a[i][j]){
                        max=a[i][j];
                    }
                }
                System.out.println("max no"+max);
            }
            }
        }
    

    



