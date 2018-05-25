/**
 * Created by Administrator on 2017/2/13.
 */
public class NumberComplement476 {
    public int findComplement(int num) {

        int i=0;
        int out = 0;
        int tmp =1;
        while(tmp<num){
            int tmp2 = 1;
            tmp2 = tmp2<<i;
            if(tmp2>num)
                break;

            tmp = (~(tmp2 & num) )& tmp2;
            out = out|tmp;
            tmp = tmp2;
            i++;
        }
        return out;

    }

    public int findComplement2(int num)
    {
        int i = 0;
        int j = 0;

        while (i < num)
        {
            i +=(1<<j);
            j++;
        }
        return i - num;
    }


    public int test(int num){
        return num&1;
    }
    public static void main(String[] args){
        NumberComplement476 numberComplement476 = new NumberComplement476();

        long start = System.currentTimeMillis();
       // System.out.println(numberComplement476.findComplement2(0));
        long end = System.currentTimeMillis();
        System.out.println(numberComplement476.test(1));


    }
}
