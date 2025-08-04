package ObjectOrientedProgramming.ClassesObjects;

// Objects passed by value of reference

class BOX{
    int value;
}
class Modifier{
    void modify(BOX b){
        b.value = 99;
    }
}

public class CallByRef {
    public static void main(String[] args) {
        BOX b1 = new BOX();
        b1.value = 42;

        Modifier m = new Modifier();
        m.modify(b1);

        System.out.println(b1.value);
    }
}
