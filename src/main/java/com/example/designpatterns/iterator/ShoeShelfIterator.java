package com.example.designpatterns.iterator;

/**
 * @author wangpengyu
 * @Description
 * @create 2022-07-14 22:54
 */
public class ShoeShelfIterator implements Iterator<Shoe>{

    private ShoeShelf shoeShelf;

    private int index;

    public ShoeShelfIterator(ShoeShelf shoeShelf) {
        this.shoeShelf = shoeShelf;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < shoeShelf.getLength();
    }

    @Override
    public Shoe next() {
        Shoe shoe = shoeShelf.getShoeAt(index);
        index++;
        return shoe;
    }
}
