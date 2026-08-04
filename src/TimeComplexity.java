public class TimeComplexity {
    public static void main(String[] args) {

        // 1) O(1) — Constant Time

        int x = 10;
        int n = 5;
        System.out.println(x);

        // 2) O(n) — Linear Time

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }


        // O(n²) — Quadratic Time

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);


                //  O(log n) — Logarithmic Time

                while (n > 1) {
                    n = n / 2;
                }

            }
        }
    }
}

                                            //How to Calculate Time Complexity



       //Rule 1: Ignore Constants
//for (int i = 0; i < 2*n; i++) {
//        System.out.println(i);
//}
//        -> O(2n) = O(n)
//


          //Rule 2: Drop Lower Terms
//O(n² + n) = O(n²)
//-> Only highest term matters
//



      //Rule 3: Nested Loops Multiply
//for (i = 0; i < n; i++)
//        for (j = 0; j < n; j++)
//        -> O(n × n) = O(n²)



      //Rule 4: Separate Loops Add
//for (i = 0; i < n; i++)
//        for (j = 0; j < n; j++)
//        👉 O(n + n) = O(n)
//

      //Rule 5: Condition-Based Loops
//
//
//for (int i = 1; i < n; i *= 2)
//        -> O(log n)




                                                   // EXAMPLES
                                       //Problem-Based Understanding



          //Problem 1: Count Operations
//java
//
//for (int i = 0; i < n; i++) {
//        System.out.println(i);
//}
//        -> Runs n times
//
//✅ Time Complexity = O(n)
//


             //Problem 2: Nested Loop
//java
//
//for (int i = 0; i < n; i++) {
//        for (int j = 0; j < n; j++) {
//        System.out.println(i + j);
//    }
//            }
//            -> n × n = n²
//
//        ✅ Time Complexity = O(n²)
//


           //Problem 3: Half Loop
//java
//
//for (int i = 0; i < n/2; i++) {
//        System.out.println(i);
//}
//        -> n/2 → ignore constant
//
//✅ O(n)
//


            //Problem 4: Increment by 2
//java
//
//for (int i = 0; i < n; i += 2)
//        -> runs n/2 times
//
//✅ O(n)
//



            //Problem 5: Logarithmic Loop
//java
//
//for (int i = 1; i < n; i *= 2)
//        -> 1 → 2 → 4 → 8 → …
//
//        ✅ O(log n)



