/**
 * Created by Administrator on 2017/2/14.
 */
public class CountingBits338 {
    public int[] countBits(int num) {
        int i = 0;

        return null;
    }

    public int[] countBits2(int num) {
        int[] f = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            f[i] = f[i >> 1] + (i & 1);

            for (int j = 0; j < f.length; j++) {
                System.out.print(f[j]);
            }
            System.out.print("\n");

        }
        return f;
    }

    public static void main(String[] args) {
        CountingBits338 coutingBits = new CountingBits338();
        int[] out = coutingBits.countBits2(10);

        for (int i=0;i<out.length;i++) {
            System.out.println(out[i]);
        }
    }
}
