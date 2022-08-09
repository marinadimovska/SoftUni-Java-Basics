package While;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        String input = scanner.nextLine();

        while(!input.equals("Stop")){
            int num = Integer.parseInt(input);
            if(num>maxNumber){
                maxNumber = num;
            }
            input = scanner.nextLine();

        }
        System.out.println(maxNumber);
    }

}
