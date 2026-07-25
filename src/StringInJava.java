// print all characters of string

public class StringInJava {
    public static void main(String[] args) {

//        String str= "dhiraj";
//
//        for(int i = 0; i<=str.length(); i++){
//            System.out.println(str.charAt(i));
//        }


// count length without length ()


//        String str = "Java";
//
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            count++;
//        }
//
//        System.out.println(count);


       // count vowels

        String str = "CodeHelp";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {

                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}
