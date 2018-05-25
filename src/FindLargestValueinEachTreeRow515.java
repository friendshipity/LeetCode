import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Administrator on 2017/2/14.
 */
public class FindLargestValueinEachTreeRow515 {


    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> out = new ArrayList<>();
        queue.add(root);
        int tmpQSize = root==null? 0:1;
        while (tmpQSize > 0) {

            int tmpMax = 0;
            TreeNode tmpNode;
            while (tmpQSize-- > 0) {
                tmpNode = queue.poll();
                if (tmpNode != null) {
                    if (tmpNode.val > tmpMax)
                        tmpMax = tmpNode.val;
                    if (tmpNode.left != null)
                        queue.add(tmpNode.left);

                    if (tmpNode.right != null)
                        queue.add(tmpNode.right);
                }
            }
            tmpQSize = queue.size();
            out.add(tmpMax);
        }
        return out;
    }


    public void test(int[] in) {
        Queue<Integer> queue = new LinkedList<>();
        for (Integer member : in) {
            queue.add(member);
        }
        System.out.println(queue.size());
        System.out.println(queue.toString());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.toString());


    }



    public static void main(String[] args) {
        FindLargestValueinEachTreeRow515 finder = new FindLargestValueinEachTreeRow515();
        int[] in = {1, 8, 2, 5, 10, 3, 9};
       // int[] in = {};
        TreeNode root = treeGen.gen(in);
        List<Integer> out = finder.largestValues(root);
        for (int member : out) {
            System.out.println(member);
        }

       finder.test(in);


    }
}
