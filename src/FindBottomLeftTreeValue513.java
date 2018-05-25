import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;


/**
 * Created by Administrator on 2017/2/14.
 */
public class FindBottomLeftTreeValue513 {

    public static int findBottomLeftValue1(TreeNode root) {
        return findBottomLeftValue1(root, 1, new int[]{0,0});
    }
    public static int findBottomLeftValue1(TreeNode root, int depth, int[] res) {
        if (res[1]<depth) {res[0]=root.val;res[1]=depth;}
        if (root.left!=null) findBottomLeftValue1(root.left, depth+1, res);
        if (root.right!=null) findBottomLeftValue1(root.right, depth+1, res);
        return res[0];
    }
    public static int findBottomLeftValueDFS(TreeNode root) {
        /*any initial value is valid*/
        int result = -1;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            result = queue.peek().val;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
        }
        return result;
    }

    public static int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int queueSize = root == null? 0:1;
        int leftMost = 0;
        int leftMostPos = 0;
        while(queueSize>0) {
            TreeNode tmpNode;
            leftMostPos = queueSize;
            while (queueSize > 0) {
                tmpNode = queue.poll();
                if(queueSize==leftMostPos)
                    leftMost = tmpNode.val;
                if (tmpNode.left != null) queue.add(tmpNode.left);
                if (tmpNode.right != null) queue.add(tmpNode.right);

                queueSize--;
            }
            queueSize = queue.size();
        }
        return leftMost;
    }
    public static void main(String[] args){
        int[] in = {1, 8, 2, 5, 10, 3, 9};
        // int[] in = {};
        TreeNode root = treeGen.gen(in);
        System.out.println(FindBottomLeftTreeValue513.findBottomLeftValue(root));


//        FindBottomLeftTreeValue513.findBottomLeftValue1(root);
        System.out.println(FindBottomLeftTreeValue513.findBottomLeftValueDFS(root));


    }
}
