package While;

import java.util.Scanner;
public class oldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookCounter = 0;
        String searchedBook = scanner.nextLine(); // searched book
        String book = scanner.nextLine();         // the first book

        while(!book.equals("No More Books")){
            if(book.equals(searchedBook)){
                break;
            }
            bookCounter++;
            book = scanner.nextLine();
        }
        if(book.equals("No More Books")){
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.\n", bookCounter);
        }
        else if((book.equals(searchedBook))){
            System.out.printf("You checked %d books and found it.", bookCounter);
        }
    }
}
