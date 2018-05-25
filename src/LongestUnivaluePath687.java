/**
 * Created by Administrator on 2017/11/7.
 */
public class LongestUnivaluePath687 {
    //todo
    public static int longestUnivaluePath(TreeNode root) {
        int[] res = new int[1];
        if (root != null) dfs(root, res);
        return res[0];
    }

    private static int dfs(TreeNode node, int[] res) {
        int l = node.left != null ? dfs(node.left, res) : 0;
        int r = node.right != null ? dfs(node.right, res) : 0;
        int resl = node.left != null && node.left.val == node.val ? l + 1 : 0;
        int resr = node.right != null && node.right.val == node.val ? r + 1 : 0;
        res[0] = Math.max(res[0], resl + resr);
        return Math.max(resl, resr);
    }



    public static void main(String[] args) {
//        int[] in = {1, 2, 2, 3, 4, 4, 3};
        int[] in = {1,4,5,4,4,5,5};
        int[] in1 = {4,4,5,4,4,4,4};
        TreeNode root = treeGen.genManual2(in1);
      //  System.out.println("123");
        int res  =longestUnivaluePath(root);
        System.out.println("123");
    }
}
