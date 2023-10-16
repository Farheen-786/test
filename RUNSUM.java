public class RUNSUM {
    public static void main(String argvs[]){
        int []arr={1,4,5,7,8};
        int sumarr[]=new int[5];
        sumarr[0]=1;
        for(int i=1;i<arr.length;i++){
                     sumarr[i]=arr[i]+arr[i-1];
        }
        for(int i=0;i<sumarr.length;i++){
            System.out.println(sumarr[i]);
        }
    }
    
}
