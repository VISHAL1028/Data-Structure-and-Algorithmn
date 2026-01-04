package Maths;

public class FastExponents {
    public static void fastExponentiation(int a, int b){
        boolean isNeg=false;
        if(b<0){
            isNeg = true;
            b = -1 * b;
        }
        double res=1.0;
        while (b>0){
            if(b%2!=0){
                res = res * a;
                b--;
            }
            b=b/2;
            a = a*a;
        }
        if(isNeg){
            res = 1/res;
        }
        System.out.println("res is " + res);
    }

    static void main(String[] args) {
        fastExponentiation(10,2);
    }
}
