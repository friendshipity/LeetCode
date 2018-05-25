import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Administrator on 2017/2/14.
 */
public class MaximumDepthofBinaryTree104 {
    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int maxD = 0;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> order = new Stack<>();
        stack.push(root);
        order.push(1);
        while(!stack.isEmpty()){
            TreeNode tmp = stack.pop();
            int tmpOrder = order.pop();

            if(tmpOrder>maxD)
                maxD=tmpOrder;

            if(tmp.left!=null) {
                stack.push(tmp.left);
                order.push(tmpOrder+1);
            }
            if(tmp.right!=null) {
                stack.push(tmp.right);
                order.push(tmpOrder + 1);
            }
        }

        return maxD;


    }
    public int maxDepth2(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth2(root.left),maxDepth2(root.right));
    }


    public static void testStack(){
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push(null);
        System.out.println(stack.toString());
        System.out.println(stack.pop()==null);

        System.out.println(stack.toString());

    }

    public static void main(String[] args){
        int[] in = {1, 8, 2, 5, 10, 3, 9};
        TreeNode root = treeGen.gen(in);
       // System.out.println(MaximumDepthofBinaryTree104.maxDepth(root));
        testStack();

    }
}
