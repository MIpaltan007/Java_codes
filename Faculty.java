import java.util.*;
public class Faculty extends Employee{
    public static void main(String args[]){
       new Faculty();
    }
        public Faculty(){
            System.out.println("(4) Performs Faculty Tasks");
        }
    }
    class Employee extends Person {
        public Employee(){
            this("(2) Invoke Employee's Overloaded Constructor");
            System.out.println("(3) PErforms Employee's Tasks");
        }
        public Employee(String s){
            System.out.println(s);
        }
    }
    class Person{
        public Person(){
            System.out.println("(1) Performs Person's tasks");
        }
    }

