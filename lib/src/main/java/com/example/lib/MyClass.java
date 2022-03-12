package com.example.lib;

public class MyClass {

    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        String name = "CodeHustler";
        System.out.println("Welcome To "+name);

        //if-else

        //Loops: while, for and do-while

        // Functions
        int val = sum(5,15);
        System.out.println(val);

//        OOPS ex1 = new OOPS();
//        ex1.method1();
//        System.out.println(ex1.x);

        //Inheritance

//        newClass n1 = new newClass();
//        n1.method1();
//        n1.method2();

        // Arrays
        int marks[]={5,10,15,20};
        for (int i=0;i< marks.length;i++){
            System.out.println("The "+(i+1)+" element is "+marks[i]);
        }

        //ArrayList
    }
}