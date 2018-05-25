import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/13.
 */
public class BinaryTreePreorderTraversal144 {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res =  new ArrayList<>();
        if(root==null)
            return res;
        res  = pot(root,res);
        return res;
    }

    public static List<Integer> pot(TreeNode node,List<Integer> res){
        if(node!=null){
            res.add(node.val);
        }
        if(node.left!=null){
            res =pot(node.left,res);
        }
        if(node.right!=null){
            res = pot(node.right,res);
        }

        return res;
    }


    public static void main(String[] args){
        int[] num = {1, 2, 3};
        TreeNode root = new TreeNode(num[0]);
        root.right = new TreeNode(Integer.valueOf(num[1]));
        root.right.left = new TreeNode(Integer.valueOf(num[2]));

        int[] in = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root2 = treeGen.gen(in);

        BinaryTreePreorderTraversal144 btpt = new BinaryTreePreorderTraversal144();
        List<Integer> res = btpt.preorderTraversal(root2);
        System.out.println("123");
    }
}
