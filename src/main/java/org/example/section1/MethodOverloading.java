package org.example.section1;

public class MethodOverloading {
    /** Method overloading is a polymorphism technique in which two or more methods have same
     method name but different parametrs in each method
     Compiler distinguish it by same method names and different parameters*/
    //method with two parameters and return its result
    static int add(int n1,int n2)
    {
        return n1+n2;

    }
    //method with three parameters and return its result
    static int add(int n1,int n2, int n3)
    {
        return n1+n2+n3;

    }
    public static void main(String[] args) {
        System.out.println(add(5,10));
        System.out.println(add(5,1,10));


    }
}
