package com.fkjava;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/15 16:20
 */
public class IteratorErrorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("Java EE");
        books.add("疯狂Java");
        books.add("疯狂Android");

        Iterator it = books.iterator();
        while (it.hasNext()){
            String book = (String)it.next();
            System.out.println(book);
            if (book.equals("疯狂Android")){
                books.remove(book);
            }
        }

        System.out.println(books);
    }


}
