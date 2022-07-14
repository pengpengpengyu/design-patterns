package com.example.designpatterns.iterator;

/**
 * @author wangpengyu
 * @Description
 * @create 2022-07-14 22:50
 */
public class ShoeShelf implements Aggregate<Shoe>{

    private Shoe[] shoes;

    private int last = 0;

    public ShoeShelf(){}
    public ShoeShelf(int size) {
        shoes = new Shoe[size];
    }

    public Shoe getShoeAt(int index) {
        return shoes[index];
    }

    public void appendShoe(Shoe shoe) {
        shoes[last] = shoe;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator<Shoe> iterator() {
        return new ShoeShelfIterator(this);
    }
}
