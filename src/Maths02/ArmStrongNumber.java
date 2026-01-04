package Maths02;



public class ArmStrongNumber {
//logNum base 10 *log(digits)
    public static boolean IsArmStrong(int num) {
        if (num < 0) return false;

        int res = 0;
        int copy = num;
        int totaldigit = (num == 0) ? 1 : (int)Math.log10(num) + 1;

        while (num > 0) {
            int digit = num % 10;
            res += (int)Math.pow(digit, totaldigit);
            num /= 10;
        }

        return copy == res;
    }

    public static void main(String[] args) {
        System.out.println(IsArmStrong(142));
    }
}
