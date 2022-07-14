package ss10_DSA.bai_tap;

import java.util.Arrays;

public class Mylist<E> {
    public int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public Mylist(int capacity) {

    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else
            throw new IllegalArgumentException("minCapacity" + minCapacity);
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    public boolean contain(E element) {
        return this.indexOf(element) >= 0;
    }

    public Mylist<E> clone() {
        Mylist<E> v = new Mylist<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = this.size;
        return v;
    }


    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Index " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

}
