package com.library.models;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List<String> books=new ArrayList<>();



    public Author(String name, int id) {
        super(name, id);

    }


    public List<String> getBooks() {
        return books;
    }

    public void newBook(String bookName) {
        books.add(bookName);
        System.out.println(getName() + " adlı yazar " + bookName + " adlı kitabı yazdı.");
    }

    public void showBooks() {
        System.out.println(getName() + " tarafından yazılan kitaplar: " + books);
    }


    @Override
    public void whoYouAre() {
        System.out.println(getName()+ " isimli yazarın adıdır.");
    }
}
