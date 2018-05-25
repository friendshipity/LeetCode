package myMethods;

/**
 * Created by Administrator on 2017/2/16.
 */


class Complex {

    private double re, im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true

        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Complex)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Complex c = (Complex) o;
        System.out.print("here");
        // Compare the data members and return accordingly
        return Double.compare(re, c.re) == 0
                && Double.compare(im, c.im) == 0;
    }


    // Driver class to test the Complex class

    /* Returns the string representation of this Complex number.
          The format of string is "Re + iIm" where Re is real part
          and Im is imagenary part.*/
    @Override
    public String toString() {
        return String.format(re + " + i" + im);
    }


    public  static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 14);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
        System.out.print(c1);
    }
}


