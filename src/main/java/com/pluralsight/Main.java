package com.pluralsight;

import java.util.Scanner;

public class Main {
    private static Book[] books = new Book[20];

    public static void main(String[] args) {
        books[0] =  new Book(1, "9783161484100", "The Great Gatsby");
        books[1] =  new Book(2, "9780140283334", "1984");
        books[2] =  new Book(3, "9780679783268", "Pride and Prejudice");
        books[3] =  new Book(4, "9780743273565", "To Kill a Mockingbird");
        books[4] =  new Book(5, "9780385472579", "The Alchemist");
        books[5] =  new Book(6, "9780307476463", "The Road");
        books[6] =  new Book(7, "9780451524935", "Brave New World");
        books[7] =  new Book(8, "9780345391803", "The Hobbit");
        books[8] =  new Book(9, "9780446310789", "Catch-22");
        books[9] =  new Book(10,"9780451526342", "Fahrenheit 451");
        books[10] = new Book(11,"9780141439556", "Jane Eyre");
        books[11] = new Book(12,"9780140449266", "Crime and Punishment");
        books[12] = new Book(13,"9780140449334", "Anna Karenina");
        books[13] = new Book(14,"9780061122415", "The Catcher in the Rye");
        books[14] = new Book(15,"9780140449198","The Brothers Karamazov");
        books[15] = new Book(16,"9780307743656", "The Midnight Library");
        books[16] = new Book(17,"9780140449242", "Les Misérables");
        books[17] = new Book(18,"9780141439600","Wuthering Heights");
        books[18] = new Book(19,"9780140449260","The Odyssey");
        books[19] = new Book(20,"9780451532084", "Dracula");


        Scanner scanner = new Scanner(System.in);
        Boolean isDone = false;
        while(!isDone){
            System.out.println("Choose a option");
            System.out.println("---------------------");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("3 - Exit");
            int command = scanner.nextInt();
            scanner.nextLine();
            switch(command){
                case 1:
                    availableBooks(scanner);
                    break;
                case 2:
                    checkedOut(scanner);
                    break;
                case 3:
                    isDone = true;
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
        }
        scanner.close();
    }
    public static void availableBooks(Scanner scanner){
        System.out.println("Available Books");
        for(int i = 0; i < books.length; i++){
            if(!books[i].isCheckedOut()) {
                System.out.println(books[i]);
            }
        }
        System.out.println("Enter C - checkout a book \n" +
                "Enter X - to go back to the menu");
        String option1 = scanner.nextLine();
        boolean rightInput = false;
        if(option1.equalsIgnoreCase("c")){
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the id of the book you want to checkout");
            int checkOutBookId = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < books.length; i++) {
                if(checkOutBookId == books[i].getId()){
                    books[checkOutBookId - 1].checkout(name);
                    System.out.println(name + " you have successfully checked out " + books[checkOutBookId - 1].getTitle());
                    rightInput = true;
                }
            }
        } else if (option1.equalsIgnoreCase("x")) {
            System.out.println("going back to menu");
            rightInput = true;
        } else if(!rightInput){
            System.out.println("wrong input, going back to the menu");
        }
    }
    public static void checkedOut (Scanner scanner){
        for(int i = 0; i < books.length; i++){
            if(books[i].isCheckedOut()) {
                System.out.println(books[i] + " | checked out by " + books[i].getCheckedOutTO());
            }
        }
        System.out.println("Enter C to check in a book");
        System.out.println("Enter X to go back to the home screen");
        String option2 = scanner.nextLine();
        boolean rightInput = false;
        if(option2.equalsIgnoreCase("c")){
            checkedIn(scanner);
        } else if (option2.equalsIgnoreCase("x")) {
            System.out.println("going back to menu");
            rightInput = true;
        }
        if(!rightInput){
            System.out.println("wrong input, going back to the menu");
        }
    }
    public static void checkedIn(Scanner scanner) {
        System.out.println("Enter the id of the book you want to check in");
        int checkInBookId = scanner.nextInt();
        scanner.nextLine();
        boolean rightInput = false;
        for (int i = 0; i < books.length; i++) {
            if(checkInBookId == books[i].getId()){
                books[checkInBookId - 1].checkIn();
                System.out.println("you have successfully checked in " + books[checkInBookId - 1].getTitle());
                System.out.println("Going back to the menu");
                rightInput = true;
            }
        }
        if(!rightInput){
            System.out.println("wrong id, going back to the menu");
        }
    }
}
