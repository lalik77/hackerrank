 public static void fizzBuzz(int n) {
        // Write your code here

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 ) {
                System.out.print(i + " ");
                System.out.print(" fizz ");
            }

            if (i % 5 == 0) {
                System.out.print(" " + i);
                System.out.print(" " + "buzz ");
            }

            if((i % 3 == 0)&&(i % 5 == 0)){
                System.out.print(i + " ");
                System.out.print(" fizzbuzz ");
            }

        }

    }
