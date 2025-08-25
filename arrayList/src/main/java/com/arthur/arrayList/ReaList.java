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

    public void extendSize(){
        if(size == this.elements.length){
            T[] newSize = (T[]) new Object[this.elements.length * 2];

            for(int i=0; i<size; i++){
                newSize[i] = elements[i];
            }

            this.elements = newSize;
        }
    }
}
