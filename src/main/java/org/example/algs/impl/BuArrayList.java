package org.example.algs.impl;
import org.example.algs.BuList;

import java.util.Arrays;
import java.util.Comparator;

// TODO: implement as dynamic array. Do not use Java collections of any utils.
public class BuArrayList<T> implements BuList<T> {

    private Object[] array;
    private int size;
    private static final int DEFAULT_SIZE = 10;

    public BuArrayList(){
        array = new Object[DEFAULT_SIZE];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    @Override
    public boolean contains(T elem) {
        for(Object element : array){
            if(element == elem){
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);
        size = 0;
    }

    @Override
    public boolean add(T elem) {
        array[size] = elem;
        size++;
        return true;
    }

    @Override
    public boolean add(T elem, int index) {
        if(index >= 0 || index > size){
            array[index] = elem;
        return true;}
        else {
        return false;}
    }

    @Override
    public T get(int index) {
        if(array == null && index >= size){
            return (T) array[index];
        }
        else {
        return null;}
    }

    @Override
    public boolean remove(T elem) {
        if(array != null){
            Object[] gost_array = new Object[DEFAULT_SIZE];
            int gost_ar_size = 0;
            for(Object element : this.array){
                if(element != elem && element != null){
                    gost_array[gost_ar_size] = element;
                    gost_ar_size++;
                }
            }
            this.array = gost_array;
            this.size = gost_ar_size;
            return true;
        }
        else {
        return false;}
    }

    @Override
    public T remove(int index) {
        if(index >= 0 && index < size){
            for(int i = index; i < size - 1; i++){
                this.array[i] = this.array[i+1];
            }
            array[size - 1] = null;
            size--;
        }
        return null;
    }

    @Override
    public void sort(Comparator<T> comparator) {

    }
}
