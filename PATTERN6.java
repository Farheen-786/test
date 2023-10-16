public class PATTERN6 {
    public static void main(String argv[]){
        int n=5;
        for(int i=n;i>=0;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
