import java.util.*;

/**
 * Created by Administrator on 2017/2/15.
 */
public class BinaryTreeZigzagLevelOrderTraversal103 {

    public   List<List<Integer>> zigzagLevelOrder2(TreeNode root) {//a one pass approach
        List<List<Integer>> res = new ArrayList();
        travel(res, 0, root);
        return res;
    }
    private void travel(List<List<Integer>> res, int level, TreeNode cur) {
        if (cur == null) return;
        if (res.size() <= level) {
            res.add(new ArrayList<Integer>());
        }
        if (level % 2 == 0) {
            res.get(level).add(cur.val);
        }   else {
            res.get(level).add(0, cur.val);// add in the reverse direction
        }
        travel(res, level + 1, cur.left);
        travel(res, level + 1, cur.right);
    }


    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> outs = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int queueSize = root == null ? 0 : 1;
        boolean invere = false;
        List<Integer> root1= new ArrayList<>();
        root1.add(root.val);
        outs.add(root1);

        while (queueSize > 0) {
            invere = !invere;
            while (queueSize-- > 0) {
                TreeNode Node = queue.poll();
                if (Node.left != null)
                    queue.add(Node.left);
                if (Node.right != null)
                    queue.add(Node.right);
            }

            queueSize = queue.size();
            if (queueSize > 0) {
                List<Integer> out = new ArrayList<>();
                Queue<TreeNode> tmpQ = new LinkedList<>(queue);
                if (invere) {
                    Stack<TreeNode> stack = new Stack<>();
                    while (!tmpQ.isEmpty()) {
                        stack.push(tmpQ.poll());
                    }
                    while (!stack.isEmpty()) {
                        out.add(stack.pop().val);
                    }
                } else {
                    while (!tmpQ.isEmpty()) {
                        out.add(tmpQ.poll().val);
                    }
                }
                outs.add(out);
            }
        }

        return outs;
    }

    public static void main(String[] args) {


        int[] in = {1, 2, 3, 4, 5, 6, 7};
        // int[] in = {};
        TreeNode root = treeGen.gen(in);
        BinaryTreeZigzagLevelOrderTraversal103 btz = new BinaryTreeZigzagLevelOrderTraversal103();
        List<List<Integer>> outs = btz.zigzagLevelOrder2(root);
        System.out.println(outs.toString());
    }
}
