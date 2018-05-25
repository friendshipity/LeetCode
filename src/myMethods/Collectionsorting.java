package myMethods;

import java.util.*;

/**
 * Created by Administrator on 2017/2/16.
 */
public class Collectionsorting {
    public static void main(String[] args)
    {

        //array list
        // Create a list of Integers
        ArrayList<Integer> al = new ArrayList<Integer>();
      //  Queue<Integer> al = new LinkedList<>();
        al.add(30);
        al.add(20);
        al.add(10);
        al.add(40);
        al.add(50);

        /* Collections.sort method is sorting the
        elements of ArrayList in descending order. */
        Collections.sort(al, Collections.reverseOrder());

        // Let us print the sorted list
        System.out.println("List after the use of Collection.reverseOrder()"+
                " and Collections.sort() :\n" + al);


//array
        Integer [] arr = {30, 20, 40, 10};

        /* Collections.sort method is sorting the
        elements of arr[] in descending order. */
        Arrays.sort(arr, Collections.reverseOrder());

        // Let us print the sorted array
        System.out.println("Array after the use of Collection.reverseOrder()"+
                " and Arrays.sort() :\n" + Arrays.toString(arr));
    //list
        List<String>  mylist = new ArrayList<String>();
        mylist.add("code");
        mylist.add("practice");
        mylist.add("quiz");
        mylist.add("geeksforgeeks");

        System.out.println("Original List : " + mylist);

        // Here we are using reverse() method
        // to reverse the element order of mylist
        Collections.reverse(mylist);

        System.out.println("Modified List: " + mylist);

        //array


            // Let us create a list of strings
            Integer arr1[] = {10, 20, 30, 40, 50};

            System.out.println("Original Array : " +
                    Arrays.toString(arr1));

            // Please refer below post for details of asList()
            // http://www.geeksforgeeks.org/array-class-in-java/
            Collections.reverse(Arrays.asList(arr1));

            System.out.println("Modified Array : " +
                    Arrays.toString(arr1));



    }
}
