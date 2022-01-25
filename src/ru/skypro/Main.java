package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Author authorName = new Author("Эдвард", "Йордон");
        Book book = new Book("Путь камикадзе", authorName, 2003);
//        Book book = new Book("Путь камикадзе", new Author("Эдвард",  "Йордон"), 2003); // вариант с объявлением переменной внутри конструктора
        Book bookTwo = new Book("Золушка", new Author("Шарль",  "Перро"), 1697); // добавляем вторую книгу
        System.out.println("book.titleOfBook = " + book.getTitleOfBook());
//        System.out.println("book.authorName = " + book.getAuthor().getNameAuthor() + " " + book.getAuthor().getSurnameAuthor());//  с вариантом, когда обявляем новую переменную в констукторе
        System.out.println("book.authorName = " + book.getAuthor().getNameAuthor() + " " + book.getAuthor().getSurnameAuthor());
        System.out.println("book.yearOfPublication = " + book.getYearOfPublication());
        book.setYearOfPublication(1955); // иной год издания
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        System.out.println();
        System.out.println("bookTwo.getTitleOfBook() = " + bookTwo.getTitleOfBook());
        System.out.println("bookTwo.authorName = " + bookTwo.getAuthor().getNameAuthor() + " " + bookTwo.getAuthor().getSurnameAuthor());
        System.out.println("bookTwo.getYearOfPublication() = " + bookTwo.getYearOfPublication());
    }
}
