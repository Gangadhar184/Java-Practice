package ObjectOrientedProgramming.ClassesObjects;

//Nested and inner class usage

public class CompanyApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 1001);

        // Static Nested Class
        Employee.Department dept = new Employee.Department("Engineering");
        dept.showDepartmentInfo();

        // Member Inner Class
        Employee.Address addr = emp.new Address("Mumbai");
        addr.showAddress();

        // Local Inner Class
        emp.generateIDCard();

        // Anonymous Inner Class
        Logger logger = new Logger() {
            public void log(String message) {
                System.out.println("LOG: " + message);
            }
        };
        logger.log("Employee added to system.");
    }
}
