import java.util.*;
public class SINGLEELEMENT {
    public static void main(String argvs[]){
        int arr1[]={1,3,2,2,1};
      
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i], +1));
        }
        for(int i:arr1){
            if (map.get(arr1[i])==1){
                System.out.println(arr1[i]);
            }
        }
    }
    
}
