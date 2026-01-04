package Arrays;

import java.util.Arrays;

public class $01_LargestElement {
    public static void bruteforce(int arr[]){
        Arrays.sort(arr);
        int n= arr.length;
        System.out.println("The largest element is "+ arr[n-1]);


    }
    public static void optimal (int arr[]){
        int largest= 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest){
                largest=arr[i];

            }

        }
        System.out.println("Largest elment is "+ largest);
    }
    static void main(String[] args) {
        int arr []= {2,5,1,3,0};
        bruteforce(arr);
        optimal(arr);
    }
}
