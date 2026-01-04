package Maths;

public class FindNumberOfDigits {

    public static  void FindNumberOfDigits(int nums) {
        if (nums == 0) {
            System.out.println("Numberof digits :"+1);
            return;
        }
        if(nums<0){
            nums= -1* nums;
        }
        int ans= (int)Math.log10(nums)+ 1;
        System.out.println(ans);
    }
    static void main(String[] args) {
        int number = 458;
        int count= 0;
        while(number>0){
            number= number/10;
            count++;
        }
        System.out.println(count);

        FindNumberOfDigits(0);
    }
}
