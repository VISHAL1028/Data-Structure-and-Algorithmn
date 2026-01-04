package Arrays;

public class $05_RotateTheArray {
    public static void rotatearraybyonebrute(int arr[],int n){
        int temp []=new int[n];

        for(int i=1;i<n;i++){
            temp[i-1]=arr[i];

        }
        temp[n-1]=arr[0];
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }

    public static void rotatarraybyoneOptimal(int arr[],int n){
    int temp = arr[0];
    for(int i=1;i<n;i++){
        arr[i-1]=arr[i];
    }
    arr[n-1]=temp;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }

    static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int brr[]={9,8,7,6,5,4};
        int n= arr.length;
        int b= brr.length;
        rotatearraybyonebrute(arr,n);
        System.out.println("    ");
        rotatarraybyoneOptimal(brr,b);

    }
}
