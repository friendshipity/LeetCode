import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Administrator on 2017/2/15.
 */
public class SymmetricTree101 {
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> rights = new LinkedList<>();
        Stack<TreeNode> lefts = new Stack<>();
        queue.offer(root);
        int queueSize = 1;
        while (queueSize > 0) {
            while (queueSize-- > 0) {
                TreeNode tmpNode = queue.poll();
                if (tmpNode.left != null) {
                    queue.offer(tmpNode.left);
                    lefts.push(tmpNode.left);

                } else {
                    lefts.push(null);
                }
                if (tmpNode.right != null) {
                    queue.offer(tmpNode.right);
                    rights.offer(tmpNode.right);
                } else {
                    rights.offer(null);
                }

            }

            while (!rights.isEmpty()) {
                TreeNode right = rights.poll();
                TreeNode left = lefts.pop();
               if(right!=null && left!=null){
                   if(right.val!=left.val)
                       return false;
               }
                else {
                   if (right == null && left == null) {
                       continue;
                   } else {
                       return false;
                   }
               }
            }

            queueSize = queue.size();
        }
        return true;
    }

    public boolean isSymmetric2(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.empty()) {
            TreeNode n1 = stack.pop(), n2 = stack.pop();
            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null || n1.val != n2.val) return false;
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
        return true;
    }
    public static void main(String[] args){

        int[] in = {1, 2, 2, 3, 4, 4, 3};
        TreeNode root = treeGen.gen(in);
        System.out.println(isSymmetric(root));
    }
}
