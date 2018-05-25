import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2018/1/8.
 */
public class ValidTriangleNumber611 {


    public int triangleNumber(int[] nums) {

        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int[] edges = new int[3];
            int pos1 = i;
            edges[0] = nums[i];
            for (int j = i; j < nums.length; j++) {
                int pos2 = -1;
                if (j != pos1) {
                    pos2 = j;
                    edges[1] = nums[j];
                    for (int k = j; k < nums.length; k++) {
                        if (pos2 > 0)
                            if (k != pos1 && k != pos2) {
                                edges[2] = nums[k];
                                // judgement
                                if (edges[0] + edges[1] > edges[2] && edges[1] + edges[2] > edges[0] && edges[0] + edges[2] > edges[1]) {
                                   // if(!resSet.contains(edges[0]*100+edges[1]*10+edges[2])) {
                                    int[] edges1 = new int[3];
                                    for(int p = 0;p<3;p++)
                                        edges1[p] = edges[p];
                                    res.add(edges1);
                                     //   resSet.add(edges[0] * 100 + edges[1] * 10 + edges[2]);
                                   // }
                                }
                            }
                    }
                }
            }
        }

        return res.size();
    }

    public static void main(String[] args) {
        int[] input = {2, 2, 3, 4};

        ValidTriangleNumber611 validTriangleNumber611 = new ValidTriangleNumber611();

        System.out.println(validTriangleNumber611.triangleNumber(input));

    }
}
