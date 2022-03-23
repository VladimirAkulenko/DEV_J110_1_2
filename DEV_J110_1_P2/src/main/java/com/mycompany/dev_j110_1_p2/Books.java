/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_1_p2;

import java.util.Arrays;

/**
 *
 * @author USER
 */
public class Books {
    private String name;
    private NamePublishing publishing;
    private int year;
    private String [] authors;

    public Books(String name, int year, NamePublishing publishing) {
        setName(name);
        setYear(year);
        setPublishing(publishing);
    }

    public Books(String name, String author, int year, NamePublishing publishing) {
        setName(name);
        setAuthor(author);
        setYear(year);
        setPublishing(publishing);
    }

    public Books(String name, String[] authors, int year, NamePublishing publishing) {
        setName(name);
        setAuthors(authors);
        setYear(year);
        setPublishing(publishing);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null) throw new IllegalArgumentException("Ведите нзавание книги");
        this.name = name;
    }

    public NamePublishing getPublishing() {
        return publishing;
    }

    public void setPublishing(NamePublishing publishing) {
        if (publishing==null) throw new IllegalArgumentException("Введите наименование издательства");
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year<=0) throw new IllegalArgumentException("Год издания должно быть больше нуля");
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        if (authors != null){
            for (String author:authors) {
                if (author==null) throw new IllegalArgumentException("Список авторов содержит пустые ссылки");
            }
        }
        this.authors = authors;
    }

    public void setAuthor(String author){
        if (author == null)
             throw new IllegalArgumentException("Автор содержит пустую ссылку");
        this.authors = authors;


    }

    public int getAuthorAmount(){
        return authors.length;
    }

    public String getAuthorIndex(int index){
        if(index<0)
            throw new IllegalArgumentException("Некоректный индекс");
        if(index>=authors.length)
            throw new IllegalArgumentException("Индекс больше длины масива");
        return authors[index];


    }


    public void print (){
        if(authors!=null)
            System.out.println(getName()+";"+Arrays.toString(authors)+";"+getPublishing().getPublisherName()+";"+getPublishing().getCity()+";"+getYear()+";");
        else
        System.out.println(getName()+";"+getPublishing().getPublisherName()+";"+getPublishing().getCity()+";"+getYear()+";");
    }

    public static void printAll ( Books [] books){
        books[0].print();
        books[1].print();
        books[2].print();
        books[3].print();
        books[4].print();
    }
}
