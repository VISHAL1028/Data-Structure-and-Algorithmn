package Maths;

public class AppendNumberToLast {
    public static void appendNumberToLastDigit(int number,int digit){
        boolean isNeg=false;
        if(number<0){
            isNeg=true;
            number=-number;
        }
       int ans= number=number*10+digit;
        if(isNeg){
            ans=-1*ans;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        appendNumberToLastDigit(754,8);
    }

}
