/**
 * Created by Administrator on 2017/2/13.
 */
public class HanmmingDistance {


//        public int hammingDistance(int x, int y) {
//
//
//
//
//            return ;
//        }


    public int hammingDistance(int x, int y) {
        int num = 0;

        for (int i = 0; i < 32; i++) {
            int tmp = 1;
            tmp = tmp << i;
            if (tmp > x && tmp > y)
                break;
            if ((tmp & x) != (tmp & y))
                num++;
        }
        return num;
    }

    public static void main(String[] args) {
        HanmmingDistance hanmmingDistance = new HanmmingDistance();

        System.out.println(hanmmingDistance.hammingDistance(8, 1));


    }
}



