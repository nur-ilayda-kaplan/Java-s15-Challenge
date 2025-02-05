package com.library.services;

import com.library.models.Book;
import com.library.models.Reader;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public List<Book> getBooks() {

        return books;
    }

    public List<Reader> getReaders() {

        return readers;
    }

    public void newBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " kütüphaneye eklendi.");
    }

    public boolean lendBook(String bookName, Reader reader) {
        //for each yapısıdır. books koleksiyonunun List<Book> içindeki her Book nesnesini sırayla alır, book nesnesine atar.
        for (Book book : books) {
            if (book.getTitle().equals(bookName) && book.isAvailable()) {
                book.setAvailable(true);
                reader.borrowBook(bookName);
                System.out.println(bookName + " kitabı " + reader.getName() + " adlı okuyucuya ödünç verildi.");
                return true;
            }
        }
        System.out.println(bookName + " kitabı mevcut değil veya başka biri tarafından alınmış.");
        return false;
    }


    public boolean takeBackBook(String bookName, Reader reader) {
        if (reader.returnBook(bookName)) {
            for (Book book : books) {
                if (book.getTitle().equals(bookName)) {
                    book.setAvailable(true);
                    System.out.println(bookName + " kitabı kütüphaneye geri alındı.");
                    return false;
                }
            }
        } else {
            System.out.println(reader.getName() + " bu kitabı zaten iade etmiş veya hiç ödünç almamış.");
        }
        return false;
    }


    public void showBooks() {
        System.out.println("Kütüphanedeki Kitaplar:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " (" + (book.isAvailable() ? "Mevcut" : "Ödünç Verildi") + ")");
        }
    }


}
