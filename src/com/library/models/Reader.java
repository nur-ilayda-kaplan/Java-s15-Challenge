package com.library.models;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person{
    private List<String> books=new ArrayList<>();


    public Reader(String name, int id) {
        super(name, id);

    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getId() {
        return super.getId();
    }


    public void purchaseBook(String bookName) {
        books.add(bookName);
        System.out.println(getName() + " adlı okuyucu " + bookName + " kitabını satın aldı.");
    }

    public void borrowBook(String bookName) {
        books.add(bookName);
        System.out.println(getName() + " adlı okuyucu " + bookName + " kitabını ödünç aldı.");
    }

    public boolean returnBook(String bookName) {
        if (books.contains(bookName)) {
            books.remove(bookName);
            System.out.println(getName() + " adlı okuyucu " + bookName + " kitabını iade etti.");
        } else {
            System.out.println(getName() + " adlı okuyucunun " + bookName + " kitabı yok!");
        }
        return false;
    }

    public void showBooks() {
        System.out.println(getName() + " adlı okuyucunun kitapları: " + books);
    }

    @Override
    public void whoYouAre() {
        System.out.println("Bu kitap "+ getName()+ " tarafından okunuyor.");
    }
}

