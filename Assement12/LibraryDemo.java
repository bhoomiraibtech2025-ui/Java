package Assement12;

import java.util.Scanner;

class Book {

    public int bookId;
    public String title;
    public String author;
    public double price;

    public void displayBook() {
        System.out.println("Book Details");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book book = new Book();

        System.out.print("Enter Book ID: ");
        book.bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Book Title: ");
        book.title = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        book.author = scanner.nextLine();

        System.out.print("Enter Price: ");
        book.price = scanner.nextDouble();

        System.out.println();

        book.displayBook();

        scanner.close();
    }
}