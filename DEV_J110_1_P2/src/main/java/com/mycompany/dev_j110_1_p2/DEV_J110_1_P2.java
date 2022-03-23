/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dev_j110_1_p2;

/**
 *
 * @author USER
 */
public class DEV_J110_1_P2 {

    public static void main(String[] args) {
        
        NamePublishing pm = new NamePublishing("Проспект","Москва");
        NamePublishing ps = new NamePublishing("Питер","Санкт-Петербург");
        NamePublishing bs = new NamePublishing("БХВ","Санкт-Петебург"); // ошибка сделана намеренно
        NamePublishing dk = new NamePublishing("Диалектика","Киев");

        Books [] books = new Books[5];
        books[0]=new Books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных",new String[]{"Седжвик Роберт,Уэйн Кевин"},2018,ps);
        books[1]=new Books("Разработка требований к программному обеспечению. 3-е издание, дополненное",new String[]{"Вигерс Карл"},2019,bs);
        books[2]=new Books("Java. Полное руководство, 10-е издание",new String[]{"Шилдт Герберт"}, 2018,dk);
        books[3]=new Books("C/C++. Процедурное программирование",new String[]{"Полубенцева М.И."},2017,bs);
        books[4]=new Books("Конституция РФ",2020,pm);

        Books.printAll(books);

        for (Books book: books) {

        }
    }
}
