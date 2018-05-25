package MCMC;



import com.szl.syj.cd.utils.CompareUtils;
import com.szl.syj.cd.utils.TextUtils;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/11/1.
 */


public class WordBag {
    private Map<String, Double> wordBag = new TreeMap<>();

    public void add(String word, Double score) {
        Integer integer = null;
        if (wordBag.keySet().contains(word)) {
            double tmpScore = wordBag.get(word);
            wordBag.put(word, tmpScore + score);
        } else {
            wordBag.put(word, score);
        }

    }

    public double getScore(String key) {
        return this.wordBag.get(key);
    }

    public Set<String> ketSet() {
        return this.wordBag.keySet();
    }

    public void sortByValues(boolean upDown) {
        if (upDown)
            this.wordBag = CompareUtils.sortByValues(wordBag, true);
        else
            this.wordBag = CompareUtils.sortByValues(wordBag, false);
    }
    public void writeDict(String path){
        TextUtils.writeMap(this.wordBag,path);
    }
}
