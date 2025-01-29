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

    // Kitapları döndür
    public List<Book> getBooks() {
        return books;
    }

    // Okuyucuları döndür
    public List<Reader> getReaders() {
        return readers;
    }

    // Yeni kitap ekleme
    public void newBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " kütüphaneye eklendi.");
    }

    // Kitap ödünç verme
    public void lendBook(String bookName, Reader reader) {
        for (Book book : books) {
            if (book.getTitle().equals(bookName) && book.isAvailable()) {
                book.setAvailable(false);
                reader.borrowBook(bookName);
                System.out.println(bookName + " kitabı " + reader.getName() + " adlı okuyucuya ödünç verildi.");
                return;
            }
        }
        System.out.println(bookName + " kitabı mevcut değil veya başka biri tarafından alınmış.");
    }

    // Kitap iade alma
    public void takeBackBook(String bookName, Reader reader) {
        if (reader.returnBook(bookName)) {
            for (Book book : books) {
                if (book.getTitle().equals(bookName)) {
                    book.setAvailable(true);
                    System.out.println(bookName + " kitabı kütüphaneye geri alındı.");
                    return;
                }
            }
        } else {
            System.out.println(reader.getName() + " bu kitabı zaten iade etmiş veya hiç ödünç almamış.");
        }
    }

    // Kütüphanedeki kitapları göster
    public void showBooks() {
        System.out.println("Kütüphanedeki Kitaplar:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " (" + (book.isAvailable() ? "Mevcut" : "Ödünç Verildi") + ")");
        }
    }
}
