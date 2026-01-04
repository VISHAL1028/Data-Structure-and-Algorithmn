package Maths02;

public class PrintAllDivisors {
    public static void printDivisors(int num){
        int sqrt= (int)Math.sqrt(num);
        for(int i=1;i<sqrt;i++){
            if(num%i==0){
                System.out.print(i +" ");
                if(num/i!=i){
                    System.out.print(num/i+" ");
                }

            }
        }

    }
      static void main(String[] args) {
        printDivisors(36);
    }
}
