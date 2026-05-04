package org.DesignPatterns;

public class Main {
    public static void main(String[] args) {
       B b = new B();
       A a = b.a;
       a.methodA();
    }
}

class A {
    public void methodA(){
        System.out.println("Method A");
    }
}

class B {
    A a;
    public B(){
        a = new A();
    }

    public void methodB(){
        System.out.println("Method B");
    }
}