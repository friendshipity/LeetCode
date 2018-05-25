package myMethods;

/**
 * Created by Administrator on 2017/2/16.
 */
class Base {
    private void fun() {
       System.out.println("Base fun");
    }
}

class Derived extends Base {
    public void fun() {
        System.out.println("Derived fun");
    }

}
 class Main12 {
    public static void main(String[] args) {
        Base obj = new Derived();
  //     obj.fun(); //wrong
        Derived child = new Derived();
        child.fun();
    }

}