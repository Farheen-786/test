import java.util.Scanner;

public class ARMSTRONG {
    public static void main(String argv[]){
        int n,rem,arm=0,c;
        System.out.print("enter the no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;

        }
        if(c==arm)
        System.out.print("armstrong");
        else
        System.out.print("not armstrong");

    }
    
}
