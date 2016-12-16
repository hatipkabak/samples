
import java.util.*;


public class StackBalancedBrackets {

    public static boolean isBalanced(String expression) {

        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
            if (ch == '}' || ch == ')' || ch == ']') {

                if(stack.isEmpty()){
                    return false;
                }
                char last = stack.pop();
                if (ch == '}' && last == '{' || ch == ')' && last == '(' || ch == ']' && last == '[')
                    continue;
                else{
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
