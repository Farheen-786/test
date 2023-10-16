public class Reverse {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
    int low=0,high=arr.length-1;
    while(low<=high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        low++;
        high--;
    }
    for(int ele:arr){
        System.out.print(ele+" ");
    }

    }
}
