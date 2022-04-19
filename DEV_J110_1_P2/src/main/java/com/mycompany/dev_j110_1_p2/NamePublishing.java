/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_1_p2;

/**
 *
 * @author USER
 */
public class NamePublishing {
    private String publisherName;
    private String city;

    public NamePublishing(String publisherName, String city) {
        setPublisherName(publisherName);
        setCity(city);
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        if(publisherName == null) throw new IllegalArgumentException("Пустая ссылка");
        this.publisherName = publisherName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city==null) throw new IllegalArgumentException("Пустая ссылка");
        this.city = city;
    }
}
