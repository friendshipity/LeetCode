import java.util.Stack;

/**
 * Created by Administrator on 2017/2/15.
 */
public class InvertBinaryTree226 {
    public TreeNode invertTree2(TreeNode root) {
        Stack<TreeNode> stack =new Stack<>();
        if(root==null)
            return null;
        stack.push(root);
        int stackSize = stack.size();
        while(stackSize>0){
            while(stackSize-->0) {
                TreeNode tmp =stack.pop();
                if (tmp.left != null)
                    stack.push(tmp.left);
                if(tmp.right!=null)
                    stack.push(tmp.right);

                TreeNode childTmp = tmp.left;

                tmp.left=tmp.right;
                tmp.right=childTmp;
            }
            stackSize=stack.size();

        }

        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}
