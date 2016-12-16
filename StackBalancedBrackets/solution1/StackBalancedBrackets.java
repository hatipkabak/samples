import java.util.Scanner;
import java.util.Stack;

/**
 * Created by hatipkabak on 16/12/2016.
 */
public class StackBalancedBracket {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }


    public static boolean isBalanced(String expression) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch;

            ch = expression.charAt(i);

            if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || ch != stack.pop()) {
                    return false;
                }

            }

        }

        return stack.isEmpty();
    }


}

