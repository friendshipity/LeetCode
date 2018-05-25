import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Administrator on 2017/2/15.
 */
public class FlattenBinaryTreetoLinkedList114 {
    private TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
    public void flatten2(TreeNode root) {
        if(root==null)return;
        Queue<TreeNode> ordered = new LinkedList<>();
        ordered = preOrder(root,ordered);
        TreeNode temRoot =ordered.poll();
        root.left=null;
        root.val=temRoot.val;
        while(!ordered.isEmpty()){
            root.right=ordered.poll();
            root = root.right;
        }

        System.out.println(root.val);
    }
    public  Queue<TreeNode> preOrder(TreeNode node,Queue<TreeNode> queue){
        TreeNode cleanNode = new TreeNode(node.val);
        queue.offer(cleanNode);
        if(node.left!=null)
            queue=preOrder(node.left,queue);
        if(node.right!=null)
            queue=preOrder(node.right,queue);
        return queue;
    }
        public static void main(String[] args){

            //int[] in = {1,2, 5, 3, 4, 6, 7};
            int[] in = {7,6,3,5,4,2,1};
            // int[] in = {};
            TreeNode root = treeGen.gen(in);
            FlattenBinaryTreetoLinkedList114 flatten = new FlattenBinaryTreetoLinkedList114();
            flatten.flatten2(root);


            System.out.println(root.val);

        }

}
