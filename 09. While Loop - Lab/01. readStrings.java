package While;

import java.util.Scanner;


    public class readStrings {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            while(!input.equals("Stop")){
                System.out.println(input);
                input = scanner.nextLine();


            }



        }
    }
