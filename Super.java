import java.util.*; 

class Person{
    String role = "Person";
    Person(String name){
        System.out.println("Person constructor: name = "+name); 
    }
    void displayRole(){
        System.out.println("Role: " + role);
    }
}
class Employee extends Person{
    String role = "Employee"; 
    Employee(String name, String dept){
        super(name);
        System.out.println("Employee constructor dept = "+ dept);
    }
    void displayRole(){
        super.displayRole();
        System.out.println("Role from employee = " + role); 
    }
}
class Manager extends Employee{
    String role = "Manager";
    Manager(String name, String dept, int teamSize){
        super(name,dept);
        System.out.println("Manager constructor : Team size = "+teamSize);
    }
    void displayRole(){
        super.displayRole();
        System.out.println("Role from manager = " + role); 
    }
    void showAllRoles(){
        System.out.println("Manager's Role : " + role);
        System.out.println("Employee's Role : " + super.role);
        System.out.println("Person's Role : " + ((Person)this).role);
    }
}
public class Super{
   public static void main(String args[]){
  Manager obj = new Manager("Alice","IT",5);
  obj.displayRole();
  obj.showAllRoles();
}
}

