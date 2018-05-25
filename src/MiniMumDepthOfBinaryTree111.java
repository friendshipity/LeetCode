/**
 * Created by Administrator on 2017/11/7.
 */
public class MiniMumDepthOfBinaryTree111 {
    // baseline
    //global
    int minDepth = 100;
    public  int minDepth(TreeNode root) {
        if(root!=null){
         minDepth(root,1);
        return minDepth;}
        else return 0;
    }
    public int minDepth(TreeNode root,int depth) {
        if(root.left!=null) depth = minDepth(root.left,depth++);
        if(root.right!=null) depth = minDepth(root.right,depth++);
        else {
            if(depth<minDepth)
                minDepth = depth;

        }
        return depth;
    }



    public static void main(String[] args){
        int[] in = {1, 2, 3, 4, 5, 6, 7};
        int[] in1 = {1, 2, 3, 4};
        int[] in2 = {1, 2};
        // int[] in = {};
//        TreeNode root = treeGen.genManual(in);
        TreeNode root = treeGen.genManual1(in);
        TreeNode root1 = treeGen.gen(in);
        System.out.println("123");

        TreeNode root2 = new TreeNode(in2[0]);
        root2.left = new TreeNode(Integer.valueOf(in2[1]));
       // root2.right = new TreeNode(Integer.valueOf(in1[2]));
       // root2.left.left = new TreeNode(Integer.valueOf(in1[3]));




        MiniMumDepthOfBinaryTree111 miniMumDepthOfBinaryTree111 = new MiniMumDepthOfBinaryTree111();
        int min = miniMumDepthOfBinaryTree111.minDepth(root1);
        System.out.println("123");

    }
}
