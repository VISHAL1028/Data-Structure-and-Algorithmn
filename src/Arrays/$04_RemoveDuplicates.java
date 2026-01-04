package Arrays;

import java.util.HashSet;
import java.util.Set;

public class $04_RemoveDuplicates {
    public static int removeDuplicatebrute(int arr[]){
            Set<Integer> set=new HashSet<>();
//            for adding the number to the set
            for(int num:arr){
                set.add(num);
            }
            int k=0;
            for(int num:set){
                arr[k++]=num;
            }
            return k;
    }
    public static int removeDuplicateoptimal(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    static void main(String[] args) {
        int arr []= {1,1,2,2,2,2,3,3,};
        int brr[]={2,2,2,3,3,4,4,4,5,5,5,5,6,6,6,7};
        int k= removeDuplicatebrute(arr);
        int R = removeDuplicateoptimal(brr);
        System.out.println("The Unique elemnts are "+ k);
        System.out.println("The Unique elemnts are "+ R);
    }
}
