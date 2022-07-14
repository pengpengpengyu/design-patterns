package com.example.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangpengyu
 * @Description
 * @create 2022-07-14 22:32
 */
public class BookShelf implements Aggregate<Book>{

    private List<Book> books;

    private int last = 0;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
