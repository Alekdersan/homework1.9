package ru.skypro;

public class Book {
    private final String titleOfBook;
    private final Author author;
    private int yearOfPublication;


    public Book(String titleOfBook, Author author, int yearOfPublication) {
        this.titleOfBook = titleOfBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleOfBook() {
        return this.titleOfBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
