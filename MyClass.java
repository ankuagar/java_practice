package com.ankur.javapractice;

public class MyClass {
    private int var = 34;
    private int val = 56;
    private void someMethod() {
        System.out.println("In someMethod of the class");
    }
}

abstract class Client {

    public static void main(String[] args) throws InterruptedException {
        MyClass ref = new MyClass();
        Client client = new Client();
        System.out.println("In client class");
        Thread.sleep(10000);
    }



}
