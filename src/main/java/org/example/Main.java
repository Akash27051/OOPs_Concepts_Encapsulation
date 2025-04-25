package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//     to access the fields of the any class we have create object of that class
        WithoutEncapsulation withoutEncapsulation = new WithoutEncapsulation();
//       in the class "WithoutEncapsulation" when this fields like id, name, gender etc are public, then we
//        can call them directly.
        System.out.println(withoutEncapsulation.id);
        System.out.println(withoutEncapsulation.name);
        System.out.println(withoutEncapsulation.age);
        System.out.println(withoutEncapsulation.gender);
        System.out.println(withoutEncapsulation.salary);

        System.out.println("===================================================");
//        But in the class "Encapsulation" these fields are private, so nobudy outsider of class
//        is able to access them. That's why we created some public getters and setter methods
//        in the class to access this private member

        Encapsulation encapsulation = new Encapsulation();

//        System.out.println(encapsulation.id);
        System.out.println(encapsulation.getId());
//        System.out.println(encapsulation.name);
        System.out.println(encapsulation.getName());
//        System.out.println(encapsulation.age);
        System.out.println(encapsulation.getAge());
//        System.out.println(encapsulation.gender);
        System.out.println(encapsulation.getGender());
//        System.out.println(encapsulation.salary);
        System.out.println(encapsulation.getSalary());




    }
}