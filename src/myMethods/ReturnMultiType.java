package myMethods;

/**
 * Created by Administrator on 2017/2/16.
 */
class MultiDiv
{
    int mul;    // To store multiplication
    double div; // To store division
    MultiDiv(int m, double d)
    {
        mul = m;
        div = d;
    }
}

class Test
{
    static MultiDiv getMultandDiv(int a, int b)
    {
        // Returning multiple values of different
        // types by returning an object
        return new MultiDiv(a*b, (double)a/b);
    }

    // Driver code
    public static void main(String[] args)
    {
        MultiDiv ans = getMultandDiv(10, 20);
        System.out.println("Multiplication = " + ans.mul);
        System.out.println("Division = " + ans.div);
    }
}