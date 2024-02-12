package de.telran.module_2.hw_07_20240206.task1;

public class DynamicIntArray {
    private int length;
    private int capacity;
    private int[] arr;

    private static final int DEFAULT_CAPACITY = 10;
    private static final double PROCENT_CHANGE = 0.5;
    public DynamicIntArray() {
        this(DEFAULT_CAPACITY);
    }


    public DynamicIntArray(int initCapacity) {
        if (initCapacity <= 0) {
            System.out.println("Размер массива должен быть положительным");
        }
        this.length = 0;
        this.capacity = initCapacity;
        this.arr = new int[initCapacity];
    }
    // Добавление элемента в конец массива
    public void add(int element) {
        acceptCapacity();
        arr[length] = element;
        length++;
    }
    // Добавление массива элементов в конец массива
    public void add(int[] elements){
        for (int element : elements) {
            add(element);
        }
    }

    // добавление в указанное место
    public void insert(int index, int element){
        if (index < 0 || index > length){
            System.out.println("Недопустимый индекс");
        }
        acceptCapacity();

        for (int i = length; i > index ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        length++;
    }
    // удаление элемента
    public void delete(int index){
        if (index < 0 || index >= length){
            System.out.println("Недопустимый индекс");
        }
        for (int i = index; i < length - 1; i++) {
            arr[i] = arr[ i + 1];
        }
        length--;
    }


    //получение элемента по индексу
    public int get(int index){
        if (index < 0 || index >= length){
            System.out.println("Недопустимый индекс");
        }
        return arr[index];
    }


    private void acceptCapacity() {
        if (length == capacity){
            int newCapacity = (int) (capacity * (1 + PROCENT_CHANGE));
            int[] newArr = new int[newCapacity];
            System.arraycopy(arr, 0, newArr, 0, length);
            arr = newArr;
            capacity = newCapacity;
        }
    }


    public int getLength() {
        return length;
    }
}
