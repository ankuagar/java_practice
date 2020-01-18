package com.ankur.javapractice;

public class SuperClass {
    public int someMethod() throws Exception {
        System.out.println("Public method in SuperClass");
        return 2;
    }
    public static void main(String[] args) throws Exception {
        SuperClass superClassRef = new SubClass();
        SubClass subClassRef = new SubClass();
        superClassRef.someMethod();
        subClassRef.someMethod();
    }

}

class SubClass extends SuperClass {
    public Integer someMethod() throws Exception {
        System.out.println("Public method in SubClass");
        return 1;
    }
}
