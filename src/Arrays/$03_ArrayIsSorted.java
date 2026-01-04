package Arrays;

public class $03_ArrayIsSorted {
    public static boolean isSorted(int arr[]){
        int n= arr.length;
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[i]){
                    return false;
                }

            }
//            if(arr[i]<arr[i+1]){
//                return true}

        }
        return true;
    }
    public static boolean isSorted2(int arr []){
        int n= arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int brr[]={5,4,6,7,8};
        System.out.println( isSorted(arr));
        System.out.println( isSorted2(brr));
    }
}
