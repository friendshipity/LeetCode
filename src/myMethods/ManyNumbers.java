package myMethods;

/**
 * Created by Administrator on 2017/2/16.
 */
public class ManyNumbers {
    // A method that takes variable number of intger
    // arguments.
    static void fun(int ...a)
    {
        System.out.println("Number of arguments is: " + a.length);

        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i + " ");
        System.out.println();
    }
//    void method1(String... gfg, int... q) //compile error
//    {
//        // Compile time error as there are two
//        // varargs
//    }
    void method2( String q,int... gfg)
    {
        // Compile time error as vararg appear
        // before normal argument
    }
//    void method3(int... gfg, String q) //compile error
//    {
//        // Compile time error as vararg appear
//        // before normal argument
//    }

    // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with different number
        // of parameters
        fun(100);         // one parameter
        fun(1, 2, 3, 4);  // four parameters
        fun();            // no parameter
    }
}
