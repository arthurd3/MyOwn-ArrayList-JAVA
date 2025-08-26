package com.arthur.arrayList;

public class ReaList<T> {

    private T[] elements;
    private int size;

    public ReaList(final int size) {
        this.elements = (T[]) new Object[size];
        this.size = 0;
    }

    public boolean add(final T value) {
        extendSize();
        if(size <  elements.length) {
            elements[size] = value;
            size++;
            return true;
        }
        return false;
    }

    public T add(final int index, final T value) {
        extendSize();

    }
    
    public T find(final int index) {
        this.checkIndex(index);
        return elements[index];
    }

    public T findFirst() {
        this.checkEmpty();
        return elements[0];
    }

    public T findLast() {
        this.checkEmpty();
        return elements[size - 1];
    }

    private void extendSize(){
        if(size == this.elements.length){
            T[] newSize = (T[]) new Object[this.elements.length * 2];

            System.arraycopy(elements, 0, newSize, 0, size);

            this.elements = newSize;
        }
    }

    private void checkIndex(final int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void checkEmpty() {
        if(size == 0)
            throw new ArrayIndexOutOfBoundsException("Array is empty");
    }
}
