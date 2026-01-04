package Arrays;

import java.util.Arrays;

public class $02_SecondLargest {
    public static void bruteForce(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("Second largest number is "+arr[n-2]);
        System.out.println("Second smallest  number is "+arr[1]);

    }
    public static void better(int arr[]){
        int n = arr.length;
        int smallest= Integer.MAX_VALUE;
        int secondSmallest= Integer.MAX_VALUE;
        int largest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
           largest=Math.max(arr[i],largest);
           smallest=Math.min(arr[i],smallest);
       }
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest || arr[i]!=largest){
                secondLargest=arr[i];
            }
            if(arr[i]<secondSmallest||arr[i]!=smallest){
                secondSmallest= arr[i];
            }
        }
        System.out.println("Second largest number is "+secondLargest);
        System.out.println("Second smallest  number is "+secondSmallest);
        System.out.println("Largest number is "+largest);
        System.out.println(" smallest  number is "+smallest);
    }
    public static void optimal(int arr[]){
        int n=arr.length;
        int largest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondLargest || arr[i]!=largest) {
                secondLargest=arr[i];

            }
        }
        System.out.println("Second largest number is "+secondLargest);


    }
    static void main(String[] args) {
    int arr[]= {1,2,4,7,7,5};
//      bruteForce(arr);
//        better(arr);
        optimal(arr);
    }
}
