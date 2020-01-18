package com.ankur.javapractice;

public class OuterClass {

    private int a;
    private static int static_a = 100;

    public OuterClass(int a) {
        this.a = a;
    }
    public int getA() {
        return this.a;
    }
    public void getStaticA() {

        System.out.println(this.static_a);
    }

    public static class StaticNestedClass {

        private int b;
        public StaticNestedClass(int b) {
            this.b = b;
        }
        public int getB() {
            return this.b;
        }

    }

}
