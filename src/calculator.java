import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to in my code");
        System.out.print("please enter the nuber :");
        int n = input.nextInt();
        System.out.print("please enter the nuber :");
        int n1 = input.nextInt();
        System.out.println("please give me an operator : (+,-,*,%,/)");
        char ch = input.next().charAt(0);
        int result;
        if(ch == '+'){
            result = n+n1;
            System.out.println("sum of the digit :" + result);
        } else if (ch== '-') {
            result =n-n1;
            System.out.println("diff is :"+ result);

        } else if (ch == '*') {
            result =  n *n1;
            System.out.println("the module is :" + result);

        } else if (ch == '/') {
            result = n /n1;
            System.out.println("the div is :"+ result);

        } else{
            System.out.println("invalid inputs");
        }
    }
}

