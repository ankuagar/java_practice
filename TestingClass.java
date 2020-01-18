package com.ankur.javapractice;


public class TestingClass {

    public static void main(String[] args) {

        OuterClass oc = new OuterClass(3);
        System.out.println(oc.getA());
        oc.getStaticA();

        OuterClass.StaticNestedClass snc = new OuterClass.StaticNestedClass(4);
        System.out.println(snc.getB());

        // StaticClass sc = new StaticClass(3,4);
        // System.out.println(sc.sum());

    }

}
