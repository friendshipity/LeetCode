package myMethods;

/**
 * Created by Administrator on 2017/2/16.
 */
public class MethodOverloadingAndNullError {
    public void fun(Integer i)
    {
        System.out.println("fun(Integer ) ");
    }
    public void fun(String name)
    {
        System.out.println("fun(String ) ");
    }

    // Driver code
    public static void main(String [] args)
    {
        MethodOverloadingAndNullError mv = new MethodOverloadingAndNullError();

        // This line causes error
     //   mv.fun(null);

        Integer arg = null;

        // No compiler error
        mv.fun(arg);
    }
}
