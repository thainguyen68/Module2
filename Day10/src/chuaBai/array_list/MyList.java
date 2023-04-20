package bai10.array_list;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        if (index >= 0 && index <= size) {
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        Object e = elements[index];
        if (index < size) {
            Object[] objects = new Object[elements.length];
            System.arraycopy(elements, 0, objects, 0, index);
            System.arraycopy(elements, index + 1, objects, index, size - index - 1);
            size--;
            elements = objects;
            return (E) e;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E element) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        Object[] objects = new Object[elements.length + minCapacity];
        System.arraycopy(elements, 0, objects, 0, size);
        elements = objects;
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return (E) elements[index];
        }
        return null;
    }

    public void clear() {
        elements = new Object[10];
        size = 0;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Không có phần tử nào cả");
        } else {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                if (i == size - 1) {
                    System.out.print(elements[i]);
                } else {
                    System.out.print(elements[i] + ", ");
                }
            }
            System.out.print("]\n");
        }
    }
}
