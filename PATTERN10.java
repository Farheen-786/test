public class PATTERN10 {
    public static void main(String argv[]){
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||i==5||j==0||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
