package ru.skypro;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

       public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название "+ name + " Автор: " + author + " Дата выхода " + year;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        if (name.equals(c2.name) && author.equals(c2.author)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(name,author);
    }

    public String getName() {
        return name;
    }


    public Author getAuthor() {
        return author;
    }


}
