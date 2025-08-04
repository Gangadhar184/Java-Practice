package ARRAYS;

public class ArrayList {
    public static void main(String[] args) {
        DynamicArray<String> list = new DynamicArray<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.print();

        list.add(1, "X");
        list.print();

        list.set(2,"Y");
        list.print();

        System.out.println("REMOVED: " + list.remove(1) );
        list.print();

        System.out.println("Contains 'T' " + list.contains("T"));
        System.out.println("GET index 0 " + list.get(0));

        list.clear();
        System.out.println("IS empty? " + list.isEmpty());
        list.print();
    }
}
