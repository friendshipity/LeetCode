import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/2/13.
 */
public class KeyboardRow500 {
    public String[] findWords(String[] words) {
        //System.out.println(Stream.of(words).getClass());
        return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }
    public static void main(String[] args){
        KeyboardRow500 keyboardRow500 = new KeyboardRow500();
        String[] in = {"Hello", "Alaska", "Dad", "Peace"};
        in=keyboardRow500.findWords(in);
        for(String word:in) {
            System.out.println(word);
        }
    }
}
