package AMRself;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Result {
        /*
         * Complete the 'fizzBuzz' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        public static void fizzBuzz(int n) {

            for(int i = 1; i <= n; i++){

                if (i % 15== 0){
                    System.out.println("FizzBuzz");
                    return;
                } else if (i%3 == 0 ) {
                    System.out.println("Fizz");
//                    return;
                }
                else if (i% 5 == 0) {
                    System.out.println("Buzz");
//                    return;
                }

                else {
                    System.out.println(i);
//                    return;
                }
            }

        }

    }
    class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            Result.fizzBuzz(n);

            bufferedReader.close();
        }
    }