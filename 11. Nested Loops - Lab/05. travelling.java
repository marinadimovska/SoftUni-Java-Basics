package NestedLoops;

import java.util.Scanner;

public class travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();


        while(!destination.equals("End")){
            double neededMoney = Double.parseDouble(scanner.nextLine());
            int money = 0;

            while(money < neededMoney){
                money += Double.parseDouble(scanner.nextLine());
            }
            System.out.println("Going to " + destination + "!");

            destination = scanner.nextLine();
        }
    }
}
