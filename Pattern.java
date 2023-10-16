public class Pattern {
    public static void main(String args[]) {
    // int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[i].length;)
    // }
    int []arr={5,4,3,2,1};
    int low=0,high=arr.length;
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
