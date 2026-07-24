import java.util.Scanner;

public class pailndron {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number :");
        int n = input.nextInt();
        boolean Ispali = isPalindrom(n);
        if (Ispali){
            System.out.println("the given number is palindrom");
        }else{
            System.out.println("the given  number is not a palindrom number");
        }


    }
    public  static  boolean isPalindrom(int n){
        int reverse =0 ;
        int  or =n;
        while (n > 0){
            int digit = n %10;
            reverse =reverse *10 +digit;
            n =n/10;
        }
        return or == reverse;

    }
}