package ObjectOrientedProgramming.ClassesObjects;
//nested classes

/**
 * Static nested class and InnerClass(nonstatic)
 * static nested class is a class defined inside other class with static modifier
 * it doesn't have access to the instance members of the outer classes
 *
 * Non-static Inner class ( A member inner class is declared inside a class without static keyword)
 * Has access to all members (even private) of the outer class instance.
 */
//class Outer1{
//    static int x= 10;
//     static class StaticNested {
//         void showw(){
//             System.out.println("x = "+x); //can access static members
//         }
//         //Use when the nested class doesn’t need access to the instance state of the outer class
//     }
//}
//
//class Outer2{
//    private int x = 5;
//
//    class Innwer{
//        void show(){
//            System.out.println("x = " + x); // access outer class instance var
//        }
//        //When the inner class needs access to instance members of the outer class.
//    }
//}


public class Employee {
//
//    public static void main(String[] args) {
//        Outer2 oo = new Outer2();
//        Outer2.Innwer inn = oo.new Innwer();
//        inn.show();
//    }

    private String name;
    private int id;
    private static String companyName = "acb";

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // static nested class
    static class Department {
        private String deptName;
        Department(String deptName) {
            this.deptName = deptName;
        }
        void showDepartmentInfo() {
            System.out.println("Company: " + companyName);
            System.out.println("Department: " + deptName);
        }
    }

    //Memeber inner class
    class Address {
        private String city;

        Address(String city){
            this.city = city;
        }
        void showAddress() {
            System.out.println(name + " lives in " + city);
        }
    }

    //method with local innerclass

    void generateIDCard() {
        String cardType = "PERMANENT";
        class IDCard {
            void printCard() {
                System.out.println("ID card for " + name + " [Type: " + cardType + "]" );

            }
        }
        IDCard card = new IDCard();
        card.printCard();
    }
}

//anonymous inner class usage
interface Logger {
    void log(String message);
}

