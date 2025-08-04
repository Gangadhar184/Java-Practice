package ARRAYS;

/**

* This is implementation of static array
    - Array : An array is a container object that holds a fixed number of values of single data type.
                Can be primitive type or reference type or custom classes
                size is fixed and must be defined when it is created
 */


public class MyArray {
    private int[] data;
    private int size;

    public MyArray(int capacity){
        data = new int[capacity];
        size = 0;
    }
    //add elements at available index positions
    public void add(int value){
        if(size == data.length){
            throw new RuntimeException("Array is full");
        }
        data[size++] = value;
    }

    // get
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    //set the element at the index;
    public void set(int index, int value){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        data[index] = value;
    }
    //print
    public void print(){
        for(int i = 0; i < size; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

