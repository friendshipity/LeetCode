package myMethods;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2017/2/16.
 */
public class testQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        Queue<Integer> queue1 = new LinkedList<>();

        queue1 = queue;
        System.out.println(queue1.size());
        while(queue.size()>0){
            queue.poll();
        }

        System.out.println(queue1.size());


    }

}
