package myMethods;

/**
 * Created by Administrator on 2017/2/16.
 */
// Java program to demonstrate working of
// reverseOrder(Comparator c) to sort students in descending
// order of roll numbers when there is a user defined comparator
// to do reverse.
import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent a student.
class Student
{
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}

// Driver class
class Main
{
    public static void main (String[] args)
    {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting a list of students in descending order of
        // roll numbers using a Comparator that is reverse of
        // Sortbyroll()
        Comparator c = Collections.reverseOrder(new Sortbyroll());
        Collections.sort(ar, c);

        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
}