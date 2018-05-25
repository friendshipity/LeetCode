package myMethods;

/**
 * Created by Administrator on 2017/2/16.
 */
public class GarbageClean {

        public static void main(String[] args)
        {
            GarbageClean t = new GarbageClean();
            System.out.println(t.hashCode());

            t = null;
            System.out.println("end");
            // calling garbage collector
            System.gc();



        }

        @Override
        protected void finalize()
        {
            System.out.println("finalize method called");
        }

}
