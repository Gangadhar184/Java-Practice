package ARRAYS;

/**
* Dynamic Array Implementation:
 * We can modify the size, and we have inbuilt methods
 * Should support all Integer, String, double etc ...

METHODS = add, add(int index, T value), get(int index), set(int index, T value), remove(int index, T value), contains(T value)

 for add - add element at the available index position , call ensureCapacity() []-> size = 2, add(1,3) => [1,3]->size = 2;
 add(index, T value), if we want to add at specific index in the middle of the array
  -> validate the index
  -> increase the capacity ensureCapacity()
  -> shift the elements to the right to insert the new value (int = size; i > index; i--)
  -> data[index] = value;
  -> increase the size , because when we add the at specific index the size will increase
 [1,2,3] -> call the ensureCapacity
 arr[2] = 22;
 new arr = [1,2,22,3] the 2 is shifted to right
 size is increased

 get - return the index we want -> (T) data[index]
 set (int index, T value) -> data[index] = value;

 remove(int index, T value)
 -> when we remove element from the array,  size will decrease and shift the elements to left
 ["A","B","C","D",null]
 remove B
 when we removed B
 ["A","null","C","D","null"] -> move elements to left for(int i = index; i < size - 1; i++) and we should avoid memory
 leaks  because removed object may still be referenced in memory
 ["A","C","D","null"]
 size all decreased size--;

 contains(T value) -> iterate and check with .equals

 and print()

 ensureCapacity() to increase the size of the array when it is filled,
 -> we need to create a new Object by increasing size and copy old data to new data; and update the data
 to copy we can use System.arrayCopy(data, 0, newData, 0, size)
* */


public class DynamicArray<T> {
    private Object[] data;
    private int size;

    private static  final int DEFAULT_CAPACITY = 4;

    public DynamicArray(){
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public int size(){
        return  size;
    }
    public boolean isEmpty(){
        return  size == 0;
    }
    public void clear(){
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public void add(T value){
        ensureCapacity();
        data[size++] = value;
    }
    public void add(int index, T value){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        for(int i = size; i > index; i--){
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }
    public T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }
    public void set(int index, T value){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        data[index] = value;
    }
    public T remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        T removed = (T) data[index];
        //shift left
        for(int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }
        data[size - 1] = null; // to avoid memory leak
        size --;
        return  removed;
    }
    public boolean contains(T value){
        for(int i = 0; i < size; i++){
            if(data[i].equals(value)){
                return true;
            }
        }
        return  false;
    }
    public void print(){
        System.out.print("[");
        for(int i = 0; i < size; i++){
            System.out.print(data[i] + " ");
            if(i < size - 1) {
                System.out.print(", ");
            }

        }
        System.out.print("]");
    }
    public void ensureCapacity(){
        if(size == data.length){
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

}
