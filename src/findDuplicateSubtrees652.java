import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Administrator on 2017/11/7.
 */
public class findDuplicateSubtrees652 {

    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> dupNodes =new ArrayList<>();
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");


        return dupNodes;
    }
    public static void main(String[] args){
        int[] in = {1, 8, 2, 5, 10, 3, 9};
        // int[] in = {};
        TreeNode root = treeGen.gen(in);
        findDuplicateSubtrees(root);

    }
}
