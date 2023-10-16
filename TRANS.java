import java.util.Scanner;

public class TRANS {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        System.out.println("enter the value at position");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            
            for (int j = 0; j < a[0].length; j++) {
                int temp=0;
                if(i<j){
                    temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
        System.out.println("transpose matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close(); 
    }
}
