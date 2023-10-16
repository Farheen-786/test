public class MISS {
    public static void main(String argvs[]){
        int arr[]={0,1,2,4,5};
        int n=arr.length;
        int sum=0;
        int totalsum=n+(n+1)/2;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int missing=totalsum+sum;
                System.out.println(missing);

            }   
        }
    
