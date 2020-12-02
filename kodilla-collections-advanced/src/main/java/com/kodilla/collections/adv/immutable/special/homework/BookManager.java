package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager {
    public List<Book> books = new LinkedList<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);

        if (books.contains(book)) {
            System.out.println("The selected book already exists: " + book.getTitle() + " " + book.getAuthor());
        }
        books.add(book);
        return book;
    }
}