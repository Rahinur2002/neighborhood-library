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

                    break;

                case 3:

                    break;

                default:

                    System.out.println("invalid option");
                    break;
            }



        }


    }

    public static void availableBooks(Scanner scanner){
        System.out.println("Available Books");
        for(int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        }

        System.out.println("Enter A - checkout a book \n" +
                "Enter X to go back to the menu");
        String option1 = scanner.nextLine();

        boolean rightInput = false;

        if(option1.equalsIgnoreCase("a")){
            System.out.println("Enter the id of the book you want to checkout");
            int bookId = scanner.nextInt();
            scanner.nextLine();
//            for (int i = 0; i < books.length; i++) {
//                if(books[i].getId())
//
//            }

            rightInput = true;
        } else if (option1.equalsIgnoreCase("x")) {
            System.out.println("going back to menu");
            rightInput = true;
        } else if(!rightInput){
            System.out.println("wrong input, going back to the menu");
        }

    }

}
