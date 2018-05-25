package myMethods;

import java.util.*;

/**
 * Created by Administrator on 2017/2/16.
 */
public class NavigabelSetDemo {


    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        // Get a reverse view of the navigable set
        NavigableSet<Integer> reverseNs = ns.descendingSet();

        // Print the normal and reverse views
        System.out.println("Normal order: " + ns);
        System.out.println("Reverse order: " + reverseNs);

        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
        System.out.println("3 or  more:  " + threeOrMore);
        System.out.println("lower(3): " + ns.lower(3));
        System.out.println("floor(3): " + ns.floor(3));
        System.out.println("higher(3): " + ns.higher(3));
        System.out.println("ceiling(3): " + ns.ceiling(3));

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollLast(): " + ns.pollLast());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("pollLast(): " + ns.pollLast());
    }

}
class NavigableMapDemo
{
    public static void main(String[] args)
    {
        NavigableMap<String, Integer> nm =
                new TreeMap<String, Integer>();
        nm.put("C", 888);
        nm.put("Y", 999);
        nm.put("A", 444);
        nm.put("T", 555);
        nm.put("B", 666);
        nm.put("A", 555);

        System.out.printf("Descending Set  : %s%n",
                nm.descendingKeySet());
        System.out.printf("Floor Entry  : %s%n",
                nm.floorEntry("L"));
        System.out.printf("First Entry  : %s%n",
                nm.firstEntry());
        System.out.printf("Last Key : %s%n",
                nm.lastKey());
        System.out.printf("First Key : %s%n",
                nm.firstKey());
        System.out.printf("Original Map : %s%n", nm);
        System.out.printf("Reverse Map : %s%n",
                nm.descendingMap());
    }
}
class PriorityQueueDemo
{
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<String> pQueue =
                new PriorityQueue<String>();

        // Adding items to the pQueue
        pQueue.add("C");
        pQueue.add("C++");

        pQueue.add("Java");
        pQueue.add("Python");


        // Printing the most priority element
        System.out.println("Head value using peek function:"
                + pQueue.peek());

        // Printing all elements
        System.out.println("The queue elements:");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        // Removing the top priority element (or head) and
        // printing the modified pQueue
        pQueue.poll();
        System.out.println("After removing an element" +
                "with poll function:");
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());

        // Removing Java
        pQueue.remove("Java");
        System.out.println("after removing Java with" +
                " remove function:");
        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next());

        // Check if an element is present
        boolean b = pQueue.contains("C");
        System.out.println ( "Priority queue contains C" +
                " or not?: " + b);

        // get objects from the queue in an array and
        // print the array
        Object[] arr = pQueue.toArray();
        System.out.println ( "Value in array: ");
        for (int i = 0; i<arr.length; i++)
            System.out.println ( "Value: " + arr[i].toString()) ;
    }
}