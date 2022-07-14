package com.example.designpatterns.iterator;

/**
 * @author wangpengyu
 * @Description
 * @create 2022-07-14 22:40
 */
public class Test {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("小李飞刀"));
        bookShelf.appendBook(new Book("射雕英雄传"));
        bookShelf.appendBook(new Book("天龙八部"));
        bookShelf.appendBook(new Book("悍刀行"));

        Iterator<Book> bookIterator = bookShelf.iterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next().getName());
        }

        System.out.println("===============================");
        ShoeShelf shoeShelf = new ShoeShelf(4);
        shoeShelf.appendShoe(new Shoe("a"));
        shoeShelf.appendShoe(new Shoe("b"));
        shoeShelf.appendShoe(new Shoe("c"));
        shoeShelf.appendShoe(new Shoe("d"));
        Iterator<Shoe> shoeIterator = shoeShelf.iterator();
        while (shoeIterator.hasNext()) {
            System.out.println(shoeIterator.next());
        }

    }
}
