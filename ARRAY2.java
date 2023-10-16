public class ARRAY2 {
    public static void main(String argvs[]){
        int []arr={5,8,6,1,4};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
            min=arr[i];
        }
        System.out.print("min element is"+min);
    }
    
}
