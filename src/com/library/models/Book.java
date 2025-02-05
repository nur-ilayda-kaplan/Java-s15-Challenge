package com.library.models;

import java.util.Date;

public class Book {
    private int bookId;
    private Author author;
    private String name;
    private double price;
    private boolean status;
    private String edition;
    private Date dateOfPurchase;
    private boolean isAvailable;


    public Book(int bookId, Author author, String name, double price, boolean status, String edition, Date dateOfPurchase, boolean isAvailable) {
        this.bookId = bookId;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
        this.isAvailable = isAvailable;
    }

    public Book( String name) {
        this.name = name;
    }

    public String getTitle() {
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public void changeOwner(boolean isAvailable) {
        this.status = isAvailable;
    }
    public String getOwner() {
        return status ? "Kütüphane" : "Ödünç alınmış";
    }

    public void display() {
        System.out.println("Kitap Bilgileri:");
        System.out.println("ID: " + bookId);
        System.out.println("Başlık: " + name);
        System.out.println("Yazar: " + author);
        System.out.println("Fiyat: " + price);
        System.out.println("Baskı: " + edition);
        System.out.println("Ödünç Alma Tarihi: " + dateOfPurchase);
        System.out.println("Durum: " + (status ? "Mevcut" : "Ödünç Alınmış"));
    }


    public void updateStatus(boolean newStatus) {

        this.status = newStatus;
    }


    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {

        this.isAvailable = available;
    }
   
}
