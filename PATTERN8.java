public class PATTERN8 {
    public static void main(String argv[]){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--)
                System.out.print("*");
                System.out.println();
            }
        }
    }
    
