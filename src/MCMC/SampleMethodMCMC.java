package MCMC;




import java.util.*;

/**
 * Created by yangyanqi on 2017/11/14.
 */
public class SampleMethodMCMC {

    //Markov Chain Monte Carlo sampling
    public static List<String> mcmcSamples(Map<String, Integer> topicCorpus, int sampleSize) {
        Map<String, Integer> topicCorpusFunc = new HashMap<>(topicCorpus);
        int samples = sampleSize;
        Set<String> sampleSet = new HashSet<>();

        Map<Integer, String> indexWmap = new HashMap<>();
        int index = 0;
        for (String key : topicCorpusFunc.keySet()) {
            indexWmap.put(index++, key);
        }
        int corpusSize = topicCorpusFunc.size();
//        double x0_prime = Math.random();
        double x0_prime = 0.01;
        int randomIndex = (int) Math.round(x0_prime * (corpusSize - 1));

        //mcmc
        System.err.println("mcmc start..");
        int x0 = randomIndex;
        Random random = new Random();
        while (samples-- > 0) {
            //sample from proposal distribution
            //independent
            double gaussParameter = random.nextGaussian();
           // int xc = (int) Math.round((gaussParameter + 1) / 2 * (corpusSize - 1));
//            int xc = (int) Math.round(Math.random() * (corpusSize-1));
            // x0->x1
            //margin fix
            double xc_prime = (gaussParameter + 1 + x0_prime) / 2;
            int xc = (int)Math.round(xc_prime * (corpusSize - 1));
            if(xc<0)
                xc = 0;
            if(xc>corpusSize-1)
                xc = corpusSize-1;




            int x1;
            double x1_prime;
            double acceptance = 1;
            // calculate the acceptance
            try {
                acceptance = Math.min(1, (double) topicCorpusFunc.get(indexWmap.get(xc)) / (double) topicCorpusFunc.get(indexWmap.get(x0)));
            } catch (Exception e) {

            }
            double u = Math.random();
            if (acceptance >= 1 || acceptance > u) {
                x1 = xc;
                x1_prime = xc_prime;
                sampleSet.add(indexWmap.get(xc));
            } else {
                x1 = x0;
                x1_prime = x0_prime;
            }
            x0 = x1;
            x0_prime = x1_prime;
        }
        return new ArrayList<>(sampleSet);
    }





}
