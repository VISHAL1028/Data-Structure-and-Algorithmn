package Arrays;

public class $06_LinearSearch {
    public static int linearSreach(int arr[],int n ){
        for(int i=0;i<n;i++){
           if(arr[i]==n) {
              return i;
           }
        }
      return -1;
    }
    static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int n=3;
        System.out.println( linearSreach(arr,n));
    }

}
