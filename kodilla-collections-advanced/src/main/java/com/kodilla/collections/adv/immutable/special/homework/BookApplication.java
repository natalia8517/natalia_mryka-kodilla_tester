package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager manager = new BookManager();
        Book book1 = manager.createBook("Dziady", "Adam Mickiewicz");
        Book book2 = manager.createBook("W pustyni i w puszczy", "Henryk Sienkiewicz");
        Book book3 = manager.createBook("Dziady", "Adam Mickiewicz");

        System.out.println(book1 == book3);
        System.out.println(book1.equals(book3));
        System.out.println(book1.hashCode());
        System.out.println(book3.hashCode());
    }
}