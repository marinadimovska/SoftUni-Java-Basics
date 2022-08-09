package While;

import java.util.Scanner;

public class accountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = 0;
        String input = scanner.nextLine();

        while(!input.equals("NoMoreMoney")){
            double currentSum = Double.parseDouble(input);
            if(currentSum<0){
                System.out.printf("Invalid operation%n");
            }
            amount += currentSum;
            System.out.printf("Increase: %.2f%n " , currentSum);
            input = scanner.nextLine();

        };


    }

}
