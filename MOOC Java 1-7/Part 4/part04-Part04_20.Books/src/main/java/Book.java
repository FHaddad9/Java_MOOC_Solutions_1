/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feras
 */
public class Book {
    private String book;
    private int pages;
    private int year;
    
    public Book(String book, int pages, int year){
        this.book=book;
        this.pages=pages;
        this.year=year;
    }
    
    public String name(){
        return this.book;
    }
     
    public String toString(){
        return this.book+", "+this.pages+", "+this.year;
    }
}
