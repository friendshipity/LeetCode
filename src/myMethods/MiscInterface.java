package myMethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2017/2/16.
 */
class X {
    interface Yes {
        void show();
    }
}

class Xing implements X.Yes {
    public void show() {
        System.out.println("show method of interface");
    }
}

class A {
    public static void main(String[] args) {
        X.Yes obj;
        Xing t = new Xing();
        obj = t;
        obj.show();
    }
}

class Y {
    protected interface Yes {
        void show();
    }
}

class Ying implements Y.Yes {
    public void show() {
        System.out.println("show method of interface");
    }
}

class B {
    public static void main(String[] args) {
        Y.Yes obj;
        Ying t = new Ying();
        obj = t;
        obj.show();
    }
}


interface Z {
    interface Yes {
        void show();
    }
}

class Zing implements Z.Yes {
    public void show() {
        System.out.println("show method of interface");
    }
}

class C {
    public static void main(String[] args) {
        Z.Yes obj;
        Zing t = new Zing();
        obj = t;
        obj.show();
    }
}


class lambdaExpressionFunctionalInterface {
    public static void main(String args[]) {

        // lambda expression to create the object
        new Thread(() ->
        {
            System.out.println("New thread created");
        }).start();

        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created");
            }
        }).start();
    }
}


// Java program to demonstrate lamda expressions to implement
// a user defined functional interface.


interface Square {
    int calculate(int x);
}

class FunctionalInterface {
    public static void main(String args[]) {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}


class Predicater {
    public static void main(String args[]) {

        // create a list of strings
        List<String> names =
                Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s) -> s.startsWith("G");

        // Iterate through the list
        for (String st : names) {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }
    }
}

