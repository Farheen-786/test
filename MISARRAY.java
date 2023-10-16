public class MISARRAY {
    public static void main(String argvs[]){
        int []arr={1,2,4,6};
        int n=arr.length;
        int sum=0;
        int totalsum=0;
        for(int i=1;i<6;i++){
            sum=sum+i;
        }
        for(int i=0;i<n;i++){
            totalsum=totalsum+arr[i];
        }
        int missing=sum-totalsum;
        System.out.println(totalsum);
        System.out.println(missing);
    }
    
}
