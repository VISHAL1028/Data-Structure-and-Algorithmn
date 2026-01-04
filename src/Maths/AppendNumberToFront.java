package Maths;

public class AppendNumberToFront {

    public static void InsertAtFront(int num, int digit) {
        boolean isNeg = false;

        if (num < 0) {
            num = -num;
            isNeg = true;
        }

        int digits = 1;
        if (num > 0) {
            digits = (int) Math.log10(num) + 1;
        }

        int res = digit * (int) Math.pow(10, digits) + num;

        if (isNeg) {
            res = -res;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        InsertAtFront(45, 5);
    }
}

