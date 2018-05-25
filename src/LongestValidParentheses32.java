import java.util.Stack;

/**
 * Created by Administrator on 2017/11/15.
 */
public class LongestValidParentheses32 {
    //todo
    public static int longestValidParentheses(String s) {
        s = s+"(";
        char[] chars = s.toCharArray();
        int length = 0;
        Stack<Character> stack = new Stack<>();
        for (char a : chars) {
            if (a == '(') {
                if (!stack.empty()) {
                    if (stack.pop() == ')') {
                        if (stack.size() == 1) {
                            length += 2;
                            stack.clear();

                        } else {
                            stack.clear();

                        }
                    }
                }
                stack.add(a);
                continue;
            }
            if (a == ')') {
                //out
                if (stack.empty())
                    continue;
                else
                    stack.add(a);
            }
        }
        return length;
    }

    public static void main(String[] args) {
//        String s = "()))()()()";
        String s = ")()())";
        int length = longestValidParentheses(s);

        System.out.println("123");

    }
}
