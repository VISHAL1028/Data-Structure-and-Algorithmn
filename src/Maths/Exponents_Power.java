package Maths;

public class Exponents_Power {
    public static void power(int a,int b){
        boolean isNeg=false;
        if(b<0){
            b=-1*b;
            isNeg=true;
        }
      double res=1;
      for(int i=0;i<b;i++){
          res= res*a;
      }
      if(isNeg){
          res=1/res;
      }
        System.out.println(res);

    }
    static void main(String[] args) {
        power(2,2);
    }
}
