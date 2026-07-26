public class basicMaths {

// print digits of number


    static void printDigits(int num){
        // agar num = 0 hoga toh mai rukunga
        // agar num!=0 hoga toh mai processing karunga

        while(num != 0){
            int digit= num%10;
            System.out.println(digit);
            num= num/10;
        }
    }

    // count all digit of number

    static int countDigits(int num) {
        // agar num = 0 hoga toh mai rukunga
        // agar num!=0 hoga toh mai processing karunga
        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    // sum of digits of number

    static int sumOfDigits(int num) {
        // agar num = 0 hoga toh mai rukunga
        // agar num!=0 hoga toh mai processing karunga
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum= sum +digit;
            num = num / 10;
        }
        return sum;
    }

    // reverse a number
    static int reverseNum(int num ){
        int revNum = 0;
                //ans = ans*10 + curentDigit

        while(num!=0){
            int digit = num%10;
            // reverse num calculate as for formulae
            revNum = revNum*10+digit;
            //last digit remove karna padegs num me se
            num = num/10;
        }
        return revNum;


    }

    // palindrome number

    public  static  boolean isPalindrom(int num){
        int reversedNum = reverseNum(num) ;
        int  originalNum =num;
        if(originalNum == reversedNum){
            System.out.println("it is a palindrome ");
            return true;
        }else{
            System.out.println("It is not a palindrome ");
            return false;
        }

    }



    public static void main(String[] args) {

        boolean ans = isPalindrom(1221);
        System.out.println(ans);






        //        int num = 234567;



//        int revNum = reverseNum(num);
//        System.out.println(revNum);

//        int sum = sumOfDigits(num);
//        System.out.println(sum);

//        int ans = countDigits(num);
//        System.out.println(ans);


//        printDigits(num);

        // count all digit of number

    }
}
