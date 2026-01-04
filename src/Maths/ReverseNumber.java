package Maths;

public class ReverseNumber {
    public static void reverse(int num){
        if(num==0){
            System.out.println("0");
        }
        int res=0;
        boolean isNeg=false;
        if(num<0){
            isNeg=true;
            num=-1*num;
        }
        while(num>0){
          int d = num%10;
            res=res*10+d;
            num=num/10;
        }
        if(isNeg){
            res=-1;
        }
        System.out.println(res);

    }
    static void main(String[] args) {
        reverse(7884551);
    }
}
