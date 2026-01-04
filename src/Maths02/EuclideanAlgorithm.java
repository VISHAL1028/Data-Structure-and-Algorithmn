package Maths02;

public class EuclideanAlgorithm {
    public static int findGcd(int a,int b){
        a= Math.abs(a);
        b=Math.abs(b);
        if(b>a){
            return findGcd(b,a);
        }
        while(b>0){
            int temp= a%b;
            a=b;
            b=temp;

        }
        return a ;
    }

//    we have to write the code of LCM


    static void main(String[] args) {
        System.out.println(  findGcd(18,12));
    }
}
