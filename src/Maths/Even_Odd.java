package Maths;

public class Even_Odd {
    public static void Even_Odd(int num){
       if(num%2==0){
           System.out.println("Number  "+num+" is Even");
       }else {
           System.out.println("Number  "+num+" is Odd");
       }
    }
    static void main(String[] args) {
        Even_Odd(458);

    }
}
