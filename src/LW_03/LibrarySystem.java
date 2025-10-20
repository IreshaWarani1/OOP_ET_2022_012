package LW_03;

import java.util.ArrayList;
import java.util.List;

abstract class BorrowableItems {
        public abstract void displayInfo();
    }


    class Book extends BorrowableItems {
        private String title;
        private String author;
        private String ISBN;
        private boolean available;

        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.available = true;  // by default, books are available
        }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }


        @Override
        public void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
            System.out.println("Available: " + (available ? "Yes" : "No"));
            System.out.println("--------------------------------");
        }
    }

    class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }


    class Student extends Person {
        public Student(String name) {
            super(name);
        }
    }


    class Library {
        private List<BorrowableItems> borrowableItemsList;

        public Library() {
            borrowableItemsList = new ArrayList<>();
        }


        public void addLibraryItem(BorrowableItems item) {
            borrowableItemsList.add(item);
        }


        public void checkoutItem(String title) {
            for (BorrowableItems item : borrowableItemsList) {
                if (item instanceof Book) {
                    Book book = (Book) item;
                    if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("Book \"" + title + "\" has been checked out.");
                        return;
                    }
                }
            }
            System.out.println("Book \"" + title + "\" is not available or not found.");
        }

        public void listAvailableItems() {
            System.out.println("=== Available Library Items ===");
            boolean found = false;
            for (BorrowableItems item : borrowableItemsList) {
                if (item instanceof Book) {
                    Book book = (Book) item;
                    if (book.isAvailable()) {
                        book.displayInfo();
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("No items are currently available.");
            }
        }


        public void displayLibraryInfo() {
            int totalItems = borrowableItemsList.size();
            int availableItems = 0;

            for (BorrowableItems item : borrowableItemsList) {
                if (item instanceof Book && ((Book) item).isAvailable()) {
                    availableItems++;
                }
            }

            System.out.println("=== Library Information ===");
            System.out.println("Total Items: " + totalItems);
            System.out.println("Available Items: " + availableItems);
            System.out.println("----------------------------");
        }
    }


    public class LibrarySystem {
        public static void main(String[] args) {

            Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
            Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
            Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");


            Library library = new Library();


            library.addLibraryItem(book1);
            library.addLibraryItem(book2);
            library.addLibraryItem(book3);


            library.displayLibraryInfo();


            library.listAvailableItems();


            library.checkoutItem("Island of a Thousand Mirrors");


            library.listAvailableItems();


            Student student = new Student("Alice Johnson");
            System.out.println("Student " + student.getName() + " borrowed a book.");
        }
    }

