public class PATTERN12 {
    public static void main(String argvs[]){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i+1;j>0;j--){
                System.out.print(j);
            }
            for(int k=2;k<=2*i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
