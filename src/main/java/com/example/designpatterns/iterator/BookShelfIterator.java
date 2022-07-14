package com.example.designpatterns.iterator;

/**
 * @author wangpengyu
 * @Description
 * @create 2022-07-14 22:36
 */
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator() {
    }

    public BookShelfIterator(BookShelf bookShelf) {
        index = 0;
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
