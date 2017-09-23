package algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-abstract-classes/problem

public class Abstract {

    static abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    static class MyBook extends Book {
        int price;

        /**
         * Class Constructor
         *
         * @param title  The book's title.
         * @param author The book's author.
         * @param price  The book's price.
         **/

        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        /**
         * Method Name: display
         * Print the title, author, and price in the specified format.
         **/
        @Override
        void display() {
            System.out.printf("Title: %s\n", title);
            System.out.printf("Author: %s\n", author);
            System.out.printf("Price: %d\n", price);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }

}
