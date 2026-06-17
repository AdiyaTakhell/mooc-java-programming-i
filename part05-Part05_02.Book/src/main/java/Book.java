/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class Book {

    private String author;
    private String name;
    private int page;

    public Book(String author, String name, int page) {
        this.name = name;
        this.author = author;
        this.page = page;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.page;
    }

    @Override
    public String toString() {
        return this.author + ", " + this.name + ", " + this.page + " pages";

    }

//J. K. Rowling, Harry Potter and the Sorcerer's Stone, 223 pages
}
