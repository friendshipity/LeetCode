package myMethods;

/**
 * Created by Administrator on 2017/2/16.
 */



 class Complex2 {

        private double re, im;
        // A normal parametrized constructor
        public Complex2(double re, double im) {
            this.re = re;
            this.im = im;
        }

        // copy constructor
        Complex2(Complex2 c) {
            System.out.println("Copy constructor called");
            re = c.re;
            im = c.im;
        }

        // Overriding the toString of Object class
        @Override
        public String toString() {
            return "(" + re + " + " + im + "i)";

        }



    public static void main(String[] args) {
        Complex2 c1 = new Complex2(10, 15);

        // Following involves a copy constructor call
        Complex2 c2 = new Complex2(c1);

        // Note that following doesn't involve a copy constructor call as
        // non-primitive variables are just references.
        Complex2 c3 = c2;

        System.out.println(c2); // toString() of c2 is called here
    }

}
