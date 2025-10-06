package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTO;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTO = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCheckedOutTO() {
        return checkedOutTO;
    }

    public void setCheckedOutTO(String checkedOutTO) {
        this.checkedOutTO = checkedOutTO;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void checkout(String name) {
            this.isCheckedOut = true;
            this.checkedOutTO = name;
    }

    public void checkIn() {
            this.isCheckedOut = false;
            this.checkedOutTO = "";
    }

    @Override
    public String toString() {
        return id + " | " + isbn + " | " + title;
    }
}
