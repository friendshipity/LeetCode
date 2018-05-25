import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Administrator on 2017/11/8.
 */
public class BinaryTreePath257 {
    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new ArrayList<>();
        if(root==null)
            return paths;



        Queue<TreeNode> queue = new ArrayDeque<>();
        List<String> candidates = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++){

                TreeNode node = queue.poll();
                int val = node.val;
                if(node.left!=null){queue.offer(node.left);
                    candidates.add(String.valueOf(val)+"_"+node.left.val);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                    candidates.add(String.valueOf(val)+"_"+node.right.val);
                }

            }

        }





        return paths;
    }
    public void binaryTreePaths1(TreeNode root){

    }

    public static void main(String[] args) {
        int[] in1 = {1, 2, 3, 4};
        TreeNode root2 = new TreeNode(in1[0]);
        root2.left = new TreeNode(Integer.valueOf(in1[1]));
        root2.right = new TreeNode(Integer.valueOf(in1[2]));
        root2.left.right = new TreeNode(Integer.valueOf(in1[3]));


        int[] in2  ={1,2,3,4,5,6,7};
        TreeNode root1 = treeGen.gen(in2);
        binaryTreePaths(root1);

    }
}
