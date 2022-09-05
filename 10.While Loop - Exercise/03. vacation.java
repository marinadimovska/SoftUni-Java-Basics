package While;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int spendDaysCount = 0;
        int allDays = 0;
        boolean isFailed = false;
        while(availableMoney<vacationPrice){
            //Action type - text with "spend" and "save" options
            String action = scanner.nextLine();
            //The amount you will save/spend
            double sum = Double.parseDouble(scanner.nextLine());
            allDays++;

            switch(action){
                case "spend":
                    spendDaysCount++;
                    availableMoney -= sum;
                    if(availableMoney<0){
                        availableMoney = 0;
                    }
                    break;
                case "save":
                    spendDaysCount= 0 ;
                    availableMoney += sum;
                    break;

            }
            if(spendDaysCount==5){
                isFailed = true;
                break;
            }

        }
        if (isFailed) {
            System.out.printf("You can't save the money.\n" +
                    "%d\n", allDays);
        }
        else{
            System.out.printf("You saved the money for %d days.\n", allDays);
        }
    }
}
