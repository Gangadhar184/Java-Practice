package ObjectOrientedProgramming.AccessModifiers;

/**
 * access modifiers: these are security guards for code. They control who can access what parts
    of your program. Think them as setting boundaries around your code components

 The Core Concept: Encapsulation:
    The fundamental principle is encapsulation- Hiding internal implementation details while exposing only what necessary
    eg; For car: we can use steering wheel and pedals (public interface) but cant directly access the engine internals(private)

 Three Main Access Modifiers

 1. Private - The vault -> When to use -> the internal implementation details that should never be accessed from outside
                                            class (hide complexity and enable changes)
 2. Protected - The Family Circle --> For functionality that subclasses need to access or modify, but external classes
                                        shouldn't (allow controlled inheritance)
 3. Public - The Open Door -> For the official interface of your class - methods and fields that external code should use
 (only expose what's absolutely necessary)

 */

class BankAccount {
    private double balance;
    private String accountNumber;

    private void ValidateTransaction(double amt){
        // internal valid logic - Nobody else should call this
    }
}

class Vehicle {
    protected String engine; // subclasses and same package can access
    protected void startEngine() {
        //child classes can override or use this
    }
}
class Car extends Vehicle{
    public void drive() {
        startEngine(); //can access parent's protected method
    }
}

class Calculator{
    public int add(int a, int b) {
        //anyone can call this
        return a+b;
    }
    public static final double PI = 3.14159;
}

public class Main {

}
