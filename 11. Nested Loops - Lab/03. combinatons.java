package NestedLoops;

import java.util.Scanner;

public class combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0 ;
        // x1
        for (int x1 = 0; x1 <= n; x1++) {
            // x2
            for (int x2 = 0; x2 <= n; x2++) {
                // x3
                for (int x3 = 0; x3 <= n; x3++) {
                // x1 + x2 + x3 = n
                if(x1 + x2 + x3 == n)    {
                    count++;
                }

                }
            }
        }
        System.out.println(count);
    }
}
