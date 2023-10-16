public class ROTATE {
    public static void main(String argvs[]){
        int arr[]={1,2,3,4,5,6};
        int temp;
        int n=arr.length;
        temp=n;
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        for(int i:arr){
        System.out.println(i+" ");
        }

    }
    
}
